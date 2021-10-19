Lab 5. Linked Lists and Interfaces

Due Oct 27 at the start of class.

In this lab, we'll be learning about linked lists and interfaces and implementing a Linked List, using the starter code provided here. We'll use generics, and an inner class for the node. For each step, please use JUnit to create unit tests - this will be especially helpful in this case.

The lab will be graded according to the specifications grading method described in the syllabus. Specifically:

A completed, on-time lab is worth 2 points.

A lab that is late or incomplete is worth 1 point.

A lab that is missing is worth 0 points.

Task 1: Implement the following methods in safeIntArrayIterator:
- hasNext()
- next()
- remove()
- constructor()


Task 2: Implement the addInFront, print() and remove() methods. Create a unit test that tests your list with both Strings and Integers. 

Task 3: Implement contains().

Task 4: Implement the prev and tail references so that you have a doubly linked list. Modify remove() accordingly.

Task 5: Now let's subclass LinkedList to make a SortedLinkedList. It will keep all items in sorted order using insertionSort. You should implement the Comparable interface on the Node class.

Task 6: Now create Stack and Queue interfaces that your LinkedList implements. Stack should implement push() and pop(), and Queue should implement enqueue() and dequeue(); Extend LinkedList to implement these interfaces.

