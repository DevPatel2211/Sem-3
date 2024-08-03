#include <stdlib.h>
#include <stdio.h>

struct node
{
    int data;
    struct node *next;
};
void traverse(struct node *first)
{
    struct node *current = first;
    while (current != NULL)
    {
        printf("%d \n", current->data);
        current = current->next;
    }
};

void main()
{

    struct node *first, *second, *third, *start;

    first = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));

    first->data = 10;
    first->next = second;
    second->data = 20;
    second->next = third;
    third->data = 30;
    third->next = NULL;
    start = first;
    traverse(start);
}