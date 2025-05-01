# > Conditional Statement

## Overview of Conditional Statements

Conditional statements enable a program to make decisions and execute code selectively based on boolean evaluations. They break the linear flow of execution by introducing branches, allowing different paths of code to run under different conditions. Java’s main decision-making tools include the `if`, `if-else`, `if-else-if` ladder, nested `if`, and `switch` statements, as well as the ternary operator for concise checks.

---

## 1. `if` Statement

1. The simplest conditional construct is the `if` statement, which evaluates a boolean expression and executes its body only if the expression is true.  
2. Its syntax follows the pattern `if (condition) { statements; }`, where `condition` must yield a boolean result.  
3. For example, `if (score >= 50) { System.out.println("Pass"); }` prints “Pass” only when `score` is at least 50.

---

## 2. `if-else` Statement

1. The `if-else` statement extends `if` by providing an `else` block that runs when the `if` condition is false.  
2. Its structure is `if (condition) { ... } else { ... }`, ensuring exactly one of the two blocks executes on each evaluation.  
3. For instance,  
   ```java
   if (num % 2 == 0) {
       System.out.println("Even");
   } else {
       System.out.println("Odd");
   }
   ```  
   differentiates even and odd numbers.

---

## 3. Nested `if` Statements

1. Nested `if` statements place one `if` (or `if-else`) entirely within the body of another to handle hierarchical conditions.  
2. This is useful when a secondary condition should only be checked if the primary condition holds, as in checking both age and citizenship before voting eligibility.

---

## 4. `if-else-if` Ladder

1. The `if-else-if` ladder allows checking multiple conditions sequentially by chaining `else if` clauses after an initial `if`.  
2. Java evaluates each `condition` in order and executes the block for the first true one, falling back to an optional `else` if none match.

---

## 5. `switch` Statement

1. The `switch` statement selects among many code blocks based on the value of a single expression, using `case` labels to mark each branch.  
2. The `break` keyword terminates a `case` block to prevent “fall-through” into subsequent cases, while `default` handles unmatched values.  
3. For example:  
   ```java
   switch (day) {
       case 1: System.out.println("Monday"); break;
       case 2: System.out.println("Tuesday"); break;
       default: System.out.println("Weekend");
   }

---

## 6. Ternary (`?:`) Operator

1. The ternary operator provides a compact, expression-based conditional: `condition ? exprIfTrue : exprIfFalse`.  
2. It is ideal for simple assignments like  
   ```java
   String result = (a > b) ? "Greater" : "Lesser";
   ```  
   reducing verbose `if-else` blocks.
