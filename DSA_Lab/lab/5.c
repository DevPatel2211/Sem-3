// Linked List program

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

void main()
{
    struct Node *First, *Second, *Third, *START;

    First = (struct Node *)malloc(sizeof(struct Node));
    Second = (struct Node *)malloc(sizeof(struct Node));
    Third = (struct Node *)malloc(sizeof(struct Node));

    First->data = 10;
    First->next = Second;
    Second->data = 20;
    Second->next = Third;
    Third->data = 30;
    Third->next = NULL;

    START = First;
}