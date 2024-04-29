public class Nodo <T>{
    private T data;
    private Nodo<T> next;

    Nodo(T data){
        this.data = data;
    }

    Nodo(T d, Nodo<T> n){
        this.data = d;
        this.next = n;
    }

    public T getData() {
        return this.data;
    }
    public Nodo<T> getNext() {
        return this.next;
    }
    public void setData(T data) {
        this.data = data;
    }
    public void setNext(Nodo<T> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return " " + data;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
