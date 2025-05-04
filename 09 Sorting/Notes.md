# > Basic Sorting

# Bubble Sort

### Definition & Procedure

Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order; this pass-and-swap continues until no further swaps are needed.

### Pseudocode

```
procedure bubbleSort(A, n):
  repeat
    swapped ← false
    for i from 1 to n–1 inclusive do
      if A[i–1] > A[i] then
        swap A[i–1] and A[i]
        swapped ← true
      end if
    end for
    n ← n – 1
  until not swapped
end procedure
```

### Flowchart

```
[Start]
   ↓
[set n = length(A)]
   ↓
┌─ repeat ─┐
│ [swapped = false]
│ [for i = 1 to n–1]
│     └─ if A[i–1] > A[i]
│         ↳ swap; swapped = true
│ [end for]
│ [n = n – 1]
└── until swapped == false
   ↓
[End]
```

### Dry-Run Example  
Given A = [5, 2, 9, 1]:

| Pass | Array Before      | Swaps             | Array After       |
|------|-------------------|-------------------|-------------------|
| 1    | [5, 2, 9, 1]      | (5↔2), (9↔1)      | [2, 5, 1, 9]      |
| 2    | [2, 5, 1, 9]      | (5↔1)             | [2, 1, 5, 9]      |
| 3    | [2, 1, 5, 9]      | (2↔1)             | [1, 2, 5, 9]      |
| 4    | [1, 2, 5, 9]      | no swaps → stop   | [1, 2, 5, 9]      |

### Complexity  
- **Time**: Worst/Average O(n²), Best O(n) when already sorted.
- **Space**: O(1) auxiliary. 

---

# Selection Sort

### Definition & Procedure  
Selection Sort divides the array into sorted and unsorted regions; in each iteration, it finds the minimum element from the unsorted region and swaps it with the first unsorted position.

### Pseudocode  
```

procedure selectionSort(A, n):
for i from 0 to n–2 inclusive do
minIndex ← i
for j from i+1 to n–1 inclusive do
if A\[j] < A\[minIndex] then
minIndex ← j
end if
end for
swap A\[i] and A\[minIndex]
end for
end procedure

```

### Flowchart  
```

\[Start]
↓
\[set n = length(A), i = 0]
↓
┌─ for i = 0 to n–2 ─┐
│ \[minIndex = i]
│ \[for j = i+1 to n–1]
│    └─ if A\[j] < A\[minIndex]
│        ↳ minIndex = j
│ \[swap A\[i], A\[minIndex]]
└── end for
↓
\[End]

```

### Dry-Run Example  
A = [4, 2, 7, 1]:

| i | minIndex before | minIndex after scan | Swap with A[i]   | Result            |
|---|-----------------|---------------------|------------------|-------------------|
| 0 | 0 (4)           | 3 (1)               | swap 4↔1         | [1, 2, 7, 4]      |
| 1 | 1 (2)           | 1 (2)               | swap 2↔2 (no-op) | [1, 2, 7, 4]      |
| 2 | 2 (7)           | 3 (4)               | swap 7↔4         | [1, 2, 4, 7]      |

### Complexity  
- **Time**: Always O(n²) comparisons; swaps O(n) 
- **Space**: O(1) auxiliary  

---

# Insertion Sort

### Definition & Procedure  
Insertion Sort builds a sorted subarray by taking each element and inserting it into its correct position among previously sorted elements, shifting larger elements rightward as needed.

### Pseudocode  
```

procedure insertionSort(A, n):
for i from 1 to n–1 inclusive do
key ← A\[i]
j ← i – 1
while j ≥ 0 and A\[j] > key do
A\[j+1] ← A\[j]
j ← j – 1
end while
A\[j+1] ← key
end for
end procedure

```

### Flowchart  
```

\[Start]
↓
\[for i = 1 to n–1]
│ \[key = A\[i], j = i–1]
│ ┌─ while j ≥ 0 and A\[j] > key ─┐
│ │ \[A\[j+1] = A\[j]; j = j–1]     │
│ └─────────┬───────────────────┘
│ \[A\[j+1] = key]
└── end for
↓
\[End]

```

### Dry-Run Example  
A = [3, 1, 4, 2]:

| i | Key | Before Shift    | After Shifts         | Array State       |
|---|-----|-----------------|----------------------|-------------------|
| 1 | 1   | [3, 1, 4, 2]    | shift 3 → [3,3,4,2]  | [1,3,4,2]         |
| 2 | 4   | [1,3,4,2]       | no shift             | [1,3,4,2]         |
| 3 | 2   | [1,3,4,2]       | shift 4,3 → [1,3,3,4] | [1,2,3,4]         |

### Complexity  
- **Time**: Worst/Average O(n²), Best O(n) when nearly sorted 
- **Space**: O(1) auxiliary 

---

# Counting Sort

### Definition & Procedure  
Counting Sort is a linear-time, non-comparative algorithm for sorting integers when the range k of possible values is not significantly larger than n. It counts occurrences of each key, computes prefix sums to determine positions, and places elements into an output array.

### Pseudocode  
```

procedure countingSort(A, n, k):
let count\[0..k] initialized to 0
let output\[0..n–1]
for i from 0 to n–1 do
count\[A\[i]] ← count\[A\[i]] + 1
for i from 1 to k do
count\[i] ← count\[i] + count\[i–1]
for i from n–1 downto 0 do
output\[count\[A\[i]] – 1] ← A\[i]
count\[A\[i]] ← count\[A\[i]] – 1
return output

```

### Flowchart  
```

\[Start]
↓
\[init count array size k+1 to 0]
↓
\[for each A\[i]] → increment count\[A\[i]]
↓
\[for i = 1 to k] → count\[i] += count\[i–1]
↓
\[for i = n–1 downto 0]
│ \[output\[count\[A\[i]]–1] = A\[i]]
│ \[count\[A\[i]]––]
└── end for
↓
\[Output sorted array]
↓
\[End]

```

### Dry-Run Example  
A = [2, 5, 3, 0, 2], k = 5:

1. **Count**: count = [1,0,2,1,0,1]  
2. **Prefix Sum**: count = [1,1,3,4,4,5]  
3. **Place in Output** by scanning back:
   - i=4 (2): output[2] = 2 → count[2]=2  
   - i=3 (0): output[0] = 0 → count[0]=0  
   - i=2 (3): output[3] = 3 → count[3]=3  
   - i=1 (5): output[4] = 5 → count[5]=4  
   - i=0 (2): output[1] = 2 → count[2]=1  
   Result: [0,2,2,3,5]

### Complexity  
- **Time**: O(n + k)  
- **Space**: O(n + k) auxiliary  

---
