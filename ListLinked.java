public class ListLinked <T> implements TDAList<T> {
    protected Nodo<T> first;

    public ListLinked(){
        this.first = null;
    }
    public Nodo<T> getFirst() {
        return this.first;
    }
	public void setFirst(Nodo<T> node) {
        this.first = node;
    }
    public boolean isEmptyList(){
        return this.first == null;
    }
    public int length(){
        int cont = 0;
        Nodo <T> aux = this.first;
        while(aux != null){
            cont++;
            aux = aux.getNext();
        }
        return cont;
    }
    public void destroyList(){
        this.first = null;
    }
    public int search(T x){
        Nodo <T> aux = this.first;
        int i = 0;
        while(aux != null){
            if(aux.getData() != null){
                if(aux.getData().equals(x)){
                    return i;
                }
            }
            aux = aux.getNext();
            i++;
        }
        return -1;
    } 
    public void insertFirst(T x){
        Nodo <T> nodo = new Nodo<>(x);
        nodo.setNext(this.first);
        this.first = nodo;
    }
    public void insertLast(T x){
        Nodo <T> nodo = new Nodo<T>(x);
        Nodo <T> aux = this.first;
        if(this.first == null){
            this.first = nodo;
        } else {
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nodo);
            nodo.setNext(null);
        }
    }
    public void removeNode(T x){
        int pos = search(x);
        int cont = length();
        if (pos == -1){
            System.out.println("El elemento no existe");
        } else if(pos == cont- 1){
            int i = 0;
            Nodo <T> aux = this.first;
            while(i < cont - 2){
                aux = aux.getNext();
                i++;
            }
            aux.setNext(null);
        }else if(pos == 0){
            this.first = this.first.getNext();
        } else {
            int i = 0;
            Nodo <T> aux = this.first;
            while(i < pos - 1){
                aux = aux.getNext();
                i++;
            }
            aux.setNext(aux.getNext().getNext());
        }
    }
    public void deleteDuplicates(){
        Nodo <T> aux = this.first;
        Nodo <T> aux2 = this.first;
        while(aux != null){
            int i = 0;
            while(aux2 != null){
                if(aux.getData().equals(aux2.getData())){
                    i++;
                }
                if(i>1){
                    removeNode(aux2.getData());
                }
                aux2 = aux2.getNext();
            }
            aux2 = this.first;
            aux = aux.getNext();
        }
    } 
    public void insertNth(T x, int n){
        int longitud = length();
        if(n > longitud){
            System.out.println("Fuera de rango");
        } else if(n == 0){
            insertFirst(x);
        } else if(n == longitud){
            insertLast(x);
        } else {
            Nodo <T> nodo = new Nodo<> (x);
            Nodo <T> aux = this.first;
            int i=0;
            while (i < n -1) {
                aux = aux.getNext();
                i++;
            }
            nodo.setNext(aux.getNext());
            aux.setNext(nodo);
        }
    }
    public void deleteNth(int n){
        int longitud = length();
        if(n >= longitud){
            System.out.println("Fuera de rango");
        } else if(n == 0){
            this.first = this.first.getNext();
        } else {
            Nodo <T> aux = this.first;
            int i = 0;
            while(i < n- 1){
                aux = aux.getNext();
                i++;
            }
            aux.setNext(aux.getNext().getNext());
        }
    }
    public void mostrar(){
        Nodo <T> aux = this.first;
        String cadena = "";
        while(aux != null){
            cadena += aux.getData() + " ";
            aux = aux.getNext();
        }
        System.out.println(cadena);
    }
    public static ListLinked<Integer> mergeLists(OrderListLinked<Integer> list1, OrderListLinked<Integer> list2) {
        ListLinked<Integer> mergedList = new ListLinked<>();
        Nodo<Integer> current1 = list1.getFirst();
        Nodo<Integer> current2 = list2.getFirst();
        while (current1 != null && current2 != null) {
            if (current1.getData() <= current2.getData()) {
                mergedList.insertLast(current1.getData());
                current1 = current1.getNext();
            } else {
                mergedList.insertLast(current2.getData());
                current2 = current2.getNext();
            }
        }
        while (current1 != null) {
            mergedList.insertLast(current1.getData());
            current1 = current1.getNext();
        }
        while (current2 != null) {
            mergedList.insertLast(current2.getData());
            current2 = current2.getNext();
        }
        return mergedList;
    }
    public static void reverseSublist(ListLinked<Integer> list, int left, int right) {
        if (left == right || list.isEmptyList() || left <= 0 || right > list.length()) {
            return;
        }
        Nodo<Integer> prev = null;
        Nodo<Integer> current = list.getFirst();
        for (int i = 1; i < left; i++) {
            prev = current;
            current = current.getNext();
        }
        Nodo<Integer> start = prev;
        Nodo<Integer> end = current;
        for (int i = left; i <= right; i++) {
            Nodo<Integer> next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        if (start == null) {
            list.setFirst(prev);
        } else {
            start.setNext(prev);
        }
        end.setNext(current);
    }
}

