# 1927. Sum Game

## Problem

Alice and Bob take turns replacing `?` characters in a string with digits from `0` to `9`.

The string has an even length and is divided into two equal halves.

- Bob wins if the sum of digits in the first half is equal to the sum of digits in the second half.
- Alice wins if the sums are not equal.

Return `true` if Alice wins with optimal play, otherwise return `false`.

## Example 1

Input:

```text
num = "5023"
```

Output:

```text
false
```

Explanation:

The first half is `50` and the second half is `23`.

First half sum = `5 + 0 = 5`

Second half sum = `2 + 3 = 5`

Both sums are equal, so Bob wins.

## Example 2

Input:

```text
num = "25??"
```

Output:

```text
true
```

Explanation:

Alice can choose values for the question marks that make it impossible for Bob to balance both halves.

Therefore, Alice wins.

## Approach

1. Divide the string into two halves.
2. Calculate the sum of digits in the left half.
3. Calculate the sum of digits in the right half.
4. Count the number of `?` characters in both halves.
5. If the total number of `?` characters is odd, Alice wins.
6. Otherwise, check whether the difference between the sums can be balanced using the available question marks.
7. If the sums cannot be balanced, Alice wins.

## Complexity Analysis

Time Complexity: `O(n)`

Space Complexity: `O(1)`

## Topics

- String
- Math
- Game Theory
- Greedy