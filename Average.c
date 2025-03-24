#include<stdio.h>

void main(){
    int n,i;
    float marks[30],sum=0,avg;
    printf("Enter the total Subjects");
    scanf("%d",&n);

    for(i=0;i<=n;i++){
        printf("Enter the marks gained in each Subjects:\n", i+1);
        scanf("%f",&marks[i]);
        sum=sum+marks[i];
    }
    avg= sum/n;
    printf("Average of the marks is:%.2f",avg);
}