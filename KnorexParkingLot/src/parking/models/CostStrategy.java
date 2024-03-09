package parking.models;

// Class representing the strategy for calculating parking cost
public class CostStrategy {

	// Method to calculate the parking cost based on duration and vehicle type
	// D: Definition - Calculates the cost of parking based on duration and vehicle type.
	// U: Use case - Used to determine the cost a vehicle incurs for parking in a parking lot.
	// B: Benefits - Provides a flexible way to adjust parking costs based on vehicle type.
	// E: Example Code - See below.
	// X: This class follows the strategy design pattern, allowing easy extension for different cost calculation methods.
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
