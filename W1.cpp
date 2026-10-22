// Savannah Steele
// Period 3
// C++ Week 1

#include <iostream>

int main() {
    // Output: Welcome message
    std::cout << "=== Interactive Number Summation Program ===" << std::endl;
    std::cout << "Enter positive integers to add them to the sum." << std::endl;
    std::cout << "Enter 0 to quit the program." << std::endl;
    std::cout << "--------------------------------------------" << std::endl;

    int totalSum = 0;
    int userInput;

    // Loop: Keeps running until the user types 0 to quit
    while (true) {
        std::cout << "Enter a number: ";
        
        // Input: Read number from the keyboard
        std::cin >> userInput;

        // Conditionals: Evaluate the user's input
        if (userInput == 0) {
            // Exit condition met
            std::cout << "Exiting the loop..." << std::endl;
            break; 
        } 
        else if (userInput < 0) {
            // Error handling condition
            std::cout << "Error: Negative numbers are not allowed. Try again!" << std::endl;
        } 
        else {
            // Valid data processing condition
            totalSum += userInput;
            std::cout << "Current Sum: " << totalSum << std::endl;
        }
    }

    // Output: Final results
    std::cout << "--------------------------------------------" << std::endl;
    std::cout << "Final Total Sum: " << totalSum << std::endl;
    std::cout << "Thank you for using the program!" << std::endl;

    return 0;
}

