# 144. Binary Tree Preorder Traversal

## Problem

Given the root of a binary tree, return the preorder traversal of its nodes' values.

In preorder traversal, nodes are visited in the following order:

**Root → Left → Right**

## Approach

Use an iterative approach with a stack.

1. If the root is `null`, return an empty list.
2. Push the root node into the stack.
3. Remove the top node from the stack and add its value to the result.
4. Push the right child first.
5. Push the left child next so that the left child is processed before the right child.
6. Continue until the stack becomes empty.

## Example

Input:
`root = [1,null,2,3]`

Output:
`[1,2,3]`

Explanation:
The preorder traversal follows:

`Root → Left → Right`

Therefore, the nodes are visited as `1 → 2 → 3`.

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

Where `n` is the number of nodes in the binary tree.

## Key Concept

**Binary Tree + Preorder Traversal + Stack**

Preorder traversal visits nodes in the order:

**Root → Left → Right**

