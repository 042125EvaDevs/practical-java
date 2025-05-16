# 📘 UnitTesting: Concepts + Practice

This guide is designed to help you learn through the development.
Each concept is explained and followed by targeted practice challenges and mini-projects.

---
## Concepts:

[//]: # 'concepts-start'


### ✅ What is Unit Testing?
- Testing the smallest testable parts of an application (e.g., functions/methods).
- Verifies correctness of code logic in isolation.

### ✅ JUnit Basics (JUnit 5)
- **Annotations**:
  - `@Test`: Marks a method as a test.
  - `@BeforeEach`, `@AfterEach`: Run before/after each test.
  - `@BeforeAll`, `@AfterAll`: Run once before/after all tests.
- **Assertions**:
  - `assertEquals`, `assertTrue`, `assertThrows`, `assertNotNull`, etc.

### ✅ Test Structure
- **Arrange**: Setup test data and dependencies.
- **Act**: Execute the method being tested.
- **Assert**: Verify the result.

### ✅ Testing Edge Cases
- Null inputs, boundary conditions, invalid data.

### ✅ Mocking with Mockito
- Used to isolate units by mocking dependencies (e.g., database, services).
- Key methods:
  - `Mockito.mock()`, `when().thenReturn()`, `verify()`.

### ✅ Best Practices
- Write testable code (single responsibility, fewer side effects).
- Keep tests independent and fast.
- Name tests clearly (e.g., `calculateTotal_shouldReturnCorrectSum`).

---

[//]: # 'concepts-end'

---

## Practice:

[//]: # 'practice-start'


1. **Basic Calculator Test**
  - Create a Calculator class and test `add`, `subtract`, `multiply`, and `divide` methods using JUnit.

2. **Edge Case Testing**
  - Test division by zero and null inputs in a utility class.

3. **Setup and Teardown**
  - Use `@BeforeEach` and `@AfterEach` to initialize shared test data.

4. **Object Equality**
  - Create a `User` class and test its `equals()` and `hashCode()` methods.

5. **Mocking a Service**
  - Use Mockito to mock a `UserRepository` in a `UserService` class and test without connecting to a real database.

6. **Verify Method Calls**
  - Ensure a method in a mocked dependency was called exactly once.

7. **Exception Testing**
  - Test a method that throws a custom exception under invalid conditions using `assertThrows`.

8. **Parameterized Tests**
  - Use `@ParameterizedTest` to test a method with multiple inputs.

---

[//]: # 'practice-end'

---

# 🧩 Challenge

[//]: # 'challenges-start'


### 🔹 1. String Reversal
**Problem**: Write a method that takes a string and returns its reverse.  
**Method Signature**: `String reverse(String input)`  
**Test Cases**:
- Normal string
- Empty string
- Null input

---

### 🔹 2. Palindrome Checker
**Problem**: Check whether a given string is a palindrome.  
**Method Signature**: `boolean isPalindrome(String input)`  
**Test Cases**:
- Palindrome with and without case
- Spaces and punctuation
- Null and empty strings

---

### 🔹 3. Factorial Calculator
**Problem**: Calculate the factorial of a number.  
**Method Signature**: `int factorial(int n)`  
**Test Cases**:
- Positive numbers
- `n = 0`
- Negative input (should throw an exception)

---

### 🔹 4. FizzBuzz
**Problem**: Return a list from 1 to `n`, replacing multiples of 3 with "Fizz", 5 with "Buzz", and both with "FizzBuzz".  
**Method Signature**: `List<String> fizzBuzz(int n)`  
**Test Cases**:
- Small and large `n`
- Edge case: `n = 0`

---

### 🔹 5. Array Max Value
**Problem**: Return the maximum value in an integer array.  
**Method Signature**: `int findMax(int[] numbers)`  
**Test Cases**:
- Regular array
- Array with negatives
- Single-element array
- Empty array (should handle gracefully or throw)

---

### 🔹 6. Prime Number Checker
**Problem**: Determine if a number is prime.  
**Method Signature**: `boolean isPrime(int number)`  
**Test Cases**:
- Prime and non-prime numbers
- `n = 0`, `n = 1`
- Negative input

---

### 🔹 7. Email Validator
**Problem**: Validate if a string is a correctly formatted email.  
**Method Signature**: `boolean isValidEmail(String email)`  
**Test Cases**:
- Valid and invalid formats
- Empty string
- Null input

---

### 🔹 8. Anagram Checker
**Problem**: Check if two strings are anagrams of each other.  
**Method Signature**: `boolean areAnagrams(String a, String b)`  
**Test Cases**:
- Same letters, different order
- Different lengths
- Null inputs

---

### 🔹 9. Sum of Digits
**Problem**: Return the sum of all digits in a number.  
**Method Signature**: `int sumDigits(int number)`  
**Test Cases**:
- Positive number
- Negative number
- Zero

---

### 🔹 10. Word Counter
**Problem**: Count how many times a word appears in a given sentence.  
**Method Signature**: `int countWord(String sentence, String word)`  
**Test Cases**:
- Case sensitivity
- Word not found
- Empty sentence or null input

[//]: # 'challenges-end'

---

✅ **Tip:** Tackle each practice during the Sprint.
