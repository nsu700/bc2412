# Day 2 Notes

## Operators

- no *,/,- on String operations
- no ++, -- on String operations
- int++ means int plus 1 after it finish its current operation
- ++int means int plus 1 before it finish its current operation
- int-- means int minus 1 after it finish its current operation
- --int means int minus 1 before it finish its current operation

## Compose operators

- a+=b means a=a+b
- a-=b means a=a-b
- a*=b means a=a*b
- a/=b means a=a/b
- a%=b means a=a%b

## Bad practice

- How to compare a string is empty?
Never write in this format `boolean isStringEmpty = yourString.equals("");`

- Test case
Never based on coding to create test case, test case should be created based on requirement

## Good practice

### Test case

1. Based on requirement, create test case and define expected result
2. Create coding
3. Run against the test case and verify the actual result
