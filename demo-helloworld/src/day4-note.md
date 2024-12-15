# Day 4

## switch vs if loop

- the case only can verify whether the value is equal to something, but no condition checking
- the break statement is necessary to stop the switch statement
- fit for the case that the value is limited to a certain range

### Example

```java
char gender = 'F';
switch (gender) {
  case 'M':
    System.out.println("Male");
    break;
  case 'F':
    System.out.println("Female");
    break;
```

## continue vs break

- continue: skip the current iteration and continue to the next nearest iteration
- break: stop the nearest loop