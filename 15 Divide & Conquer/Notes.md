# > Divide and conquer Algorithms

## Merge Sort

### How It Works

Merge Sort applies divide and conquer by recursively splitting the array in half until single‐element subarrays remain, then merging pairs of sorted subarrays to produce larger sorted sequences until the entire array is reconstructed. This “static division” ensures that the sizes of subarrays differ by at most one at each level of recursion.

### Pseudocode

```
MERGE-SORT(A, left, right):
  if left < right:
    mid = ⌊(left + right) / 2⌋
    MERGE-SORT(A, left, mid)
    MERGE-SORT(A, mid+1, right)
    MERGE(A, left, mid, right)

MERGE(A, left, mid, right):
  n1 = mid – left + 1
  n2 = right – mid
  create arrays L[1..n1], R[1..n2]
  copy A[left..mid] into L; A[mid+1..right] into R
  i = 1; j = 1; k = left
  while i ≤ n1 and j ≤ n2:
    if L[i] ≤ R[j]:
      A[k++] = L[i++]
    else:
      A[k++] = R[j++]
  copy any remaining elements of L and R into A
```


### Flowchart

```
[Start MERGE-SORT]
    ↓
[left < right?]─No→[Return]
    ↓Yes
[mid = (left+right)/2]
MERGE-SORT(left, mid)
MERGE-SORT(mid+1, right)
MERGE(left, mid, right)
[Return]
```

*Each call splits the problem in two, then merges back.* 

### Dry-Run Example

Given A = \[5, 2, 9, 1]:

1. Split into \[5,2] and \[9,1]
2. \[5,2] → split \[5] and \[2], merge → \[2,5]
3. \[9,1] → split \[9] and \[1], merge → \[1,9]
4. Merge \[2,5] and \[1,9] → \[1,2,5,9]

### Time & Space Complexity

* **Time**: *O(n log n)* in best, average, and worst cases, because at each of the *log n* levels we do *O(n)* work.
* **Space**: *O(n)* auxiliary for the temporary arrays during merging.
* **Stability**: Stable (equal elements preserve their relative order).
* **Use-Cases**: Preferred when stability is required or predictable performance is critical (e.g., external sorting on large datasets).

---

## Quick Sort

### How It Works

Quick Sort uses divide and conquer by selecting a **pivot** element, partitioning the array so that elements ≤ pivot go to the left and > pivot go to the right, then recursively applying the same process to the subarrays. Unlike Merge Sort’s static splits, Quick Sort’s partitions vary in size depending on pivot choice.

### Pseudocode (Lomuto Partition)

```
QUICK-SORT(A, low, high):
  if low < high:
    p = PARTITION(A, low, high)
    QUICK-SORT(A, low, p–1)
    QUICK-SORT(A, p+1, high)

PARTITION(A, low, high):
  pivot = A[high]
  i = low–1
  for j = low to high–1:
    if A[j] ≤ pivot:
      i = i+1; swap A[i], A[j]
  swap A[i+1], A[high]
  return i+1
```

### Flowchart

```
[Start QUICK-SORT]
    ↓
[low < high?]─No→[Return]
    ↓Yes
p = PARTITION(low, high)
QUICK-SORT(low, p–1)
QUICK-SORT(p+1, high)
[Return]
```

*Partition rearranges around the pivot.* 

### Dry-Run Example

A = \[3,6,8,1,4]; pivot = 4

* Partition step moves 1 and 3 left of 4 → \[3,1,4,8,6], pivot index = 2
* Recursively sort \[3,1] → \[1,3] and \[8,6] → \[6,8]
* Final: \[1,3,4,6,8]

### Time & Space Complexity

* **Average Time**: *O(n log n)*, if partitions are balanced.
* **Worst Time**: *O(n²)*, when partitions are highly unbalanced (e.g., already sorted input with poor pivot choice).
* **Space**: *O(log n)* average for recursion stack; *O(n)* worst case.
* **Stability**: Not stable by default (equal elements may reorder).
* **Optimizations**:

  * **Randomized Pivot** to avoid adversarial inputs.
  * **Median-of-Three** pivot selection for better balance.
  * **Tail Recursion Elimination** to reduce stack usage.
  * **Switch to Insertion Sort** for small subarrays to improve constant factors.

---

Both Merge Sort and Quick Sort exemplify the divide-and-conquer paradigm: **divide** the array into subproblems, **conquer** each recursively, and **combine** their results. Merge Sort guarantees stable *O(n log n)* performance at the cost of extra memory, while Quick Sort often outperforms in practice due to in-place partitioning and lower constants, provided pivot selection and recursion depth are managed carefully.


