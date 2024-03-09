package parking.Main;

import java.util.ArrayList;
import java.util.List;

import parking.models.Floor;
import parking.models.ParkingLot;
import parking.models.Vehicle;
import parking.models.VehicleType;
import parking.services.ParkingService;

// Main class for parking lot simulation
public class Main {

	// Main method to run the parking lot simulation
	public static void main(String[] args) {

		// Create a list of floors
		List<Floor> floors = new ArrayList<>();
		floors.add(new Floor(1, 10, 20, 5, 3)); // Add floor 1 with capacities for different vehicle types
		floors.add(new Floor(2, 15, 25, 8, 4)); // Add floor 2 with capacities for different vehicle types

		// Create a parking lot with the list of floors
		ParkingLot parkingLot = new ParkingLot(floors);

		// Create a parking service with the parking lot
		ParkingService parkingService = new ParkingService(parkingLot);

		// Generate sample vehicles
		Vehicle car1 = new Vehicle(generateRandomVehicleNumber(), VehicleType.CAR, "Black", 2L); // Create car 1
		Vehicle car2 = new Vehicle(generateRandomVehicleNumber(), VehicleType.CAR, "White", 5L); // Create car 2

		// Park the sample vehicles
		parkingService.addVehicle(car1); // Park car 1
		parkingService.addVehicle(car2); // Park car 2

		// Check out a vehicle and calculate the total cost
		double totalCost = parkingService.checkoutVehicle(car1.getRegistrationNumber(), System.currentTimeMillis());
		System.out.println("Total cost for vehicle " + car1.getRegistrationNumber() + ": " + totalCost);

		// Check availability of parking space for a vehicle type on a specific floor
		boolean isAvailable = parkingService.checkAvailability(1, VehicleType.CAR); // Check availability of car space on floor 1
		System.out.println("Is space available for car on floor 1? " + isAvailable);
	}

	// Method to generate a random vehicle number
	private static String generateRandomVehicleNumber() {
		StringBuilder sb = new StringBuilder();

		// Generate random characters for the vehicle number
		for (int i = 0; i < 10; i++) {
			char randomChar = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
			sb.append(randomChar);
		}

		// Generate random digits for the vehicle number
		for (int i = 0; i < 4; i++) {
			sb.append((int) (Math.random() * 10));
		}
		return sb.toString();
	}
}
