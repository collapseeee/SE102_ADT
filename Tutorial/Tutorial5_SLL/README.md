# Covid Vaccine Management System  (Tutorial 5 of 953102 ADT & Problem Solving)

## Overview  
This program implements a linked list to manage Covid-19 vaccination records. It stores applicant information, including their vaccine history, and provides operations such as insertion, deletion, and traversal of records.  

## Requirements  
- Java 8 or higher  
- IntelliJ IDEA or another Java IDE  

## Installation Instructions  
1. Download all source files:  
   - `CovidVaccine.java`  
   - `Vaccine.java`  
   - `Node.java`  
   - `LinkedList.java`  
   - `TutorialFifthMain.java`  
2. Open the project in your preferred IDE.  
3. Compile and run `TutorialFifthMain.java`.  

## Usage  
- The program starts by inserting 10 predefined applicants into a linked list.  
- It randomly deletes two applicants.  
- The remaining applicants are displayed.  
- The program then deletes all applicants and confirms the list is empty.  

To run the program, execute:  
```bash
javac *.java
java TutorialFifthMain
```  

## Features  
- **Linked List Implementation**: Stores and manages Covid-19 vaccination records.  
- **Insertion**: Adds new applicants to the list.  
- **Deletion**: Removes applicants based on their ID, either individually or completely.  
- **Traversal**: Displays all remaining applicants in the list.  

## Example Output  
```
Add 10 applicants to the list:  
[ 101, Alice Johnson  
  Vaccine Taken (2) : |Dose 1: Sinovac, SinoTech (Lot:B123)|, |Dose 2: Sinovac, SinoTech (Lot:B456)|. ]  
...  
Random delete two of them:  
[ 105, Emma Wilson ] is deleted from the list.  
[ 108, Henry Martinez ] is deleted from the list.  
...  
Delete all applicants.  
No remaining applicants.  
```  

## Credits  
**Author:** Nattikorn Sae-sue, 672115014 
Email: nattikorn_s@cmu.ac.th  
