#include<stdio.h>
void main(){
    int i=1,sum=0;
    while(i<=10){
        printf("%d ",i);
        sum=sum+i;
        i++;
    }
    printf("\n Sum of First 10 numbers : %d",sum);
}