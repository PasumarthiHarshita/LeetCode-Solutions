# 1200. Minimum Absolute Difference

## Problem

Given an array of distinct integers `arr`, find all pairs of elements that have the minimum absolute difference among any two elements in the array.

Each pair `[a, b]` must satisfy:

- `a < b`
- `b - a` is equal to the minimum absolute difference.
- The pairs should be returned in ascending order.

## Approach

The main idea is to **sort the array**.

After sorting, the minimum absolute difference can only occur between **adjacent elements**.

For example:

```text
arr = [4, 2, 1, 3]

After sorting:

[1, 2, 3, 4]
```

Compare adjacent elements:

```text
2 - 1 = 1
3 - 2 = 1
4 - 3 = 1
```

The minimum difference is `1`, so the answer is:

```text
[[1,2], [2,3], [3,4]]
```

### Steps

1. Sort the array.
2. Find the minimum difference between every pair of adjacent elements.
3. Traverse the sorted array again.
4. Add every adjacent pair whose difference equals the minimum difference.
5. Return the result.

## Example

### Input

```text
arr = [4,2,1,3]
```

### Sorted Array

```text
[1,2,3,4]
```

### Minimum Difference

```text
1
```

### Output

```text
[[1,2],[2,3],[3,4]]
```

## Complexity

- Time Complexity: O(n log n)
- Space Complexity: O(log n) for the sorting algorithm, excluding the output list.

## Key Concept

**Sorting + Adjacent Element Comparison**

After sorting, the closest pair of numbers will always be adjacent.

