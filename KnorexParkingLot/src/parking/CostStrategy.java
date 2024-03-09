package parking;

// Interface representing a strategy for calculating parking cost
public interface CostStrategy {

    // Method to calculate the parking cost based on duration
    // D: Definition - Calculates the cost of parking based on duration.
    // U: Use case - Used to determine the cost a vehicle incurs for parking based on the duration it occupies the parking space.
    // B: Benefits - Provides a flexible way to adjust parking costs based on different duration-based strategies.
    // E: Example Code - See below.
    // X: This interface defines a contract for implementing various strategies to calculate parking costs.
    double calculateCost(long duration);
}
