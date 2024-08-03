// Array scan & Reverse Print

#include <stdio.h>

int main()
{
    // For Self Defining Array Size
    int n;
    scanf("%d", &n);
    int arr[n];

    // For Input
    for (int i = 0; i < n; i++)
    {
        printf("Enter %d : ", i + 1);
        scanf("%d", &arr[i]);
    }

    // For Output
    for (int i = n - 1; i >= 0; i--)
    {
        printf("%d ", arr[i]);
    }
}