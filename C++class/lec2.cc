#include <iostream>
using namespace std;
int queue[100], n = 100, front = -1, rear = -1;
void enqueue(){
	int val;
	if (rear==n-1)
		cout<<"Queue overflow "<< endl;
	else{
		if (front == -1)
			front = 0;
		cout << "INsert the element in queue :" << endl;
		cin >> val;
		rear++;
		queue[rear] = val;
	}
}

void dequeue(){
	if (front == -1 || front > rear){
		cout << "Queue underflow";
		return;
	}
	else{
		cout << "Element detected froom queue is:" << queue[front] << endl;
		front++;
	}
}

void Display(){
	if (front == -1)
		cout << "Queue is empty" << endl;
	else{
		cout << "Queue elements are:";
		for (int i=front; i <= rear; i++)
			cout << queue[i] << " ";
		cout << endl;
	}
}

int main(){
	int cn;
	cout << "1)Insert element to queue" << endl;
	cout << "2)Delete element from queue" << endl;
	cout << "3)Display all the element of queue" << endl;
	cout << "4)Exit" << endl;
	do{
		cout << "Enter your choice:" << endl;

		cin >> cn;
		switch (cn){
			case 1:enqueue();
			       break;
			case 2: dequeue();
				break;
			case 3: Display();
				break;
			case 4: cout  << "Exit" << endl;
				break;
			default: cout << "Invalid choice " << endl;
		}
	}
	while (cn!=4);
	return 0;
}
