#include <iostream>
using namespace std;
int main(){
	int num;
	cout<<("Enter the number ")<<endl;
	cin >> num;

	if (num > 0)
	{
		cout << ("This is a positive number") << endl;
	}
	else if (num  < 0)
	{
		cout << ("THis number is negative") << endl;
	}
	else
	{
		cout << ("this is number is zero") << endl;
	}

	return 0;
}

