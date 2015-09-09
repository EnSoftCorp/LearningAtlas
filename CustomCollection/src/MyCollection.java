import java.util.LinkedList;

public class MyCollection<E> extends LinkedList<E> {

	private static final long serialVersionUID = 1L;

	public void addTwice(E e){
		add(e);
		add(e);
	}
	
}
