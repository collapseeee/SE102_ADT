
# Queue Implementation and Program Interaction

## Description
This project demonstrates the implementation of a simple **Queue** data structure in Java and provides an interactive program for users to test its functionality.

The project consists of two files:
1. **Queue.java**: Contains the `Queue` class that defines the structure and behavior of the queue.
2. **QueueMain.java**: Provides a user interface for interacting with the queue via console input.

---

## Features
- **Queue Operations**:
  - Enqueue: Add an element to the queue.
  - Dequeue: Remove an element from the queue.
  - Display: View the current elements in the queue, along with their indices.
  - Size, isEmpty, isFull: Helper methods for queue status.
- **Interactive Input**:
  - Users can input names to add to the queue.
  - Type `dequeue` to remove the front element.
  - Type `quit` to exit the program gracefully.

---

## How to Run
1. Compile the project files:
   ```bash
   javac Queue.java QueueMain.java
   ```
2. Run the main program:
   ```bash
   java QueueMain
   ```

---

## Instructions
1. Start the program and follow the prompt:
   - Enter names to add them to the queue.
   - Enter `dequeue` to remove the front of the queue.
   - Enter `quit` to terminate the program.

2. Queue operations will display relevant messages and the current state of the queue.

---

## Example Output
```
Please enter student names (enter 'quit' to exit the program):
Alice
Enqueue Alice
[Alice, null, null, null, null] [first = 0, rear = 1, length = 1]
Bob
Enqueue Bob
[Alice, Bob, null, null, null] [first = 0, rear = 2, length = 2]
dequeue
Dequeue Alice
[null, Bob, null, null, null] [first = 1, rear = 2, length = 1]
Charlie
Enqueue Charlie
[null, Bob, Charlie, null, null] [first = 1, rear = 3, length = 2]
quit
The program terminate properly.
```

---

## Files
### Queue.java
Defines the `Queue` class, including:
- Attributes: `front`, `rear`, `maxSize`, and `queue[]`.
- Methods:
  - `enqueue(String name)`: Adds an element to the queue.
  - `dequeue()`: Removes the front element.
  - `display()`: Prints the current state of the queue.
  - `size()`, `isEmpty()`, `isFull()`: Utility methods.

### QueueMain.java
Contains the `main()` method for interacting with the queue. Includes:
- User input handling.
- Integration of queue operations.

---

## Author
- **Nattikorn Sae-sue**
  - **Email**: nattikorn_s@cmu.ac.th
  - **Student ID**: 672115014
