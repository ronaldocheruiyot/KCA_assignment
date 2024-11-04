#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

class Subject {
public:
    string subject_name;
    int marks;
    char grade;

    Subject(string name, int m) : subject_name(name), marks(m) {
        grade = calculate_grade(marks);
    }

    char calculate_grade(int marks) {
        if (marks >= 70) return 'A';
        if (marks >= 60) return 'B';
        if (marks >= 50) return 'C';
        if (marks >= 40) return 'D';
        return 'F';
    }
};

class Student {
public:
    int student_id;
    string first_name, last_name, course;
    int year_of_study;
    vector<Subject> subjects;

    Student(int id, string fname, string lname, string crs, int year) 
        : student_id(id), first_name(fname), last_name(lname), course(crs), year_of_study(year) {}

    void add_subject(string subject_name, int marks) {
        subjects.push_back(Subject(subject_name, marks));
    }

    void show_result_slip() const {
        cout << "\nSTUDENT RESULT SLIP\n";
        cout << "ID: " << student_id << "\nName: " << first_name << " " << last_name;
        cout << "\nCourse: " << course << "\nYear: " << year_of_study << endl;
        cout << "\nSUBJECTS:\n";
        cout << left << setw(20) << "Subject" << setw(10) << "Marks" << "Grade\n";
        for (const auto &subject : subjects) {
            cout << left << setw(20) << subject.subject_name << setw(10) << subject.marks << subject.grade << endl;
        }
    }
};

int main() {
    int id, year, num_subjects, marks;
    string fname, lname, course, subject_name;

    // Get student details from user
    cout << "Enter Student ID: ";
    cin >> id;
    cout << "Enter First Name: ";
    cin >> fname;
    cout << "Enter Last Name: ";
    cin >> lname;
    cout << "Enter Course: ";
    cin.ignore();
    getline(cin, course);
    cout << "Enter Year of Study: ";
    cin >> year;

    // Create Student object with entered details
    Student student(id, fname, lname, course, year);
    cout << "Enter number of subjects: ";
    cin >> num_subjects;
    cin.ignore();  // Clear newline character left in buffer

    for (int i = 0; i < num_subjects; ++i) {
        cout << "Enter subject name: ";
        getline(cin, subject_name); // Use getline to capture full subject name
        cout << "Enter marks for " << subject_name << ": ";
        cin >> marks;
        cin.ignore();  // Clear newline character after entering marks
        student.add_subject(subject_name, marks);
    }

    student.show_result_slip();

    return 0;
}

