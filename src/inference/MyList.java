public class MyList<E> {
  	private E head = null;
  	private MyList<E> tail = null;

	public static <Z> MyList<Z> nil() { 
		return new MyList<Z>();
	};
	public static <Z> MyList<Z> cons(Z head, MyList<Z> tail) { 
		MyList<Z> result = new MyList<>();
		result.head = head;
		result.tail = tail;
		return result;

	};
	public E head() {
		return head;
	}
}
