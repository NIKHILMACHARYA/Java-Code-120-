#include<stdio.h>
void main(){
    float percent;
    printf("Enter the Percentage of the student:\n");
    scanf("%f", &percent);

    if(percent>=85){
        printf("Congratulations! Scored First class with Distinction");
    }
    else if(percent>=60 && percent<85){
                printf("Congratulations! Scored First class");

    }
    else if(percent>=45 && percent<60){
                printf("Congratulations! Scored Second class");
    }
    else if(percent>=35 && percent<45){
                printf("Congratulations! Scored Third class");
    }
    else{
        printf("Sorry,Failed. You need to improve...")
    }
}