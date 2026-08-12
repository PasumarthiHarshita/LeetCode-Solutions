# 24. Swap Nodes in Pairs

**Difficulty:** Medium

## Problem

Given a linked list, swap every two adjacent nodes and return its head.

You must solve the problem without modifying the values in the list's nodes. Only the nodes themselves may be changed.

## Example 1

**Input:** `head = [1,2,3,4]`

**Output:** `[2,1,4,3]`

**Explanation:** The first two nodes `1` and `2` are swapped, and then the next two nodes `3` and `4` are swapped.

## Example 2

**Input:** `head = []`

**Output:** `[]`

## Example 3

**Input:** `head = [1]`

**Output:** `[1]`

## Example 4

**Input:** `head = [1,2,3]`

**Output:** `[2,1,3]`

## Constraints

- The number of nodes in the list is in the range `0` to `100`.
- `0 <= Node.val <= 100`

## Approach

We use an iterative approach with a **dummy node**.

For every pair of adjacent nodes:

1. Store the first node of the pair.
2. Store the second node of the pair.
3. Connect the first node to the node after the second node.
4. Connect the second node to the first node.
5. Connect the previous part of the list to the second node.
6. Move the pointer forward and continue with the next pair.

The node values are never modified. Only the links between the nodes are changed.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`