#include<stdio.h>

void swapnumber(int *a, int *b){
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

void main(){
    int num1,num2;
    printf("Enter the two numbers:\n");
    scanf("%d\n, %d",&num1, &num2);
    printf("Before Swapping the numbers:%d\n%d",num1,num2);

    swapnumber(&num1,&num2);

    printf("After Swapping the numbers:%d\n%d",num1,num2);
}