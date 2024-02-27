package parking.models;

public class CostStrategy {
	public double calculateCost(long duration, VehicleType vehicleType) {
		double costPerHour;
		switch (vehicleType) {
		case CAR:
		case BIKE:
			costPerHour = 10;
			break;
		case BUS:
		case TRUCK:
			costPerHour = 30;
			break;
		default:
			throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
		}
		return costPerHour * duration;
	}
}
