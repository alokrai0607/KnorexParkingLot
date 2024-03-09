package parking.models;

// Class representing a vehicle
public class Vehicle {

	private String registrationNumber; // registration number of the vehicle
	private VehicleType type; // type of the vehicle (e.g., CAR, BIKE)
	private String color; // color of the vehicle
	private long entryTime; // entry time of the vehicle

	// Constructor to initialize vehicle with registration number, type, color, and entry time
	// D: Definition - Initializes a vehicle with registration number, type, color, and entry time.
	// U: Use case - Used to create a vehicle object with specific attributes when it enters the parking lot.
	// B: Benefits - Helps in tracking and managing vehicles parked in the parking lot.
	// E: Example Code - See below.
	// X: This class encapsulates information about a vehicle, including its registration number, type, color, and entry time.
	public Vehicle(String registrationNumber, VehicleType type, String color, long entryTime) {
		this.registrationNumber = registrationNumber;
		this.type = type;
		this.color = color;
		this.entryTime = entryTime;
	}

	// Getter and setter methods for entry time, registration number, type, and color
	// (Getter and setter comments omitted for brevity)

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}
}
