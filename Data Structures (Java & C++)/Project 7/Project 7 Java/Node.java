/**
 * Created by alexandrugutu on 12/1/14.
 */
public class Node
	{
		private int data;
		private Node next;

		public Node(int data)
			{
				this.data = data;
			}

		public Node(int data, Node next)
			{
				this.data = data;
				this.next = next;
			}

		public int getData()
			{
				return this.data;
			}

		public Node getNext()
			{
				return this.next;
			}

		public void setNext(Node next)
			{
				this.next = next;
			}
	}