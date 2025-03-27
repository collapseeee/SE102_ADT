# Graph Adjacency List 
From SE102 ADT & Problem Solving (Section 701) Tutorial 7.

## Overview  
This program allows users to input graph edges and constructs an adjacency list representation. It supports bidirectional edges and handles invalid inputs gracefully.  

## Requirements  
- Java 8 or higher  
- IntelliJ IDEA or another Java IDE  

## Installation Instructions  
1. Download the source files:  
   - `Main.java`  
   - `AdjacencyList.java`  
2. Open the project in your preferred IDE.  
3. Compile and run `Main.java`.  

## Usage  
1. Run the program.  
2. Enter graph edges in the format `node1-node2` (e.g., `1-2`).  
3. Press Enter after each edge.  
4. Leave a blank line to finish input.  
5. The adjacency list of the graph will be displayed.  

To run the program, execute:  
```bash
javac *.java
java Main
```  

## Features  
- **Adjacency List Representation**: Uses a `HashMap` to store graph edges.  
- **Dynamic Input Handling**: Allows users to enter edges interactively.  
- **Error Handling**: Detects invalid inputs and prompts for corrections.  

## Example  
**Input:**  
```
0-1
0-2
1-2
1-3
2-4
```
**Output:**  
```
Adjacency List of the Graph:  
0 -> 1 2
1 -> 0 2 3 
2 -> 0 1 4  
3 -> 1  
4 -> 2  
```  

## License  
This project is for educational purposes only.  

## Credits  
**Author:** Nattikorn Sae-sue  
Email: nattikorn_s@cmu.ac.th  
