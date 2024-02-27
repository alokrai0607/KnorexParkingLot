package parking.models;

import java.time.format.DateTimeFormatter;

public class Vehicle {
    private String registrationNumber;
    private VehicleType type;
    private String color;
    private long entryTime;

 

	public Vehicle(String registrationNumber, VehicleType type, String color, long entryTime) {
		super();
		this.registrationNumber = registrationNumber;
		this.type = type;
		this.color = color;
		this.entryTime = entryTime;
	}

	
	public long getEntryTime() {
		return entryTime;
	}


	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}


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

    
}
