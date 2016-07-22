import java.util.Vector;

public class Stack<E> implements I_Stack<E>
{
	Vector<E> vector= new Vector<>();

	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		vector.addElement(element);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return vector.lastElement();
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return vector.isEmpty();
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
