## Day 6 Problems

- **Container With Most Water**
  - Problem: Given an array of heights, find two lines that together with the x-axis form a container that holds the maximum amount of water.
  - Approach: Use the two-pointer technique.
    - Start with one pointer at the beginning and one at the end.
    - Calculate the area formed by the two lines.
    - Move the pointer at the shorter line inward to try and find a taller line.
    - Continue until the pointers meet, keeping track of the maximum area.
