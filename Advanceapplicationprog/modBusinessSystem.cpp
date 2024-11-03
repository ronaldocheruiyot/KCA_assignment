#include <iostream>
#include <string>
#include <iomanip> // For std::setprecision and std::fixed

using namespace std;

class Employee {
private:
    int id_number;
    string first_name;
    string second_name;
    string surname;
    char gender; // 'M' or 'F'
    string date_of_birth; // in the format 'dd-mm-yyyy'
    float basic_salary;

public:
    // Constructor to initialize the attributes
    Employee(int id, string fName, string sName, string sName2, char gen, string dob, float salary) 
        : id_number(id), first_name(fName), second_name(sName), surname(sName2), gender(gen), date_of_birth(dob), basic_salary(salary) {}

    // Friend function to compute pension contribution
    friend float compute_pension(const Employee& emp);

    // Method to display employee information
    void show_employee() const {
        cout << "EMPLOYEE DETAILS" << endl;
        cout << "ID NUMBER          : " << id_number << endl;
        cout << "FIRST NAME         : " << first_name << endl;
        cout << "SECOND NAME        : " << second_name << endl;
        cout << "SURNAME            : " << surname << endl;
        cout << "GENDER             : " << gender << endl;
        cout << "DATE OF BIRTH      : " << date_of_birth << endl;
        cout << "BASIC SALARY Ksh.  : " << fixed << setprecision(2) << basic_salary << endl;
        cout << "PENSION CONTRIBUTION: Ksh. " << fixed << setprecision(2) << compute_pension(*this) << endl;
    }
};

// Friend function to calculate 5% pension contribution
float compute_pension(const Employee& emp) {
    return emp.basic_salary * 0.05;
}

int main() {
    int id;
    string fName, sName, sName2, dob;
    char gen;
    float salary;

    // Input employee details from the user
    cout << "Enter ID Number: ";
    cin >> id;
    cin.ignore(); // To ignore the newline character after reading an integer

    cout << "Enter First Name: ";
    getline(cin, fName);

    cout << "Enter Second Name: ";
    getline(cin, sName);

    cout << "Enter Surname: ";
    getline(cin, sName2);

    cout << "Enter Gender (M/F): ";
    cin >> gen;
    cin.ignore(); // To ignore the newline character after reading a char

    cout << "Enter Date of Birth (dd-mm-yyyy): ";
    getline(cin, dob);

    cout << "Enter Basic Salary: ";
    cin >> salary;

    // Create an Employee object with user-provided details
    Employee emp_obj(id, fName, sName, sName2, gen, dob, salary);

    // Show employee details including pension contribution
    emp_obj.show_employee();

    return 0;
}

