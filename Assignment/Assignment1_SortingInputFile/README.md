# SE102 ADT & Problem Solving's Programming Assignment 1.

## Overview
A program to sort student by student's first name, last name and id. Also can search for student's first name.
A program included 3 files; _Program.java_, _Student.java_, and _Sorting.java_. 

## Requirements
- Java 8 or higher
- Terminal/Command line
- CSV file

## Compiling Instructions
1. Clone or download this repository to your local machine and unzip the downloaded file. (must included all the java file)
2. Open the terminal and go to the directory where you stored this repository.
3. Once you get to the directory with all the java file.
   Run the command in your terminal:
   ```
     javac Program.java
   ```
5. You will get 3 class files; Program.class, Student.class, and Sorting.class

## Running Instructions
1. Put your .csv file in the same directory as the java files.
2. For the command:
   _-f_ to sort the students by first name.
   _-l_ to sort the students by last name.
   _-n_ to sort the students by student ID.
   _-s- to search the student first name. **(This command is available after do the sort.)**
   To run the command use this format:
   ```
     java Program [command] [filename]
   ```
   for example, to sort the "953102_studentlit.csv" by students first name. Run:
   ```
     java Program -f 953102_studentlist.csv
   ```
4. The result will be the output of sorted student list base on your command given.
   for example, to sort the "953102_studentlist.csv" by students first name.
   ```
   652115002 ADAM ANGEL
   622115054 BETTY SLEEP
   632115001 CATHERINE FLY
   .
   .
   .
   662145004 ZAPHYR ROSE
   ```
5. You will get the sorted list in _”sortedstudent.csv”_ file. This file will be used for searching student later.
6. In case if you want to search if the student first name is in the list or not you can perform after do the sorting command by Run this format :
   ```
   javac Program -s [firstname]
   ```
   for example, to search for student name “Catherine” in "953102_studentlist.csv".
   ```
   java Program -f 953102_studentlist.csv
   java Program -s Catherine
   ```

## Expected output
### - CSV File Input (Example file name: 953102_roster.csv):
   ```csv file contain
Header1
Header2
.
.
.
Header7
1,675000007,DAVE,FAST
2,675000002,BETTY,BECKER
3,635000013,SAMANTHA,ARMSTRONGER
4,675000001,ALAN,DEEP
5,625000007,ZOEY,CREAM
   ```
   
### - Output:
#### Run command: % java Program -f 953102_roster.csv
   ```run the -f command.
   675000001 ALAN DEEP
   675000002 BETTY BECKER
   675000007 DAVE FAST
   635000013 SAMANTHA ARMSTRONGER
   625000007 ZOEY CREAM
   ```

#### Run command: % java Program -l 953102_roster.csv
   ```run the -l command.
   635000013 SAMANTHA ARMSTRONGER
   675000002 BETTY BECKER
   625000007 ZOEY CREAM
   675000001 ALAN DEEP
   675000007 DAVE FAST
   ```

#### Run command % java Program -n 953102_roster.csv
   ```run the -n command.
   625000007 ZOEY CREAM
   635000013 SAMANTHA ARMSTRONGER
   675000001 ALAN DEEP
   675000002 BETTY BECKER
   665000007 DAVE FAST
   ```

#### Run command % java Program -s Betty after -n sorting.
   ```run the -s command after do -n sorted.
   Found at index 3.
   ```
#### Run command % java Program -s John after -n sorting.
   ```
   Not found.
   ```
