import java.util.Vector;

public class Stack<E> implements I_Stack<E>
{
	Vector<E> vector= new Vector<>();

	@Override
	//Metodo para meter un elemento al stack
	public void push(E element) {
		// TODO Auto-generated method stub
		vector.addElement(element);
	}

	@Override
	//Metodo para sacar un elemento del stack
	public E pop() {
		// TODO Auto-generated method stub
		return vector.lastElement();
	}

	@Override
	//Metodo que sirve para saber si el stack esta vacio
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return vector.isEmpty();
	}

	@Override
	//Metodo que sirve para ver el tamano de la pila
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
