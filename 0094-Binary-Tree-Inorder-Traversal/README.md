# 94. Binary Tree Inorder Traversal

## Problem

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Inorder traversal follows this order:

1. Traverse the left subtree.
2. Visit the root node.
3. Traverse the right subtree.

## Approach

We use recursion to perform inorder traversal.

1. If the current node is `null`, return.
2. Traverse the left subtree.
3. Add the current node's value to the result.
4. Traverse the right subtree.
5. Return the final list containing all node values in inorder.

## Example 1

### Input

root = [1,null,2,3]

### Output

[1,3,2]

### Explanation

The inorder traversal follows:

- Visit the left subtree.
- Visit the root node.
- Visit the right subtree.

The traversal result is `[1,3,2]`.

## Example 2

### Input

root = [1,2,3,4,5,null,8,null,null,6,7,9]

### Output

[4,2,6,5,7,1,3,9,8]

## Example 3

### Input

root = []

### Output

[]

## Example 4

### Input

root = [1]

### Output

[1]

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

Where `n` is the number of nodes in the binary tree.

