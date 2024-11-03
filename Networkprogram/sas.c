#include <stdio.h>

struct students
{
   int reg_number;
   char name[20];
   char marks[8];
};

int main()
{
    struct students stud;
    float sum=0.0,average;
    printf("Enter the student registration number\n");
    scanf("%d", &stud.reg_number);
    printf("Enter the student name\n");
    scanf("%s", stud.name);
    printf("Enter the studentmarks\n");
    for(int i=0; i<8)
}