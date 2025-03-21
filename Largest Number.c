#include<stdio.h>
void main(){
    int num1,num2,num3;
    printf("Enter any 3 numbers:\n");
    scanf("%d\n %d\n %d\n",&num1,&num2,&num3);
    
    if(num1>=num2 && num1>=num3){
        printf("%d is the Largest number",num1);
    }
    else if(num2>=num3){
        printf("%d is the Largest number",num2);
    }
    else{
        printf("%d is the Largest number",num3);

    }
}