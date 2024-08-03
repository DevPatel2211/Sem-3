// Find the 2nd largest element

#include <stdio.h>

int main()
{
    // For Self Defining Array Size
    int n;
    int i, largest, sec_largest;
    int number;
    int flag = 0;

    printf("N : ");
    scanf("%d", &n);
    int arr[n];

    // For Input
    for (int i = 0; i < n; i++)
    {
        printf("Enter %d : ", i + 1);
        scanf("%d", &arr[i]);
    }

    largest = arr[0];
    sec_largest = arr[1];

    for (int i = 0; i < n; i++)
    {
        if (largest <= arr[i])
        {
            int temp = largest;
            largest = arr[i];
            sec_largest = temp;
        }
    }
    printf("The second largest number : %d", sec_largest);
}