# Sorting and Searching Algorithm Analysis

## Project Overview
This project analyzes and compares three algorithms:
- Bubble Sort
- Merge Sort
- Linear Search

Goal: analyze performance using execution time and compare different input types (random and sorted arrays).

---

## Algorithms

### Bubble Sort
- Simple algorithm
- Compares adjacent elements
- Time Complexity: O(n²)

### Merge Sort
- Divide and conquer algorithm
- Splits array and merges
- Time Complexity: O(n log n)

### Linear Search
- Checks each element
- Time Complexity: O(n)

---

## Results

### Random Array

| Size | Bubble Sort | Merge Sort | Linear Search |
|------|------------|------------|---------------|
| 10   | 5042       | 5042       |2625          |
| 100  | 143541     | 52083      | 875           |
| 1000 |  6142458   | 239416     | 4083           |

### Sorted Array

| Size | Bubble Sort | Merge Sort | Linear Search |
|------|-----------|------------|---------------|
| 10   |  3625     |12083       | 2625           |
| 100  | 81792     |  79625     | 875           |
| 1000 | 1227125   |  58709        | 4083           |

---

## Observations
- Merge Sort is fast for both random and sorted arrays
- Bubble Sort is slow for large random arrays
- Bubble Sort performs better on sorted arrays
- Linear Search time increases with array size

---

## Analysis
- Merge Sort is faster because it has O(n log n)
- Bubble Sort is slower due to O(n²)
- Sorted input improves Bubble Sort performance
- Results match theoretical Big-O complexity
- Linear Search is O(n), so slower for large arrays
- Binary Search would be faster but requires a sorted array

---

## Screenshots

### Random Array and Sorted Array
![Random](docs/screenshots/run1.png)
![Sorted](docs/screenshots/run2.png)


---

## Reflection
I learned how algorithm complexity affects real performance.
Merge Sort performed much better than Bubble Sort, especially for large arrays.
Although theory predicts this, real execution times clearly show the difference.
One challenge was implementing Merge Sort and organizing the code properly.
![Run 1](docs/screenshots/run1.png)
![Run 2](docs/screenshots/run2.png)