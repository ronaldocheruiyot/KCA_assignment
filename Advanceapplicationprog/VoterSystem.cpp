#include <iostream>
#include <string>

using namespace std;

class Voter {
private:
    string voterCardID;
    string nationalID;
    string firstName;
    string middleName;
    string surname;
    string pollingStation;
    string dateOfBirth;
    char gender;

public:
    // Method to add voter details
    void addVoterDetails() {
        cout << "Enter Voter Card ID: ";
        getline(cin, voterCardID);
        
        cout << "Enter National ID Number: ";
        getline(cin, nationalID);

        cout << "Enter First Name: ";
        getline(cin, firstName);

        cout << "Enter Middle Name: ";
        getline(cin, middleName);

        cout << "Enter Surname: ";
        getline(cin, surname);

        cout << "Enter Polling Station: ";
        getline(cin, pollingStation);

        cout << "Enter Date of Birth (dd-mm-yyyy): ";
        getline(cin, dateOfBirth);

        cout << "Enter Gender (M/F): ";
        cin >> gender;
        cin.ignore(); // Ignore the newline character left in the buffer
    }

    // Method to display voter details
    void displayVoterDetails() const {
        cout << "\nVoter Details:" << endl;
        cout << "Voter Card ID: " << voterCardID << endl;
        cout << "National ID: " << nationalID << endl;
        cout << "Name: " << firstName << " " << middleName << " " << surname << endl;
        cout << "Polling Station: " << pollingStation << endl;
        cout << "Date of Birth: " << dateOfBirth << endl;
        cout << "Gender: " << (gender == 'M' ? "Male" : "Female") << endl;
    }
};

int main() {
    Voter voter;
    cout << "Enter details for a new voter:\n";
    voter.addVoterDetails();
    
    cout << "\nDisplaying Voter Details:\n";
    voter.displayVoterDetails();

    return 0;
}

