/*
 * Implement stack using array
 */

 void push(int x)
 {
    arr[top++]=x;
 }

 int pop()
 {
    int x = arr[top--];
    return x;
 }

 int top()
    return arr[top];

