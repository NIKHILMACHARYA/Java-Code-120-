#include<stdio.h>

void main(){
    int num,sum=0,rev=0,d,x;
    printf("Enter the number:");
    scanf("%d",&num);
    x=num;

    while(num){
        d=num%10;
        num=num/10;
        sum=sum+d;
        rev=rev*10+d;
    }
    
    printf("\nSum of digits : %d",sum);
    printf("\nReverse of the number : %d",rev);
   
    if(x==rev){
        printf("\n The number is Palindrome");
    }else{
        printf("\nThe number is not a Palindrom");
    }
}
