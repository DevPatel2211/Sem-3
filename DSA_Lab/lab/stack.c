// Process we need to follow in order to make Stack -->
// 1.Define Stack
// 2.Initialize Stack
// 3.Check if Stack is empty
// 4.Check if Stack is full
// 5.Push element into the Stack
// 6.Pop element into the Stack
// 7.Main Function

#include <stdio.h>
#include <stdbool.h>

#define MAX_SIZE 100

// 1
struct Stack
{
    int items[MAX_SIZE];
    int top;
};

// 2
void initialize(struct Stack *stack)
{
    stack->top = -1; // Initialize the top index to -1 (empty stack)
}

// 3
bool isEmpty(struct Stack *stack)
{
    return stack->top == -1;
}

// 4
bool isFull(struct Stack *stack)
{
    return stack->top == MAX_SIZE - 1;
}

// 5
void push(struct Stack *stack, int value)
{
    if (isFull(stack))
    {
        printf("Stack is full. Cannot push %d.\n", value);
    }
    else
    {
        stack->top++;
        stack->items[stack->top] = value;
    }
}

// 6
int pop(struct Stack *stack)
{
    if (isEmpty(stack))
    {
        printf("Stack is empty. Cannot pop.\n");
        return -1; // Return a sentinel value to indicate an error
    }
    else
    {
        int poppedItem = stack->items[stack->top];
        stack->top--;
        return poppedItem;
    }
}

// 7
int main()
{
    struct Stack myStack;
    initialize(&myStack);

    push(&myStack, 10);
    push(&myStack, 20);
    push(&myStack, 30);

    printf("Popped item: %d\n", pop(&myStack));
    printf("Popped item: %d\n", pop(&myStack));
    printf("Popped item: %d\n", pop(&myStack));

    return 0;
}
