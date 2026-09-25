#include <stdio.h>

int linearSearch(int arr[], int n, int key, int index)
{
    if(index == n)
    {
        return -1;
    }

    if(arr[index] == key)
    {
        return index;
    }

    return linearSearch(arr, n, key, index + 1);
}
int main()
{
    int arr[] = {10,20,30,40,50};
    int n = 5;
    int key = 40;

    int result = linearSearch(arr, n, key, 0);

    if(result == -1)
        printf("Element not found");
    else
        printf("Element found at index %d", result);

    return 0;
}