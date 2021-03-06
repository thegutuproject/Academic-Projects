/**
 * Created by alexandrugutu on 3/6/14.
 */

/**
 *

 1)  Based on the classes that we created in lecture named Node and LinkedList
 (which we used to make a one-directional linked list) create a method replace in class LinkedList, which will:
 a)  find a node whose value matches the first value passed as a parameter
 b) remove that node
 c) create a new node, with the second value that was passed as a parameter
 d) insert that new node in that same place in the linked list where the other node was removed
 **** To think about****
 This replace method inserts the new node in the same place that the other node was
 deleted, however that might not be the correct place for this node (if we are keeping the list
 sorted). As a result you cannot call methods delete or insert here.
 **********************
 2) Create a method called sum that will traverse (travel through) all of the nodes in a
 linked list and output (JOptionPane or to the console) the sum of the integers off all of those nodes.
 **********************
 3) Create the method replace in class LinkedList2
 You can submit all 3 methods in one file, or you can place the methods in the LinkedList and
 LinkedList2 classes and submit the entire classes

 *
 **/

public class Driver {

	public static void main(String[] args)
	{
		LinkedList testing = new LinkedList(15);

		testing.append(19);
		testing.insert(12);
		testing.insert(13);

		System.out.println(testing.toString());

		testing.replace(15, 25);

		System.out.println(testing.toString());
		System.out.println();
		testing.sum();


		System.out.println("Linked List 2");
		LinkedList2 testing2 = new LinkedList2(15);

		testing2.insert(20);
		testing2.insert(25);
		testing2.insert(10);

		System.out.println(testing2.toString());

		testing2.replace(15, 40);

		System.out.println(testing2.toString());
	}




}
