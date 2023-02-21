# Programming 2 - Assignment 1

This template repository is the starter project for Programming 2 Assignment 1. Written in Java, and tested with Gradle/JUnit.

### Question(s)

1. Complete the method `String printShape(int row, char symbol)` that prints a certain pattern displayed as below:

(Note, for all `printShape` methods, you allow to use for loop to print a row, but you should only use recursion to shift from one row to another)

```java
5, @

@ @ @ @ @
@ @ @ @
@ @ @
@ @
@

// There is a space between each @
```

2. Given a string, compute recursively a new string where all the adjacent chars are now separated by a "\*".

allStar("hello") → "h\*e\*l\*l\*o"  
allStar("abc") → "a\*b\*c"  
allStar("ab") → "a\*b"

3. We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

countPairs("axa") → 1  
countPairs("axax") → 2  
countPairs("axbx") → 1

4. Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.

nestParen("(())") → true  
nestParen("((()))") → true  
nestParen("(((x))") → false
