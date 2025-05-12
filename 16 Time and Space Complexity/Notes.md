# >Time and Space Complexity

## Introduction to Complexity Analysis

Algorithmic complexity provides a language for predicting how performance scales as problem size grows. Instead of benchmarking on specific hardware, complexity analysis counts abstract operations (e.g., comparisons, assignments) or memory words, yielding machine-independent insight into algorithm efficiency. By focusing on asymptotic behavior—how resource usage behaves as *n* → ∞—we ignore constant factors and low-order terms, emphasizing the dominant growth rate that dictates scalability.

---

## Time Complexity

### Definitions and Notations

* **Time Complexity (T(n))** is the function describing how the running time grows with input size *n*, typically by counting elementary operations under the assumption each takes constant time.
* **Big O (O(f(n)))** gives an *upper bound* on T(n), ensuring that for sufficiently large *n*, T(n) grows no faster than *c·f(n)* for some constant *c*.
* **Big Ω (Ω(f(n)))** provides a *lower bound*, meaning T(n) grows at least as fast as *c·f(n)* beyond some *n₀*.
* **Big Θ (Θ(f(n)))** tightly bounds T(n) both above and below, indicating T(n) grows on the order of *f(n)*.

### Best, Average, and Worst Cases

* **Worst-Case Complexity (O)** characterizes performance on the most demanding inputs of size *n* and is crucial for guaranteeing response times.
* **Best-Case Complexity (Ω)** describes the easiest inputs, showing the minimal time required.
* **Average-Case Complexity (Θ)** averages T(n) over all inputs, though in practice it can be harder to compute and often assumes a probability distribution.

### Common Time Complexity Classes

| Class             | Notation   | Example Algorithms                                                                             |
| ----------------- | ---------- | ---------------------------------------------------------------------------------------------- |
| Constant time     | O(1)       | Array access by index                                                                          |
| Logarithmic time  | O(log n)   | Binary search in a sorted array                                                                |
| Linear time       | O(n)       | Single loop scanning an array                                                                  |
| Linear × log time | O(n log n) | Merge Sort, Quick Sort (average)                                                               |
| Quadratic time    | O(n²)      | Bubble Sort, Selection Sort, Insertion Sort (average)                                          |
| Exponential time  | O(2ⁿ)      | Naïve recursive Fibonacci                                                                      |
| Factorial time    | O(n!)      | Generating all permutations                                                                    |

---

## Space Complexity

### Definitions

* **Space Complexity (S(n))** measures the total memory used by an algorithm on an input of size *n*, including the input itself (input space) and additional working memory (auxiliary space).

### Auxiliary vs. Total Space

* **Auxiliary Space** excludes the input, focusing on extra memory allocated (e.g., recursion stacks, temporary arrays).
* **Total Space** adds input size to auxiliary space, representing the full memory footprint.

### Common Space Complexity Classes

| Class        | Notation   | Example                                                                       |
| ------------ | ---------- | ----------------------------------------------------------------------------- |
| Constant     | O(1)       | In-place sorting (Bubble, Selection)                                          |
| Logarithmic  | O(log n)   | Recursive binary search (stack depth)                                         |
| Linear       | O(n)       | Storing input in an array                                                     |
| Linear × log | O(n log n) | Merge Sort (auxiliary arrays)                                                 |
| Quadratic    | O(n²)      | DP table for some problems                                                    |

---

## Trade-Offs and Practical Considerations

Balancing time and space is a key design decision. For instance, **Merge Sort** guarantees O(n log n) time but requires O(n) space, whereas **Quick Sort** often uses O(1) auxiliary space with O(n log n) average time but risks O(n²) worst-case time without good pivot selection. Similarly, memoization transforms exponential-time recursion into polynomial-time at the cost of extra memory. Profiling real implementations is crucial: constant factors and cache behavior can make theoretically slower algorithms faster in practice.

---

Understanding and applying time and space complexity analysis enables you to choose and optimize algorithms that will scale efficiently with large inputs, ensuring robust, high-performance software.
