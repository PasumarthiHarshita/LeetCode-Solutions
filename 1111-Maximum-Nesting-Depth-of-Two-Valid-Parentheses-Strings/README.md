# 1111. Maximum Nesting Depth of Two Valid Parentheses Strings

## Problem

Given a valid parentheses string `seq`, split it into two subsequences, A and B, such that both are valid parentheses strings.

Return an array where `answer[i]` is `0` if the character belongs to A, or `1` if it belongs to B.

The goal is to minimize the maximum nesting depth of the two subsequences.

## Approach

Use a greedy approach by tracking the current parentheses depth.

- For an opening parenthesis `(`, assign it based on the current depth's parity, then increase the depth.
- For a closing parenthesis `)`, decrease the depth first, then assign it based on the updated depth's parity.
- Alternating assignments distribute nested parentheses between the two groups.

This balances the nesting depth between A and B.

## Example

Input: `seq = "(()())"`

Output: `[0,1,1,1,1,0]`

## Complexity

- Time: O(n)
- Space: O(1) auxiliary space

## Key Concept

Greedy Algorithm and Depth Parity

## Language

Java

## LeetCode

[1111. Maximum Nesting Depth of Two Valid Parentheses Strings](https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/)