# > Backtracking

## 1. What Is Backtracking?

Backtracking incrementally constructs candidates—typically via recursion—and abandons a path (“backtracks”) upon hitting a dead end (i.e., when constraints are violated).  It differs from naïve brute‐force by pruning the search tree early, avoiding exploration of infeasible subtrees.  Conceptually, you can view backtracking as depth-first search on an implicit tree of partial solutions, with each level representing a choice point for the next component of the solution.

---

## 2. Core Algorithm & Pseudocode

### 2.1 Generic Backtracking Template

```pseudo
procedure backtrack(candidate):
  if is_solution(candidate):
    output(candidate)
    return
  for choice in possible_choices(candidate):
    if is_valid(candidate, choice):
      candidate.add(choice)
      backtrack(candidate)
      candidate.remove(choice)   # undo choice (“backtrack”)
```

* **`is_solution`** checks if the candidate meets all completion criteria.
* **`possible_choices`** generates the next options to try.
* **`is_valid`** enforces problem constraints (pruning).

### 2.2 Flowchart

```
[Start backtrack(candidate)]
       ↓
[is_solution?]──Yes──▶[record solution]──┐
       ↓No                              │
[for each choice]                      │
   ↓                                   │
[is_valid?]──No──▶[next choice]◀───────┘
   ↓Yes
[candidate.add(choice)]
       ↓
[backtrack(candidate)]
       ↓
[candidate.remove(choice)]
       ↓
[return from for-loop]
       ↓
[End]
```

---

## 3. Classic Examples

### 3.1 N-Queens Problem

Place N queens on an N×N board so that no two threaten each other.  At each row, try each column; if placing a queen is valid (no shared column or diagonal), recurse to the next row; else backtrack.

**Dry-Run (N=4)**:

1. Place Q at (0,1) → valid → recurse.
2. Row 1: try col=0 → conflict on diagonal → backtrack.
3. Try col=2 → valid → recurse…

**Result**: Two solutions:

```
. Q . .
. . . Q
Q . . .
. . Q .
```

and its mirror.

### 3.2 Subset-Sum / All Subsets

To generate all subsets of an array, at each index you choose to **include** or **exclude** the current element, recurse on the next index, then undo the choice.

```pseudo
procedure subsets(i, current):
  if i == n:
    output(current)
    return
  subsets(i+1, current)                # exclude arr[i]
  current.add(arr[i])
  subsets(i+1, current)                # include arr[i]
  current.remove_last()
```

### 3.3 Permutations

To list all permutations of N elements, swap the current index with each index ≥ current, recurse on the next position, and swap back.

```pseudo
procedure permute(i):
  if i == n:
    output(arr)
    return
  for j from i to n–1:
    swap(arr[i], arr[j])
    permute(i+1)
    swap(arr[i], arr[j])               # backtrack swap
```

---

## 4. Time & Space Complexity

* **Time Complexity**: In the worst case, backtracking explores all candidate states.  If each of *n* levels has up to *b* choices, worst‐case time is *O(bⁿ)*. Pruning via `is_valid` can reduce branching drastically in practice.
* **Space Complexity**: Requires *O(n)* stack space for recursion plus space for the current candidate (often *O(n)*), yielding *O(n)* total auxiliary space.

---

## 5. Common Applications

* **Constraint Satisfaction**: Sudoku, Latin squares, graph coloring.
* **Combinatorial Generation**: Permutations, combinations, subsets.
* **Puzzle Solving**: Maze pathfinding, Knight’s tour, Kakuro.
* **Decision Trees**: Parsing with backtracking in compilers, regular‐expression matching.

---

Understanding backtracking equips you to tackle a wide class of recursive, combinatorial problems by systematically exploring and pruning the search space, trading off exponential worst‐case time for clarity, flexibility, and often surprising efficiency in constrained domains.