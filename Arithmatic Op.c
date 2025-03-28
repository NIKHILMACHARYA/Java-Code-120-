#include<stdio.h>
void main(){
    int a,b,c,choice;
    printf("Enter two numbers:\n");
    scanf("%d %d",&a,&b);
    printf("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Largest of two Numbers\n\n");
    printf("Enter your choice :");
    scanf("%d",&choice);
    
    switch(choice){
        case 1: c=a+b;
                printf("Addition of 2 number is :%d",c );
                break;
        case 2: c=a-b;
                printf("Subtraction of 2 number is :%d",c );
                break;
        case 3: c=a*b;
                printf("Multipication of 2 number is :%d",c );
                break;
        case 4: if(b!=0){
                   c=a/b;
                    printf("Division of 2 number is :%d",c );
                }else{
                    printf("\n Division by zero is not allowed!");
                }
                break; 
        case 5: if(a>b){
                    printf("%d is Largest",a );
                }else if(b>a){
                    printf("%d is Largest",b );    
                }else{
                    printf("Both the numbers are equal");
                }
                break;             
        default:printf("Invalid choice! please enter correct number...");                   
    }
}