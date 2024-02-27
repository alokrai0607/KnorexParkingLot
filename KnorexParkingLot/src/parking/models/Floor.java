package parking.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
	private int floorNumber;
	private List<VehicleSpace> spaces;
	private Map<VehicleType, Integer> capacityMap;

	public Floor(int floorNumber, int carCapacity, int bikeCapacity, int busCapacity, int truckCapacity) {
		this.floorNumber = floorNumber;
		capacityMap = new HashMap<>();
		capacityMap.put(VehicleType.CAR, carCapacity);
		capacityMap.put(VehicleType.BIKE, bikeCapacity);
		capacityMap.put(VehicleType.BUS, busCapacity);
		capacityMap.put(VehicleType.TRUCK, truckCapacity);
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Map<VehicleType, Integer> getCapacityMap() {
		return capacityMap;
	}

	public void setCapacityMap(Map<VehicleType, Integer> capacityMap) {
		this.capacityMap = capacityMap;
	}

	public List<VehicleSpace> getSpaces() {
		return spaces;
	}

	public void setSpaces(List<VehicleSpace> spaces) {
		this.spaces = spaces;
	}

}
