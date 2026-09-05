# 3904. Smallest Stable Index II

## Problem

Given an integer array `nums` and an integer `k`, the instability score of an index `i` is:

```text
max(nums[0..i]) - min(nums[i..n-1])
```

An index is called **stable** if its instability score is less than or equal to `k`.

Return the **smallest stable index**. If there is no stable index, return `-1`.

## Approach

We need to find the first index `i` where:

```text
max(nums[0..i]) - min(nums[i..n-1]) <= k
```

The important observation is that:

- `max(nums[0..i])` is a **prefix maximum**.
- `min(nums[i..n-1])` is a **suffix minimum**.

We can calculate the suffix minimum for every index and then scan from left to right while maintaining the prefix maximum.

Since the constraints are large (`n <= 10^5`), we need an `O(n)` solution.

### Steps

1. Create a `suffixMin` array.
2. Traverse the array from right to left to calculate the minimum value from each index to the end.
3. Traverse the array from left to right.
4. Maintain `prefixMax`, the maximum value seen so far.
5. For every index `i`, calculate:

```text
score = prefixMax - suffixMin[i]
```

6. If `score <= k`, return `i`.
7. If no index is stable, return `-1`.

## Example

### Input

```text
nums = [5,0,1,4]
k = 3
```

### Suffix Minimum

```text
nums      = [5,0,1,4]
suffixMin = [0,0,1,4]
```

Now check each index:

```text
Index 0:
prefixMax = 5
suffixMin = 0
score = 5 - 0 = 5

Index 1:
prefixMax = 5
suffixMin = 0
score = 5 - 0 = 5

Index 2:
prefixMax = 5
suffixMin = 1
score = 5 - 1 = 4

Index 3:
prefixMax = 5
suffixMin = 4
score = 5 - 4 = 1
```

Since:

```text
1 <= 3
```

index `3` is stable.

### Output

```text
3
```



## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

## Key Concept

**Prefix Maximum + Suffix Minimum**

For every index:

```text
Instability Score = Prefix Maximum - Suffix Minimum
```

Using these two values allows us to find the smallest stable index in linear time.

