# 3903. Smallest Stable Index I

## Problem

Given an integer array `nums` and an integer `k`, the instability score of an index `i` is:

```text
max(nums[0..i]) - min(nums[i..n-1])
```

An index is called **stable** if its instability score is less than or equal to `k`.

Return the **smallest stable index**. If there is no stable index, return `-1`.

## Approach

For every index `i`, we need two values:

- The maximum value from index `0` to `i`.
- The minimum value from index `i` to `n - 1`.

We can efficiently calculate the suffix minimum first.

### Steps

1. Create an array `suffixMin`.
2. Traverse `nums` from right to left and store the minimum value from the current index to the end.
3. Traverse `nums` from left to right.
4. Maintain the maximum value seen so far.
5. For every index `i`, calculate:

```text
instability = currentMax - suffixMin[i]
```

6. If `instability <= k`, return `i` immediately because we are looking for the smallest stable index.
7. If no index satisfies the condition, return `-1`.

## Example

### Input

```text
nums = [5,0,1,4]
k = 3
```

### Suffix Minimum

```text
nums       = [5,0,1,4]
suffixMin  = [0,0,1,4]
```

Check each index:

```text
i = 0
max = 5
min = 0
score = 5 - 0 = 5

i = 1
max = 5
min = 0
score = 5 - 0 = 5

i = 2
max = 5
min = 1
score = 5 - 1 = 4

i = 3
max = 5
min = 4
score = 5 - 4 = 1
```

Since `1 <= 3`, index `3` is stable.

### Output

```text
3
```


## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Key Concept

**Prefix Maximum + Suffix Minimum**

For each index:

```text
Instability = Prefix Maximum - Suffix Minimum
```

Using a suffix minimum array allows us to calculate the instability score for every index efficiently.

