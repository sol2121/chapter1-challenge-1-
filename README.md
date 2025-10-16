# 🕵️ Challenge 1.1: The Cryptic Message Decoder (Variables & Operators)

## 📁 Project Name:
**Chapter1_Challenge_1_1**

---

## 📜 Challenge Description (In My Own Words):

In this challenge, I played the role of a secret agent who intercepted a cryptic message hidden inside a number. The goal was to extract meaningful information (a secret code) from a single positive integer using only **variables** and **arithmetic operators** — without any `if` statements or loops.

The program:
- Takes a positive integer as input.
- Extracts specific digits (first, second, second-last, and last).
- Computes:
  - The product of the **first** and **last** digits.
  - The sum of the **second** and **second-last** digits.
- Concatenates the product and sum into a final decrypted code.

---

## ✅ Example Input/Output:

### Example 1:
**Input:**
13579

makefile
Copy code

**Output:**
The decrypted code is: 910

yaml
Copy code

**Explanation:**
- First digit: `1`
- Last digit: `9`
- Product: `1 * 9 = 9`
- Second digit: `3`
- Second-last digit: `7`
- Sum: `3 + 7 = 10`
- Final code: `"9" + "10"` → `910`

---

## 🧠 Reflection

### ✅ What I Learned:
- How to extract digits from any position in a number using just math.
- Using `Math.log10()` to determine the number of digits in a number.
- How to avoid using conditionals or loops by relying purely on mathematical logic.
- The importance of thinking in terms of **place values** when dealing with digits.

### 😅 What Was Difficult:
- Figuring out how to extract the **second** and **second-last** digits without converting the number to a string.
- Keeping everything purely numeric without using arrays, strings, or loops.
- Ensuring the solution works for all valid positive integers with enough digits.

---

## 💡 Technologies Used:
- Java
- Scanner for user input
- Math operators and functions (`/`, `%`, `Math.log10()`)

---

## 🚀 How to Run This Program:

1. Clone the repository:
```bash
git clone https://github.com/your-username/Chapter1_Challenge_1_1.git
cd Chapter1_Challenge_1_1
Compile and run the program:

bash
Copy code
javac Main.java
java Chapter1_Challenge_1_1.Main
🔚 Final Thoughts:
This challenge helped reinforce the power of basic operators and clean logic. It’s a great exercise in precision and problem decomposition — perfect for mastering early Java programming concepts.

yaml
Copy code

---

### ✅ Next Steps:
- Save this as `README.md` and place it in your project folder.
- Commit and push your code + README to its own GitHub repository.

Would you like a `.zip` of the project with this file included, or do you need Git instructions for pushing it to GitHub?


