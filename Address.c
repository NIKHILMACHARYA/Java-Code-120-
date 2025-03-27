#include<stdio.h>
void main(){
    int marks[3][2]={85,98,79, 88,90,65};
    printf("Address of First row First column element : %d \n",marks[0][0]);
    printf("Address of First row Second column element : %d \n",marks[0][1]);
    printf("Address of Second row First column element : %d \n",marks[1][0]);
    printf("Address of Second row Second column element : %d \n",marks[1][1]);
    printf("Address of Third row First column element : %d \n",marks[2][0]);
    printf("Address of Third row Second column element : %d \n",marks[2][1]);

}