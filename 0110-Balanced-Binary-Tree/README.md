# 110. Balanced Binary Tree

## Problem

Given a binary tree, determine if it is height-balanced.

A binary tree is height-balanced if, for every node, the difference between the heights of its left and right subtrees is at most `1`.

## Approach

Use a bottom-up DFS (Depth-First Search) approach.

For each node:
- Calculate the height of the left subtree.
- Calculate the height of the right subtree.
- If the difference between the two heights is greater than `1`, the tree is not balanced.
- If any subtree is already unbalanced, return `-1`.
- Otherwise, return the height of the current subtree.

Using `-1` as a signal helps detect an unbalanced subtree immediately.

## Example

Input:
`root = [3,9,20,null,null,15,7]`

Output:
`true`

Explanation:
The difference between the heights of the left and right subtrees of every node is at most `1`, so the tree is balanced.

Complexity
Time Complexity: O(n)
Space Complexity: O(h)

Where n is the number of nodes and h is the height of the tree.

Key Concept

Binary Tree, DFS, Recursion, Height Calculation