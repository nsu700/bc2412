# for loop

## Syntax

```java
for (initialization; termination; increment) {
    statement(s)
}
```

When using this version of the for statement, keep in mind that:

- The initialization expression initializes the loop; it's executed once, as the loop begins.
- When the termination expression evaluates to **false**, the loop terminates.
- The increment expression is invoked **after** each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
- The scope of this variable **extends from its declaration to the end of the block** governed by the for statement, so it can be used in the termination and increment expressions as well. The names i, j, and k are often used to control for loops; declaring them within the initialization expression limits their life span and reduces errors.

### My understanding

- The termination will only terminate the loop while its expression result is false, in exercises/exercise1.java, I got a misunderstanding that why the termination cannot be "i==end" in line 19, so I test it out and found
  - If the starter is not equal to the end, the loop will not even start, because the terminator is false, so according to above, the loop should not happen
  - If the starter is equal to the end, the loop will start once, as ther terminator is true at first, so enter the loop and run the statement, and then run i++ which cause i not equal to end, hence terminated

## Reference:

oracle doc<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html>
