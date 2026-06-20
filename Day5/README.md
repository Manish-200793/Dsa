## Day 5 Problems

- **Power Function (pow)**
  - Problem: Implement `x^n` (x raised to the power n).
  - Approach: Use fast exponentiation (divide and conquer).
    - If n is even → compute `pow(x, n/2)` and square it.
    - If n is odd → multiply x with `pow(x, n-1)`.
    - For negative n → take reciprocal of the result.
