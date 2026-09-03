# 3876. Construct Uniform Parity Array II

## Problem

Given an array `nums1` of distinct integers, construct another array `nums2` of the same length.

For every index `i`, we can choose exactly one of the following:

- `nums2[i] = nums1[i]`
- `nums2[i] = nums1[i] - nums1[j]`, where `j != i` and `nums1[i] - nums1[j] >= 1`

The goal is to make all elements of `nums2` either **all odd** or **all even**.

Return `true` if this is possible, otherwise return `false`.

## Approach

Only the parity of the numbers matters.

For a number `nums1[i]`, we have two choices:

1. Keep the number itself.
2. Subtract a smaller number from it.

The parity of a difference depends on the parity of the two numbers:

- Even - Even = Even
- Odd - Odd = Even
- Even - Odd = Odd
- Odd - Even = Odd

Because the subtraction is allowed only when the result is positive, we must consider the ordering of the values.

### Key Observation

Sort the array first.

If all numbers have the same parity, we can keep every element and the resulting array already has uniform parity.

If both odd and even numbers exist, we check whether every number can be converted to the same parity using a smaller element.

For an element:

- To make an even number odd, we need a smaller odd number.
- To make an odd number even, we need a smaller odd number or an appropriate smaller even number depending on the desired parity.

The smallest element is especially important because it cannot subtract any other smaller value. Therefore, its original parity determines the parity that must be possible for the complete array.

After sorting, we can check whether every element can either keep its parity or subtract a smaller element to obtain the required parity.

## Example 1

### Input

```text
nums1 = [1,4,7]
```

### Possible Construction

```text
nums2[0] = 1
nums2[1] = 4 - 1 = 3
nums2[2] = 7
```

Result:

```text
[1,3,7]
```

All elements are odd.

### Output

```text
true
```

## Example 2

### Input

```text
nums1 = [2,3]
```

There is no valid way to make both elements have the same parity while respecting the positive-difference condition.

### Output

```text
false
```

## Example 3

### Input

```text
nums1 = [4,6]
```

We can keep both elements:

```text
[4,6]
```

Both are even.

### Output

```text
true
```

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1) excluding the sorting implementation.

## Key Concept

**Parity + Sorting + Valid Positive Difference**

Unlike Construct Uniform Parity Array I, this problem has an additional restriction:

```text
nums1[i] - nums1[j] >= 1
```

Therefore, we can only subtract a **smaller** element.

