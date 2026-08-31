# 108. Convert Sorted Array to Binary Search Tree

## Problem

Given an integer array `nums` sorted in ascending order, convert it into a height-balanced Binary Search Tree (BST).

A height-balanced binary tree is a tree where the difference between the heights of the left and right subtrees is at most `1`.

## Approach

We use the Divide and Conquer approach.

1. Find the middle element of the sorted array.
2. Make the middle element the root of the BST.
3. Recursively use the left half of the array to create the left subtree.
4. Recursively use the right half of the array to create the right subtree.
5. Continue until there are no elements left.

Choosing the middle element as the root keeps the tree height-balanced.

## Example 1

### Input

nums = [-10,-3,0,5,9]

### Output

[0,-3,9,-10,null,5]

### Explanation

The middle element `0` becomes the root.

The left half `[-10,-3]` forms the left subtree.

The right half `[5,9]` forms the right subtree.

Another valid height-balanced BST is also possible.

## Example 2

### Input

nums = [1,3]

### Output

[3,1]

### Explanation

The middle element can be selected as the root, and the remaining element becomes its child.


Complexity

Time Complexity: O(n)
Space Complexity: O(log n)

The time complexity is O(n) because every element is used once to create a tree node.

The space complexity is O(log n) for the recursion stack in a height-balanced tree.