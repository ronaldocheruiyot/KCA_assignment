#include <stdio.h>
#include <cstdlib>
#include <iostream>

using namespace std;
typedef struct Node {
	int data;
	struct Node* left;
	struct Node* right;
} Node;

Node* createNode (int data){
	// creates new node
	Node* newNode = new Node;
	if (newNode == NULL)
	{
		cout << "error in allocation";
		exit(-1);
	}
	else
	{
		newNode->data = data;
		newNode->left = NULL;
		newNode->right = NULL;
		return newNode;
	}
}

Node* insert(Node* root, int data){
	// insert data into Node 
	if (root == NULL)
	{
		 root = createNode(data);
	}
	else if (data < root->data)
	{
		root->left = insert(root->left, data);
	}
	else
	{
		root->right = insert(root->right, data);
	}
	return root;
}


void inorder(Node* root)
{
	// inorder transversal print out
	if (root != NULL)
	{
		inorder(root->left);
		cout <<  root->data << " ";
		inorder(root->right);
	}
}

int main(){
	Node* root = NULL;
	root = insert(root, 50);
	insert(root,30);
	insert(root,20);
	insert(root,40);
	insert(root,70);
	insert(root,60);
	insert(root,80);
	inorder(root);
	cout << endl;
	return (0);
}

