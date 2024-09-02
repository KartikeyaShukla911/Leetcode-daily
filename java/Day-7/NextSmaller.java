/*
 * Next smaller elements
 * Given an array, print the Next Smaller Element (NSE) for every element. The NSE for an element x is the first smaller element on the right side of x in the array. Elements for which no smaller element exist (on the right side), consider NSE as -1. 

Examples: 

Input: [4, 8, 5, 2, 25]
Output: [2, 5, 2, -1, -1]
 */
import java.io.*;
import java.util.*;

public class NextSmaller{

 public static void nextSmallerEle(int arr[],int n)
 {
    Stack<Integer> st = new Stack();
    int ans[]=new int[n];
    ans[n-1]=-1;
    for(int i=n-1;i>=0;i--)
    {
        while(!st.isEmpty() && st.peek()>arr[i])
        {
            st.pop();
        }
        if(st.isEmpty())
        {
            ans[i]=-1;
        }
        st.push(arr[i]);
    }

    System.out.println(ans);
 }

 public static void main(String args[])
 {
    int arr[] = {};
    int n = arr.length;
    nextSmallerEle(arr,n);
 }
}