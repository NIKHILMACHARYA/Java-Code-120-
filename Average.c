#include<stdio.h>

void main(){
    int n,i;
    float marks[30],sum=0,avg;
    printf("Enter the total Subjects:\n");
    scanf("%d",&n);
    
    printf("Enter the marks gained in each Subjects:\n", i+1);
    for(i=1;i<=n;i++){
        scanf("%f",&marks[i]);
        sum=sum+marks[i];
    }
    avg= sum/n;
    printf("Average of the marks is:%.2f",avg);
}
