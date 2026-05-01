# Sorting and Searching Algorithm Analysis

## Project Overview
This project compares sorting and searching algorithms:
- Bubble Sort
- Merge Sort
- Linear Search

Goal: analyze performance using execution time.

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

Tested on arrays:
- 10
- 100
- 1000

Observations:
- Merge Sort is faster for large arrays
- Bubble Sort is slow for big data
- Sorted arrays improve Bubble performance
- Linear search is slow for large arrays

---

## Reflection
I learned how algorithm complexity affects real performance.
Merge Sort performed much better on large arrays compared to Bubble Sort.
Although theory predicts this, it was interesting to see real timing differences.
One challenge was implementing merge sort correctly.
## Screenshots
![Run 1](docs/screenshots/run1.png)
![Run 2](docs/screenshots/run2.png)