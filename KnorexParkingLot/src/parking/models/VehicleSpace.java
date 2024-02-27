package parking.models;

public class VehicleSpace {
	private int spaceNumber;
	private boolean isAvailable;
	private VehicleType type;
	private Vehicle vehicle;

	public VehicleSpace(int spaceNumber) {
		this.spaceNumber = spaceNumber;
		this.isAvailable = true;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getSpaceNumber() {
		return spaceNumber;
	}

	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

}