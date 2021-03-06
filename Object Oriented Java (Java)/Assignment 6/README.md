### _Assignment 6_


Create 2 classes, _Stack_ and _Queue_, both of which will inherit from class LinkedList that we created together in class. (If you do not have a complete LinkedList class, contact me and I will give it to you.  
Here is what you have to do:  
In _linkedList_:  
**1.**  Add a variable of type int called count, which will keep track of how many nodes are in the list.  
**2.**  Make both variables count and head protected scope  

For _Stack_ and _Queue_, the order is based on the order in which they were added. These lists should not be sorted based on any value.
Therefore, the _insert_ and _delete_ methods must be overridden.  
In both _Stack_ and _Queue_:  
**1.**  Create one constructor that takes in a parameter of type int. The constructor should create a node with that int, and have the head variable point to it.  
**2.**  Create a method to override the parent classes insert method.   
**3.**  Create a method to override the parent classes delete method. (_See note at bottom_)  
**4.**  Remember to update the count variable in all 3 of these methods.   
**5.**  Create method clearAll in both classes. The method should look at the node at the top or front and print out to the console its int value, and then delete that node from the list, calling method delete. Continue printing and deleting until the structure (stack or queue) is empty. Use the count variable to determine when the structure is empty.  

For class _Stack_, the head variable should point to the node at the top of the stack.  
For class _Queue_, the head variable should point to the node at the front of the queue. In addition, I recommend that you have a   variable called _back_ or _last_ to point to the last node in the list.  

**IN ADDITION:**    
I want you to create a main method in another class called Assignment6.
The main method should create an instance of each of your classes, stack and queue.
Using a for loop, insert an object into both the stack and the queue for the numbers 1 through 20. (use the for loop counter as the parameter being passed to the insert method.

Then call method _clearAll_ from both the queue and the stack.

****Note****
The delete method in class _LinkedList_ took in an int as a parameter. In order for the children classes to override the parent classes' method, the method signature must match EXACTLY, including the parameter list. Therefore, the delete method of the children classes must take in an int value. The int taken as a parameter is NOT the value of the node to be deleted, since only one node could possibly be deleted in these structures (either the top or the front). Instead the int value is the number of nodes that should be deleted from the stack or queue. If the int passes as a parameter is greater than the number of nodes in the list, then the list should be completely emptied. Be careful to avoid null pointer exceptions.
