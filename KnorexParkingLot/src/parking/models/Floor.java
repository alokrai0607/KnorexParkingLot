package parking.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class representing a floor in a parking lot
public class Floor {

	private int floorNumber; // floor number
	private List<VehicleSpace> spaces; // list of vehicle spaces on the floor
	private Map<VehicleType, Integer> capacityMap; // map representing capacity of different vehicle types on the floor

	// Constructor to initialize floor number and capacities for different vehicle types
	// D: Definition - Initializes a floor with a specific number and capacities for different vehicle types.
	// U: Use case - Used to create a floor in a parking lot with specified capacities for each vehicle type.
	// B: Benefits - Helps in organizing and managing parking spaces efficiently by specifying capacities for each vehicle type.
	// E: Example Code - See below.
	// X: This class encapsulates information about a floor in a parking lot, including its number and capacities for various vehicle types.
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

	public List<VehicleSpace> getSpaces() {
		return spaces;
	}

	public void setSpaces(List<VehicleSpace> spaces) {
		this.spaces = spaces;
	}

	public Map<VehicleType, Integer> getCapacityMap() {
		return capacityMap;
	}

	public void setCapacityMap(Map<VehicleType, Integer> capacityMap) {
		this.capacityMap = capacityMap;
	}
}
