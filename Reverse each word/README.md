# [Reverse each word](https://www.hackerrank.com/contests/grapecity-coding-questions/challenges/reverse-each-word-2)

Write a program that takes a sentence as input and reverses each word in the sentence.

Input Format

A single string

Constraints

length of string > 0

Output Format

A single string with each word reversed

Sample Input 0

Hello World
Sample Output 0

olleH dlroW
Sample Input 1

Good morning
Sample Output 1

dooG gninrom



# Solution

This Java program reads a sentence from the standard input (keyboard), reverses each word in the sentence, and then prints the sentence with the reversed words to the standard output (console).

Here's a step-by-step explanation of how the code works:

1. Import necessary Java libraries:
   - `java.io.*`: This import is for handling input and output operations.
   - `java.util.*`: This import is for using utility classes, including `Scanner` for reading input.

2. Define the `Solution` class with the `main` method:
   - The `main` method is the entry point of the program, where the execution begins.

3. Create a `Scanner` object (`scn`) to read input from the standard input (keyboard).

4. Read a line of input from the user using `scn.nextLine()`. This input is expected to be a sentence.

5. Split the input sentence into an array of words:
   - The `split(" ")` method is used to split the sentence into separate words based on the space character (" ").
   - The resulting array `arr` contains individual words from the input sentence.

6. Initialize an empty string `ans` to store the final sentence with reversed words.

7. Iterate through each word in the `arr` array:
   - For each word, a temporary string `temp` is created to store the current word.
   - Another empty string `defaultString` is initialized to store the reversed version of the word.

8. Nested loop to reverse each word:
   - Inside the nested loop, iterate through each character of the `temp` string from the end to the beginning (reversal process).
   - Append each character to the `defaultString`, effectively reversing the word.

9. After reversing all characters in a word, append the `defaultString` followed by a space to the `ans` string. This adds the reversed word back to the sentence.

10. Repeat steps 7-9 for all words in the input sentence, effectively reversing all of them.

11. Finally, print the `ans` string, which is the original sentence with each word reversed.

Here's an example of how the program works:
Input: "Hello World"
Output: "olleH dlroW "

The program reads "Hello World" as input, splits it into two words, reverses each word, and prints "olleH dlroW " as the output.
