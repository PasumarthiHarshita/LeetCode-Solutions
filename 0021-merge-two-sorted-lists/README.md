# 21. Merge Two Sorted Lists

**Difficulty:** Easy

## Problem

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one **sorted** list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

## Example 1

**Input:** `list1 = [1,2,4], list2 = [1,3,4]`

**Output:** `[1,1,2,3,4,4]`

## Example 2

**Input:** `list1 = [], list2 = []`

**Output:** `[]`

## Example 3

**Input:** `list1 = [], list2 = [0]`

**Output:** `[0]`

## Constraints

- The number of nodes in both lists is in the range `0` to `50`.
- `-100 <= Node.val <= 100`
- Both `list1` and `list2` are sorted in **non-decreasing** order.

## Approach

We use a **two-pointer** approach to merge the two sorted linked lists.

A dummy node is created to simplify the construction of the merged list.

At each step:

1. Compare the values of the current nodes of `list1` and `list2`.
2. Attach the node with the smaller value to the merged list.
3. Move the pointer of the selected list forward.
4. Move the merged list pointer forward.
5. Continue until one of the lists becomes empty.
6. Attach the remaining nodes of the other list to the merged list.

Finally, return `dummy.next`, which is the head of the merged linked list.

## Complexity

- **Time Complexity:** `O(n + m)`
- **Space Complexity:** `O(1)`