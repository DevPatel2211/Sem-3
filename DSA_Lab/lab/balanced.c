#include <stdio.h>
#include <stdbool.h>
#include <string.h>

#define MAX_SIZE 100 // Maximum size of the stack

// Define the stack structure
struct Stack
{
    char items[MAX_SIZE];
    int top;
};

// Function to initialize the stack
void initialize(struct Stack *stack)
{
    stack->top = -1; // Initialize the top index to -1 (empty stack)
}

// Function to check if the stack is empty
bool isEmpty(struct Stack *stack)
{
    return stack->top == -1;
}

// Function to check if the stack is full
bool isFull(struct Stack *stack)
{
    return stack->top == MAX_SIZE - 1;
}

// Function to push a character onto the stack
void push(struct Stack *stack, char value)
{
    if (isFull(stack))
    {
        printf("Stack is full. Cannot push %c.\n", value);
    }
    else
    {
        stack->top++;
        stack->items[stack->top] = value;
    }
}

// Function to pop a character from the stack
char pop(struct Stack *stack)
{
    if (isEmpty(stack))
    {
        printf("Stack is empty. Cannot pop.\n");
        return '\0'; // Return a sentinel value to indicate an error
    }
    else
    {
        char poppedItem = stack->items[stack->top];
        stack->top--;
        return poppedItem;
    }
}

// Function to check if parentheses are balanced
bool areParenthesesBalanced(char *expression)
{
    struct Stack stack;
    initialize(&stack);

    int length = strlen(expression);

    for (int i = 0; i < length; i++)
    {
        char currentChar = expression[i];

        if (currentChar == '(' || currentChar == '[' || currentChar == '{')
        {
            push(&stack, currentChar);
        }
        else if (currentChar == ')' || currentChar == ']' || currentChar == '}')
        {
            if (isEmpty(&stack))
            {
                return false; // Unbalanced, no matching opening parenthesis
            }

            char poppedChar = pop(&stack);
            if ((currentChar == ')' && poppedChar != '(') ||
                (currentChar == ']' && poppedChar != '[') ||
                (currentChar == '}' && poppedChar != '{'))
            {
                return false; // Unbalanced, mismatched parentheses
            }
        }
    }

    return isEmpty(&stack); // If the stack is empty, parentheses are balanced
}

int main()
{
    char expression[MAX_SIZE];

    printf("Enter a string with parentheses: ");
    fgets(expression, MAX_SIZE, stdin);

    if (areParenthesesBalanced(expression))
    {
        printf("Parentheses are balanced.\n");
    }
    else
    {
        printf("Parentheses are not balanced.\n");
    }

    return 0;
}
