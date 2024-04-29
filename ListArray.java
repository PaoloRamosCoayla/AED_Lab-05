public class ListArray<T> implements TDAList<T> {
    T[] arreglo;

    public ListArray(int size){
        this.arreglo = (T[]) new Object[size];
    }

    @Override
    public boolean isEmptyList(){
        return length() == 0;
    }

    @Override
    public int length(){
        int cont = 0;
        for (T item : arreglo) {
            if (item != null) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public void destroyList() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = null;
        }
    }

    @Override
    public int search(T x) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertFirst(T x) {
        if(length() == arreglo.length){     //1
            System.out.println("No hay mas espacios");
        }
        else{
            for (int i = arreglo.length - 1; i > 0; i--) { //n
                arreglo[i] = arreglo[i - 1];
            }
            arreglo[0] = x;
        }
    }

    @Override
    public void insertLast(T x) {
        if(length() == arreglo.length){     //1
            System.out.println("No hay mas espacios");      //1
        }
        else{
            arreglo[length()] = x;      //1
        }
    }

    @Override
    public void removeNode(T x) {
        int indice = search(x);
        if (indice >=0) {
            for (int i = indice; i < arreglo.length - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            arreglo[arreglo.length - 1] = null;
        }
    }

    public void mostrar() {
        for (T item : arreglo) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }    
    
}