package parking.models;

// Class representing a parking space for a vehicle
public class VehicleSpace {

	private int spaceNumber; // space number of the parking space
	private boolean isAvailable; // flag indicating if the space is available
	private VehicleType type; // type of vehicle that can occupy the space
	private Vehicle vehicle; // vehicle currently parked in the space (if any)

	// Constructor to initialize a parking space with a space number
	// D: Definition - Initializes a parking space with a specific space number.
	// U: Use case - Used to create a parking space with a unique identifier within the parking lot.
	// B: Benefits - Provides a means to uniquely identify each parking space in the parking lot.
	// E: Example Code - See below.
	// X: This class represents a parking space, which can be occupied by a vehicle and has attributes such as space number and availability.
	public VehicleSpace(int spaceNumber) {
		this.spaceNumber = spaceNumber;
		this.isAvailable = true;
	}

	// Getter and setter methods for vehicle, space number, availability, and vehicle type
	// (Getter and setter comments omitted for brevity)

	public int getSpaceNumber() {
		return spaceNumber;
	}

	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
