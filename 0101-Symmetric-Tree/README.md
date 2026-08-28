# 101. Symmetric Tree

## Problem

Given the root of a binary tree, determine whether the tree is symmetric around its center.

A binary tree is symmetric if the left subtree is a mirror image of the right subtree.

## Approach

We use recursion to compare the left and right subtrees.

1. If both nodes are `null`, they are symmetric.
2. If only one node is `null`, the tree is not symmetric.
3. If both nodes have different values, the tree is not symmetric.
4. Compare:
   - The left child of the first subtree with the right child of the second subtree.
   - The right child of the first subtree with the left child of the second subtree.
5. If all corresponding nodes match, the tree is symmetric.

## Example 1

### Input

root = [1,2,2,3,4,4,3]

### Output

true

### Explanation

The left and right sides of the tree are mirror images of each other.

## Example 2

### Input

root = [1,2,2,null,3,null,3]

### Output

false

### Explanation

The left and right subtrees are not mirror images, so the tree is not symmetric.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(h)

Where `n` is the number of nodes and `h` is the height of the tree.

