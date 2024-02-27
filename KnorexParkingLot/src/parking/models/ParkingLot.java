package parking.models;

import java.util.List;

public class ParkingLot {
	private List<Floor> floors;

	public ParkingLot(List<Floor> floors) {
		this.floors = floors;
	}

	public boolean isSpaceAvailable(int floorNumber, VehicleType type) {
		Floor floor = getFloor(floorNumber);
		if (floor == null) {
			throw new IllegalArgumentException("Invalid floor number: " + floorNumber);
		}
		for (VehicleSpace space : floor.getSpaces()) {
			if (space.getType() == type && space.isAvailable()) {
				return true;
			}
		}
		return false;
	}

	public void parkVehicle(Vehicle vehicle) {
		for (Floor floor : floors) {
			for (VehicleSpace space : floor.getSpaces()) {
				if (space.isAvailable() && space.getType() == vehicle.getType()) {

					return;
				}
			}
		}
		throw new IllegalStateException("No available space for vehicle type: " + vehicle.getType());
	}

	public double removeVehicle(String registrationNumber, long endTime) {
		double parkingFee = 0;

		for (Floor floor : floors) {
			for (VehicleSpace space : floor.getSpaces()) {
				if (!space.isAvailable() && space.getVehicle().getRegistrationNumber().equals(registrationNumber)) {

					long duration = endTime - space.getVehicle().getEntryTime();

					CostStrategy costStrategy = new CostStrategy();
					parkingFee = costStrategy.calculateCost(duration, space.getType());

					space.setAvailable(true);
					return parkingFee;
				}
			}
		}
		throw new IllegalArgumentException(
				"Vehicle with registration number " + registrationNumber + " not found in parking lot.");
	}

	private Floor getFloor(int floorNumber) {
		for (Floor floor : floors) {
			if (floor.getFloorNumber() == floorNumber) {
				return floor;
			}
		}
		return null;
	}

}