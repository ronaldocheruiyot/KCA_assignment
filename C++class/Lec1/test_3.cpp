#include <iostream>
using namespace std;
int main(){
	char grade;
	cout << ("Enter the grade") << endl;
	cin >> grade;
	switch (grade){
		case 'A':
			cout << ("Excellent") << endl;
			break;
		case 'B':
			cout << ("Good work") << endl;
			break;
		case 'C':
			cout << ("Pass mark") << endl;
			break;
		default:
			cout << ("You need to improve") << endl;
	}
	return 0;
}
