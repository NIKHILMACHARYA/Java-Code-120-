#include<stdio.h>
void main(){
    int num,digit,sum=0;
    printf("Enter the number:");
    scanf("%d",&num);

    while(num>0){
        digit=num%10;
        sum=sum+digit;
        num=num/10;
    }
    printf("\nThe Sum of the digits of entered number is : %d",sum);
}
