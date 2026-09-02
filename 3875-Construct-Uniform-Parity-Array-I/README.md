# 3875. Construct Uniform Parity Array I

## Problem

Given an array `nums1` containing distinct integers, construct another array `nums2` of the same length.

For every index `i`, we can choose either:

- `nums2[i] = nums1[i]`
- `nums2[i] = nums1[i] - nums1[j]`, where `j != i`

The goal is to make all elements of `nums2` either **all odd** or **all even**.

Return `true` if this is possible, otherwise return `false`.

## Approach

Only the **parity** (odd or even) of the numbers matters.

### Key Observation

For an element `nums1[i]`:

- If `nums1[i]` is even, we can keep it even.
- If `nums1[i]` is odd, we need to make it even or odd depending on the available elements.

The parity of a difference depends on the two numbers:

- Even - Even = Even
- Odd - Odd = Even
- Even - Odd = Odd
- Odd - Even = Odd

### Important Cases

#### 1. All numbers have the same parity

If all numbers are even:

```text
even - even = even
```

So we can simply keep every element.

If all numbers are odd:

```text
odd - odd = even
```

We can make every element even because there are at least two distinct elements when needed.

Therefore, the answer is `true`.

#### 2. The array contains both odd and even numbers

We can make every element odd.

For an even number, subtract an odd number:

```text
even - odd = odd
```

For an odd number, subtract an even number:

```text
odd - even = odd
```

Because the array contains both parities, an appropriate element of the opposite parity is available for every index.

Therefore, the answer is `true`.

## Conclusion

For this problem, the answer is always `true` for the given constraints.

The only thing we need to check is the parity of the numbers, but regardless of whether the array contains:

- only even numbers,
- only odd numbers,
- or both odd and even numbers,

we can construct a uniform-parity array.


## Complexity

- Time Complexity: O(1)
- Space Complexity: O(1)
