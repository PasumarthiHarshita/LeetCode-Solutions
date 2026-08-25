# 100. Same Tree

## Problem

Given the roots of two binary trees `p` and `q`, determine whether both trees are the same.

Two binary trees are considered the same if:

- They have the same structure.
- The corresponding nodes have the same values.

Return `true` if both trees are the same, otherwise return `false`.

## Example 1

Input:

```text
p = [1,2,3]
q = [1,2,3]
```

Output:

```text
true
```

Explanation:

Both trees have the same structure and the same node values.

## Example 2

Input:

```text
p = [1,2]
q = [1,null,2]
```

Output:

```text
false
```

Explanation:

The structure of both trees is different.

## Example 3

Input:

```text
p = [1,2,1]
q = [1,1,2]
```

Output:

```text
false
```

Explanation:

The corresponding nodes have different values.

## Approach

We use recursion to compare both binary trees.

1. If both nodes are `null`, they are the same.
2. If one node is `null` and the other is not, the trees are different.
3. If the values of the nodes are different, return `false`.
4. Recursively compare the left children.
5. Recursively compare the right children.
6. Both left and right subtrees must be the same for the trees to be identical.


## Complexity Analysis

Time Complexity: `O(n)`

Space Complexity: `O(h)`

Where `n` is the number of nodes and `h` is the height of the tree.

## Topics

- Tree
- Binary Tree
- Depth-First Search
- Recursion