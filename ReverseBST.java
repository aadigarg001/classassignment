import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Nod {
	int data;
	Nod l;
	Nod r;
	public Nod(int data) {
		this.data = data;
	}
}
public class ReverseBST{
	public void reverse(Nod root) {
		Queue<Nod> queue = new LinkedList<Nod>();
		Stack<Nod> stack = new Stack<Nod>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Nod node = queue.remove();
			if (node.l != null) {
				queue.add(node.l);
			}
			if (node.r != null) {
				queue.add(node.r);
			}
			stack.add(node);
		}
		while (stack.isEmpty() == false) {
			System.out.print(stack.pop().data + " ");
		}
	}
	public static void main(String[] args) {
		Nod root = new Nod(15);
		root.l = new Nod(16);
		root.r = new Nod(17);
		root.l.l = new Nod(18);
		root.l.r = new Nod(19);
		root.r.l = new Nod(20);
		root.r.r = new Nod(21);
		ReverseBST i = new ReverseBST();
		i.reverse(root);
	}
}