// Savannah Steele
// Period 3
// Week 2 C++

#include <iostream>
#include <string>

int main() {
std::string userInput;
while(true) {
    std::cout << "Hi! ";
    std::cin >> userInput;

    if (userInput == "stop") {
        break;
    }
    else {
        continue;
    }
}
}