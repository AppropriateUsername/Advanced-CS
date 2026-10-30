#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int writing() {
    ofstream outFile("firstFile.txt");

    if (outFile.is_open()) {
        outFile << "Hello, World!\n";
        outFile << "Second line\n";
        outFile.close();
    } else {
        cout << "Error opening file for writing.\n";
    }
int reading() {
    ifstream inFile("firstFile.txt");
    string line;

    if (inFile.is_open()) {
        while (getline(inFile, line)) {
            cout << line << '\n';
        }
        inFile.close();
    } else {
        cout << "Error opening file for reading.\n";
}
    }

        


