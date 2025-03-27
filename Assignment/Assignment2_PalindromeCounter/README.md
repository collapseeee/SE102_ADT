# SE102 ADT & Problem Solving's Programming Assignment 2.

## Overview
This program processes text files to analyze various aspects of the text, such as counting characters, detecting palindromes, identifying emoticons, and calculating token statistics. The program includes two Java files: `Main.java` and `Counter.java`.

## Requirements
- Java 8 or higher
- Terminal/Command line
- Input text file (.txt format that less than 10 A4-pages.)

## Compiling Instructions
1. Clone or download this repository to your local machine and unzip the downloaded file (ensure both `Main.java` and `Counter.java` are included).
2. Open the terminal and navigate to the directory containing the Java files.
3. Compile the program by running the following command:
   ```
   javac Main.java
   ```
4. You will get two class files: `Main.class` and `Counter.class`.

## Running Instructions
1. Place your input `.txt` file in the same directory as the compiled `.class` files.
2. Run the program using the following command:
   ```
   java Main [filename]
   ```
   Replace `[filename]` with the name of your text file (e.g., `input1.txt`).

   Example command:
   ```
   java Main input1.txt
   ```
3. If you run the program without specifying a filename, it will terminate and prompt you to provide a file name.

## Features
The program provides the following output statistics:
1. **Total # Character count**: The total number of characters across all tokens.
2. **Total # Palindrome found**: The number of palindromes detected in the text.
3. **Total # Token**: The total number of tokens (words).
4. **Total # Emoticon**: The total number of emoticons detected.
5. **The longest token size**: The length and value of the longest token.
6. **The average token size**: The average size of all tokens.

## Expected Input and Output
- Input File Example (`input1.txt`):
  ```
  Here are a few suggestions that might help. :D
  Hello there! Did you find this example helpful? :)
  
  ```
- Run Command:
  ```
  java Main input1.txt
  ```
- Program Output:
  ```
  
  Program start:
  
  Total # Character count: 134
  Total # Palindrome found: 2
  Total # Token: 22
  Total # Emoticon: 2
  The longest token size: 10 (The token: `suggestions`)
  The average token size: 6.0909090909
  Total time to execute this program: 1.0 millisecond.

  The program terminate properly!
  
  ```

## Notes
- Palindromes are case-insensitive and are detected recursively.
- Emoticons are detected based on a predefined pattern (`:D`, `:)`, `:(`, `:P`, `:O`).
- The program calculates statistics efficiently and provides the execution time for performance evaluation.

## Troubleshooting
1. **"java -version" Error**: Ensure your PATH environment variable includes the Java bin directory (e.g., `C:\Program Files\Java\jdk1.8.0_xx\bin`).
2. **File Not Found**: Verify that the file exists in the directory and the filename is correctly specified.
3. **Classpath Issues**: If you encounter errors, try running the program with the classpath explicitly defined:
   ```
   java -cp . Main input1.txt
   ```
4. **Output Discrepancies**: Ensure the input file uses valid text encoding and does not include unexpected special characters.

## Contact
For any issues or questions, please contact:
- Author: Nattikorn Sae-sue (ID: 672115014)
- Email: nattikorn_s@cmu.ac.th

