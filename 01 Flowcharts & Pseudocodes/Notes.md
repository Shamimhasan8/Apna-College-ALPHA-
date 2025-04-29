<<<<<<<<Flowcharts & Pseudocodes>>>>>>>>

## What Is a Flowchart?

### Definition and Purpose  
Flowcharts are graphical representations of an algorithm or process, showing each step as a symbol connected by arrows to indicate control flow. They’re widely used in software development, business process modeling, and engineering to clarify complex workflows and communicate logic across teams.

### Common Symbols  
- **Terminator (Start/End)**: Oval indicating entry or exit points of the process.   
- **Process**: Rectangle representing an operation or action (e.g., `calculateSum()`).
- **Decision**: Diamond denoting a conditional branch (`if…else`).  
- **Input/Output**: Parallelogram used for data entry or display (`readInt()`, `print()`). 
- **Arrow**: Shows the direction of flow from one step to the next. 

### Steps to Create a Flowchart  
1. **Define Purpose & Scope**: Decide start/end points and the goal of the algorithm.  
2. **Identify Tasks**: List all steps in chronological order.  
3. **Select Symbols**: Choose appropriate diagram shapes for each task.  
4. **Draw & Connect**: Lay out symbols and connect them with arrows to represent control flow.  
5. **Review & Refine**: Ensure clarity, remove redundancies, and adjust for readability.

### Example Flowchart  

Consider an algorithm to check whether a number is even or odd:

```
   [Start]
      ↓
  [Input n]
      ↓
┌─ Is n % 2 == 0? ─┐
│       Yes         │
│  [Print "Even"]   │
└───────────────────┘
      ↓ No
  [Print "Odd"]
      ↓
   [End]
```

---

## What Is Pseudocode?

### Definition and Purpose  
Pseudocode is an informal, high-level description of an algorithm that uses structured conventions to outline logic in plain language—without the syntax constraints of real code. It helps focus on algorithm design rather than language specifics, making it ideal for planning, teaching, and peer review.

### Writing Guidelines  
1. **Use Clear English-like Keywords**: Write `IF`, `ELSE`, `FOR`, `WHILE` in uppercase for readability.  
2. **Indentation for Structure**: Indent nested steps to show hierarchy. 
3. **Descriptive Naming**: Use simple, distinct identifiers (`count`, `sum`).  
4. **Avoid Language-Specific Syntax**: Don’t require semicolons, type declarations, or exact loop syntax.  
5. **Focus on Logic & Flow**: Emphasize algorithmic steps, decisions, and loops over implementation details.

### Example Pseudocode  
Algorithm: Check Even or Odd  
```
BEGIN
  PROMPT "Enter a number"
  READ n
  IF n MOD 2 == 0 THEN
    PRINT "Even"
  ELSE
    PRINT "Odd"
  ENDIF
END
```

---

## Key Differences

| Aspect              | Flowchart                                     | Pseudocode                                           |
|---------------------|-----------------------------------------------|------------------------------------------------------|
| **Format**          | Visual symbols & arrows                       | Textual, structured English-like statements          |
| **Detail Level**    | Good for high-level overviews                 | Can include fine-grained logic                       |
| **Complexity**      | Too many symbols can clutter the chart        | Scales well for long algorithms                      |
| **Accessibility**   | Easier for non-programmers and stakeholders   | Preferred by developers for precise algorithm design |
| **Editing**         | Requires redrawing when logic changes         | Easy to update and iterate                           |

---

## When to Use Which

- **Use Flowcharts** when you need a quick visual summary, to explain logic to non-technical audiences, or to model business workflows.  
- **Use Pseudocode** when you’re designing complex algorithms, need to convey detailed logic to developers, or want a text-based blueprint before coding.