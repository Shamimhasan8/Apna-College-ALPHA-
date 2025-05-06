# > Bit Manipulation

## 1. Preliminaries
Before diving into individual operations, recall these bitwise fundamentals for an integer `n` and position `i` (0-based, where 0 is the least significant bit):

* **Left Shift**: `1 << i` produces a mask with only the iᵗʰ bit set to 1.
* **Bitwise AND** (`&`): preserves bits where both operands have 1.
* **Bitwise OR** (`|`): sets bits where either operand has 1.
* **Bitwise NOT** (`~`): flips all bits in the operand.
* **Bitwise XOR** (`^`): sets bits where operands differ.

---

## 2. Get iᵗʰ Bit

### Formula & Code

```java
boolean isSet = (n & (1 << i)) != 0;
```

* We create a mask `1 << i` with the iᵗʰ bit as 1.
* `n & mask` isolates that bit; if non-zero, the bit was 1.

### Flowchart

```
[Start]
   ↓
[Compute mask = 1 << i]
   ↓
[Compute result = n & mask]
   ↓
[Is result != 0?]──Yes──→[Bit is 1]
          │No
          ↓
     [Bit is 0]
   ↓
[End]
```

### Dry-Run Example

Let `n = 13 (1101₂)`, `i = 2`:

| Step          | Value                     |
| ------------- | ------------------------- |
| mask = 1 << 2 | 0100₂ (4)                 |
| n & mask      | 1101₂ & 0100₂ = 0100₂ (4) |
| result != 0?  | true → bit is 1           |

---

## 3. Set iᵗʰ Bit

### Formula & Code

```java
n = n | (1 << i);
```

* `1 << i` creates the mask.
* `n | mask` sets the iᵗʰ bit to 1, leaving other bits unchanged.

### Flowchart

```
[Start]
   ↓
[Compute mask = 1 << i]
   ↓
[Compute n = n | mask]
   ↓
[End]
```

### Dry-Run Example

Let `n = 9 (1001₂)`, `i = 1`:

| Step          | Value     |       |                    |
| ------------- | --------- | ----- | ------------------ |
| mask = 1 << 1 | 0010₂ (2) |       |                    |
| n             | mask      | 1001₂ | 0010₂ = 1011₂ (11) |

---

## 4. Clear iᵗʰ Bit

### Formula & Code

```java
n = n & ~(1 << i);
```

* Generate mask `1 << i`, then invert it with `~`, producing all 1s except a 0 at position i.
* `n & invertedMask` clears the iᵗʰ bit to 0.

### Flowchart

```
[Start]
   ↓
[Compute mask = 1 << i]
   ↓
[Compute invertedMask = ~mask]
   ↓
[Compute n = n & invertedMask]
   ↓
[End]
```

### Dry-Run Example

Let `n = 11 (1011₂)`, `i = 1`:

| Step                  | Value                         |
| --------------------- | ----------------------------- |
| mask = 1 << 1         | 0010₂ (2)                     |
| invertedMask = \~mask | …1101₂ (all ones except bit1) |
| n & invertedMask      | 1011₂ & …1101₂ = 1001₂ (9)    |

---

## 5. Update iᵗʰ Bit

### Formula & Code

```java
// To set ith bit to value b (0 or 1):
n = (n & ~(1 << i)) | ((b & 1) << i);
```

1. **Clear** the iᵗʰ bit: `n & ~(1 << i)`.
2. **Set** it to `b`: `(b & 1) << i`, then OR with cleared value.

### Flowchart

```
[Start]
   ↓
[Compute clearMask = ~(1 << i)]
   ↓
[Compute n_cleared = n & clearMask]
   ↓
[Compute newBit = (b & 1) << i]
   ↓
[Compute n = n_cleared | newBit]
   ↓
[End]
```

### Dry-Run Example

Let `n = 10 (1010₂)`, `i = 2`, `b = 0`:

| Step                       | Value                       |
| -------------------------- | --------------------------- |
| clearMask = \~(1 << 2)     | …1011₂                      |
| n\_cleared = n & clearMask | 1010₂ & …1011₂ =  1000₂ (8) |
| newBit = (0 & 1) << 2      | 0000₂                       |
| n = n\_cleared \| newBit   | 1000₂ (8)                   |

Changing `b` to 1 would yield `newBit = 0100₂` and final `n = 1100₂ (12)`.

---

## Complexity & Use Cases

Each of these bit operations runs in **O(1)** time and uses **O(1)** extra space, making them ideal for performance-critical code such as embedded systems, graphics, and cryptography. Understanding these primitives is foundational for advanced bitmasking techniques, data compression, and competitive programming.
