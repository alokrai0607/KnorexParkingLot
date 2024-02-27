package parking.Main;

import java.util.ArrayList;
import java.util.List;

import parking.models.Floor;
import parking.models.ParkingLot;
import parking.models.Vehicle;
import parking.models.VehicleType;
import parking.services.ParkingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Floor> floors = new ArrayList<>();
		floors.add(new Floor(1, 10, 20, 5, 3));
		floors.add(new Floor(2, 15, 25, 8, 4));
		ParkingLot parkingLot = new ParkingLot(floors);

		ParkingService parkingService = new ParkingService(parkingLot);

		Vehicle car1 = new Vehicle(generateRandomVehicleNumber(), VehicleType.CAR, "Black", 2L);
		Vehicle car2 = new Vehicle(generateRandomVehicleNumber(), VehicleType.CAR, "White", 5L);
		parkingService.addVehicle(car1);
		parkingService.addVehicle(car2);

		double totalCost = parkingService.checkoutVehicle(car1.getRegistrationNumber(), System.currentTimeMillis());
		System.out.println("Total cost for vehicle " + car1.getRegistrationNumber() + ": " + totalCost);

		boolean isAvailable = parkingService.checkAvailability(1, VehicleType.CAR);
		System.out.println("Is space available for car on floor 1? " + isAvailable);
	}

	private static String generateRandomVehicleNumber() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			char randomChar = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
			sb.append(randomChar);
		}

		for (int i = 0; i < 4; i++) {
			sb.append((int) (Math.random() * 10));
		}
		return sb.toString();
	}

}
