// Array scan & searching element in an array weather it's exist or not+++++++++++++++++++++++++++++++++++++++++++++++

#include <stdio.h>

int main()
{
    // For Self Defining Array Size
    int n;
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

    printf("Number check : ");
    scanf("%d", &number);

    // For Output weather number is exist in array or not
    for (int i = n - 1; i >= 0; i--)
    {
        if (arr[i] == number)
        {
            printf("%d is exist in array on %d position", number, i + 1);
            break;
        }
        else
        {
            flag = 1;
        }
    }
    if (flag == 1)
    {
        printf("%d is not exist in array", number);
    }
}