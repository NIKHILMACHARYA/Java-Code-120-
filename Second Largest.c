#include<stdio.h>
int second_largest_element(int arr[], int size){
    int first_largst,second_largest,i;
    if(size<2){
        printf("Error: Array has less than 2 elements!");
        return 0;
    }
    for(i=0;i<size;i++){
        if(first_largst<arr[i]){
            second_largest=first_largst;
            first_largst=arr[i];
        }
        else if(
            arr[i]!= first_largst && second_largest < arr[i] &&
            second_largest<first_largst)
                second_largest=arr[i];
     }
    return second_largest;
}

void main(){
     int size, index;
     printf("Enter the size of array:");
     scanf("%d",&size);
     int arr[size];
     printf("Enter the array elements:\n");
     for(index=0; index<size; index++){
        scanf("%d",&arr[index]);
     }
     printf("Second largest Element is : %d", second_largest_element(arr,size));

}