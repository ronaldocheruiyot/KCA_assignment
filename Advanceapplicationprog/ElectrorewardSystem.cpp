#include <iostream>
#include <string>

using namespace std;

class Subscriber {
private:
    string name;
    string phoneNumber;
    double airtimeAmount;
    int bonusPoints;

public:
    // Constructor to initialize subscriber details
    Subscriber(string n, string phone, double airtime) : name(n), phoneNumber(phone), airtimeAmount(airtime) {
        bonusPoints = 0;  // Initialize bonus points to 0
    }

    // Method to compute bonus points based on airtime amount
    void compute_bonuspoints() {
        if (airtimeAmount >= 2000.0) {
            bonusPoints = 500;
        } else if (airtimeAmount >= 1000.0) {
            bonusPoints = 300;
        } else if (airtimeAmount >= 500.0) {
            bonusPoints = 100;
        } else if (airtimeAmount >= 100.0) {
            bonusPoints = 50;
        } else {
            bonusPoints = 0;
        }
    }

    // Method to display subscriber details and awarded points
    void display() const {
        cout << name << " (PHONE NO: " << phoneNumber << "): AWARDED " 
             << bonusPoints << " BONGA POINTS. STAY WITH SAFARICOM. THE BETTER OPTION!" << endl;
    }
};

int main() {
    string name, phoneNumber;
    double airtimeAmount;

    // Input subscriber details
    cout << "Enter Subscriber Name: ";
    getline(cin, name);

    cout << "Enter Phone Number: ";
    getline(cin, phoneNumber);

    cout << "Enter Airtime Amount: ";
    cin >> airtimeAmount;

    // Create Subscriber object
    Subscriber subscriber(name, phoneNumber, airtimeAmount);
    
    // Compute and display bonus points
    subscriber.compute_bonuspoints();
    subscriber.display();

    return 0;
}

