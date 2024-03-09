
# KnorexParkingLot

This Java project implements a car parking system that can accommodate different types of vehicles and supports configurable cost strategies.

## Features

- Initialize the parking lot with a given number of floors and car spaces per floor.
- Add vehicle details to the parking lot, including the vehicle type, registration number, and color.
- Remove a vehicle from the parking lot based on the registration number.
- Check the availability of vehicle spaces on a specific floor for a given vehicle type.

## Usage

1. **Initialization**: Initialize the parking lot with the desired number of floors and vehicle spaces per floor for each vehicle type.

2. **Add Vehicle**: Add a vehicle to the parking lot by providing its type, registration number, color, and the floor number to park on.

3. **Remove Vehicle**: Remove a vehicle from the parking lot by specifying its registration number.

4. **Check Availability**: Check the availability of vehicle spaces on a specific floor for a given vehicle type.

## Implementation Details

- The project is organized into packages, each representing different aspects of the parking lot system, such as `parkinglot`, `coststrategy`, etc.

- The main functionality is implemented in classes such as `ParkingLot`, `Vehicle`, `Floor`, and `VehicleSpace`.

- A `CostStrategy` class is provided for implementing various cost strategies for parking fees.

- The code is designed to be easily extensible, allowing for the addition of new vehicle types or cost strategies with minimal changes.

- Error handling is implemented to handle cases such as full parking capacity.

## How to Run

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile and run the `Main` class to execute the car parking system.
4. Follow the on-screen prompts to interact with the parking lot functionalities.

## Contributing

* Contributions are welcome! If you have any suggestions or find any issues, please open an issue or submit a pull request.


