#include <stdio.h>

void merge(int a[], int low, int mid, int high)
{
    int i = low;
    int j = mid + 1;
    int k = 0;
    int temp[100];

    // Merge two sorted parts
    while (i <= mid && j <= high)
    {
        if (a[i] <= a[j])
        {
            temp[k] = a[i];
            i++;
        }
        else
        {
            temp[k] = a[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements of left part
    while (i <= mid)
    {
        temp[k] = a[i];
        i++;
        k++;
    }

    // Copy remaining elements of right part
    while (j <= high)
    {
        temp[k] = a[j];
        j++;
        k++;
    }

    // Copy temp array back to original array
    for (i = low, k = 0; i <= high; i++, k++)
    {
        a[i] = temp[k];
    }
}

void mergesort(int a[], int low, int high)
{
    if (low < high)
    {
        int mid = (low + high) / 2;

        // Divide left part
        mergesort(a, low, mid);

        // Divide right part
        mergesort(a, mid + 1, high);

        // Merge both sorted parts
        merge(a, low, mid, high);
    }
}

int main()
{
    int a[100], n, i;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    printf("Enter elements: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    mergesort(a, 0, n - 1);

    printf("Sorted array: ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }

    return 0;
}