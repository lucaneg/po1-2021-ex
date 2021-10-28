class StackElement<X> {
	private final X element;
	private final StackElement<X> next;

	public StackElement(X element, StackElement<X> next) {
		this.element = element;
		this.next = next;
	}

	public X getElement() {
		return element;
	}

	public StackElement<X> getNext() {
		return next;
	}
}

class Stack<X> {
	private StackElement<X> head;

	public Stack() {
		head = null;
	}
	
	public void push(X e) {
		head = new StackElement<>(e, head);
	}
	
	public X peek() {
		return head == null ? null : head.getElement();
	}
	
	public X pop() {
		if (head == null) 
			return null; 
		X e = head.getElement();
		head = head.getNext();
		return e;
	}
	
	public String print() {
		String result = "[ ";
		
		StackElement<X> cursor = head;
		while (cursor != null) {
			result += cursor.getElement() + " ";
			cursor = cursor.getNext();
		}
		
		return result + "]";
	}
}