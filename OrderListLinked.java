public class OrderListLinked<T extends Comparable<T>> extends ListLinked<T> {

	public Nodo<T> getFirst() {
        return this.first;
    }
	
	public void setFirst(Nodo<T> node) {
        this.first = node;
    }
    @Override
    public void insertFirst(T x) {
        insertInOrder(x);
    }

    @Override
    public void insertLast(T x) {
        insertInOrder(x);
    }

    @Override
    public void removeNode(T x) {
        if (isEmptyList()) {
            return;
        }

        if (first.getData().equals(x)) {
            first = first.getNext();
            return;
        }

        Nodo<T> current = first;
        Nodo<T> previous = null;

        while (current != null && !current.getData().equals(x)) {
            previous = current;
            current = current.getNext();
        }

        if (current != null) {
            previous.setNext(current.getNext());
        }
    }

    @Override
    public int search(T x) {
        Nodo<T> current = first;
        int index = 0;

        while (current != null && current.getData().compareTo(x) <= 0) {
            if (current.getData().equals(x)) {
                return index;
            }
            current = current.getNext();
            index++;
        }

        return -1;
    }

    private void insertInOrder(T x) {
        Nodo<T> newNode = new Nodo<>(x); //1

        if (isEmptyList() || first.getData().compareTo(x) >= 0) { //1
            newNode.setNext(first); //1
            first = newNode; //1
            return; //1
        }

        Nodo<T> current = first; //1
        Nodo<T> previous = null; //1

        while (current != null && current.getData().compareTo(x) < 0) {  //n
            previous = current;  //1
            current = current.getNext();  //1
        }

        newNode.setNext(current);  //1
        previous.setNext(newNode);  //1
    }
    
}