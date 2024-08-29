/*Kth largest/smallest element in an array


23

5
Problem Statement: Given an unsorted array, print Kth Largest and Smallest Element from an unsorted array.

Examples:

Example 1:
Input: Array = [1,2,6,4,5,3] , K = 3 
Output: kth largest element = 4, kth smallest element = 3

Example 2:
Input: Array = [1,2,6,4,5] , k = 3
Output : kth largest element = 4,  kth smallest element = 4 */


// way 1 --> sort the array, and find the kth one

Arrays.sort(arr);
Collection.sort(ArrayList);

for decending order

Arrays.sort(arr,Collection.reverseOrder());
Collection.sort(ArrayList, Collection.reverseOrder());

O ~ n log n 

// way 2 - O(n) - avg time c
// worst - O(n^2)


