import sun.awt.image.ImageWatched;

/**
 * Created by alexandrugutu on 3/25/14.
 */
public class LinkedList
{
	protected Node head;

	// Counter for number of nodes in list
	protected int count = 0;

	public LinkedList()
	{

	}

	public LinkedList(int data)
	{
		head = new Node(data);
	}

	public LinkedList(Node n)
	{
		head = n;
	}

	public void append(int data)
	{
		if (head != null)
		{
			Node current = head;
			while (current.getNext() != null)
			{
				current = current.getNext();
			}

			current.setNext(new Node(data));

			// Increments count when Node is added
		}
		else
		{

			// Increments count when Node is added
			head = new Node(data);
		}
	}

	public void insert(int data)
	{
		Node current = head;
		Node previous = head;

		boolean inserted = false;

		if (head.getData() > data)
		{
			head = new Node(data, head);

		}
		else
		{
			while (current != null)
			{
				if (current.getData() < data)
				{
					previous = current;
					current = current.getNext();
				}
				else
				{
					Node n = new Node(data);
					previous.setNext(n);
					n.setNext(current);


					inserted = true;

					break;
				}
			}
			if (!inserted)
			{
				previous.setNext(new Node(data));

			}

		}
	}

	public Node find(int data)
	{
		Node current = head;
		while (current != null)
		{
			if (current.getData() == data)
			{
				break;
			}
			else
			{
				current = current.getNext();
			}
		}

		return current;
	}

	public boolean delete(int data)
	{
		boolean found = false;
		Node current = head;
		Node previous = head;

		if (head.getData() == data)
		{
			head = head.getNext();

			return true;

		}

		while (current != null)
		{
			if (current.getData() == data)
			{
				previous.setNext(current.getNext());

				// Decrements count when node is erased;
				count--;

				return true;
			}
			else
			{
				previous = current;
				current = current.getNext();
			}
		}
		return false;
	}

	public void replace(int target, int newvalue)
	{
		Node current = head;
		while (current != null)
		{
			if (current.getNext().getData() == target)
			{
				current.setNext(new Node(newvalue, current.getNext().getNext()));
				break;
			}
			else
			{
				current = current.getNext();
			}
		}
	}

}
