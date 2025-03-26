#include <stdio.h>
#include <limits.h>

int second_largest_element(int arr[], int size) {
    int first_largest = INT_MIN, second_largest = INT_MIN, i;

    if (size < 2) {
        printf("Error: Array has less than 2 elements!\n");
        return -1; // Return -1 to indicate error
    }

    for (i = 0; i < size; i++) {
        if (arr[i] > first_largest) {
            second_largest = first_largest; // Update second largest
            first_largest = arr[i]; // Update first largest
        } else if (arr[i] > second_largest && arr[i] != first_largest) {
            second_largest = arr[i]; // Update second largest
        }
    }

    if (second_largest == INT_MIN) {
        printf("There is no second largest element (all elements may be equal).\n");
        return -1; // Return -1 to indicate error
    }

    return second_largest;
}

int main() {
    int size, index;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    if (size < 2) {
        printf("Error: Array must have at least 2 elements.\n");
        return 1; // Exit with an error code
    }

    int arr[size];
    printf("Enter the array elements:\n");
    for (index = 0; index < size; index++) {
        scanf("%d", &arr[index]);
    }

    int result = second_largest_element(arr, size);
    if (result != -1) {
        printf("Second largest element is: %d\n", result);
    }
    
    return 0; // Return 0 to indicate successful completion
}
