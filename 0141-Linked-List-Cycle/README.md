# 141. Linked List Cycle

## Problem

Given the head of a linked list, determine if the linked list contains a cycle.

A cycle exists if there is a node in the linked list that can be reached again by continuously following the `next` pointer.

Return `true` if the linked list contains a cycle. Otherwise, return `false`.

## Approach

Use Floyd's Cycle Detection Algorithm, also known as the Tortoise and Hare algorithm.

Use two pointers:
- `slow` moves one node at a time.
- `fast` moves two nodes at a time.

If a cycle exists, the `fast` pointer will eventually meet the `slow` pointer.

If there is no cycle, the `fast` pointer will reach `null`.

## Example

Input:
`head = [3,2,0,-4], pos = 1`

Output:
`true`

Explanation:
The last node points back to the node at index `1`, creating a cycle.

Complexity
Time Complexity: O(n)
Space Complexity: O(1)


Key Concept

Floyd's Cycle Detection Algorithm