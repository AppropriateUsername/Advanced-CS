#include <iostream>
#include <string>

class Car {
    public:
    std::string brand;
    int year;
    void honk() {
        std::cout << brand << "says: Beep beep!\n";
    }
};

int main() {
    Car myCar;
    myCar.brand = "Toyota ";
    myCar.year = 2024;
    myCar.honk();

    return 0;
}
