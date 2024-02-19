#include <iostream>

using namespace std;
class shape
{
	private:
		int length;
		int width;
	public:
		void getinfo();
		void Area();
};
void shape::getinfo()
{
	cout << "Enter the length: " << endl;
	cin >> length;
	cout << "Enter the width: " << endl;
	cin >> width;
}

void shape::Area()
{
	cout << "The area is " << width*length << endl;
}

int main()
{
	shape A;
	A.getinfo();
	A.Area();
	return 0;
}

