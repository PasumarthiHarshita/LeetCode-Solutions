# 111. Minimum Depth of Binary Tree

## Problem
Given the root of a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node to the nearest leaf node.

A leaf node is a node that has no left or right child.

## Approach
Use Breadth-First Search (BFS) to traverse the tree level by level.

- Start from the root at depth 1.
- Add the root to a queue.
- Process nodes level by level.
- When the first leaf node is found, return its depth.
- BFS guarantees that the first leaf encountered is at the minimum depth.

## Example
Input: root = [3,9,20,null,null,15,7]

Output: 2

Explanation:
The nearest leaf node is 9, which is at depth 2.

## Complexity
Time Complexity: O(n)

Space Complexity: O(n)