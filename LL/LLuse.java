import java.util.Scanner;

public class LLuse {

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
		// TODO Auto-generated method stub

	}

	public static Node<Integer> input() {
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while (data != -1) {
			Node<Integer> newnode = new Node<>(data);
			if (head == null) {
				head = newnode;
			}
			else {
				
			}
		}
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n = new Node<>(10);
		Node<Integer> n1 = new Node<>(20);
		n.next = n1;
		Node<Integer> n2 = new Node<>(30);
		n1.next = n2;
		Node<Integer> head = n;
		print(head);
		print(head);
	}

}