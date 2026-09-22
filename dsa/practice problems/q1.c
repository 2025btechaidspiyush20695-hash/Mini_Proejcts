/*write a program to make all zeros in an array in the left side from the whole array*/
/*here's the solution*/

#include <stdio.h>
int main() {
    int arr[] = {1, 8, 2, 0, 3, 0, 4};
    int n = sizeof(arr) / sizeof(arr[0]);
    int count = 0; // Count of non-zero elements

    // Traverse the array. If element is non-zero, then
    // replace the element at index 'count' with this element
    for (int i = 0; i < n; i++) {
        if (arr[i] != 0) {
            arr[count++] = arr[i]; // Increment count and place non-zero element
        }
    }

    // Now all non-zero elements have been shifted to the front
    // Fill remaining positions with zeros
    while (count < n) {
        arr[count++] = 0;
    }

    // Print the modified array
    printf("Modified array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}