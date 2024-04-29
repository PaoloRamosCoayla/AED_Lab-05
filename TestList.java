public class TestList {

    public static void main(String[] args) {
        System.out.println("Actividades");
        ListArray<Persona> lista = new ListArray<>(5);
        lista.insertFirst(new Persona("Juan", "Perez", 20));
        lista.insertFirst(new Persona("Maria", "Lopez", 25));
        lista.insertLast(new Persona("Pedro", "Gomez", 30));

        
        System.out.println("Longitud de la lista: "+lista.length());
        System.out.println("Buscar a Maria: "+lista.search(new Persona("Maria", "Lopez", 25)));

        lista.removeNode(new Persona("Maria", "Lopez", 25));
        System.out.println("Buscar a Maria: "+lista.search(new Persona("Maria", "Lopez", 25)));
        System.out.println("Determinar si la lista esta vacia: "+lista.isEmptyList());
        lista.mostrar();
        lista.destroyList();
        System.out.println("Determinar si la lista esta vacia: "+lista.isEmptyList());
        lista.mostrar();
        System.out.println();
        System.out.println("-------------------------------------------------");

        ListLinked<Persona> lista2 = new ListLinked<>();
        lista2.insertFirst(new Persona("Juan", "Perez", 20));
        lista2.insertFirst(new Persona("Maria", "Lopez", 25));
        lista2.insertLast(new Persona("Pedro", "Gomez", 30));
        

        System.out.println("Determinar si la lista esta vacia: "+lista2.isEmptyList());
        System.out.println("Longitud de la lista: "+lista2.length());
        System.out.println("Buscar a Maria: "+lista2.search(new Persona("Maria", "Lopez", 25)));

        lista2.removeNode(new Persona("Maria", "Lopez", 25));

        System.out.println("Buscar a Maria: "+lista2.search(new Persona("Maria", "Lopez", 25)));
        lista2.mostrar();
        lista2.destroyList();
        System.out.println("Determinar si la lista esta vacia: "+lista2.isEmptyList());
        lista2.mostrar();

        System.out.println();
        


        //EJERCICIO 1
        System.out.println("Ejercicio 1 ");
        ListLinked<String> letras = new ListLinked<>();
        letras.insertLast("A");
        letras.insertLast("B");
        letras.insertLast("C");
        letras.insertLast("C");

        letras.mostrar();
        letras.deleteDuplicates();
        letras.mostrar();

        System.out.println();

        ListLinked<Integer> numeros = new ListLinked<>();
        numeros.insertLast(47);
        numeros.insertLast(89);
        numeros.insertLast(56);
        numeros.insertLast(89);
        numeros.insertLast(89);
        numeros.insertLast(56);

        numeros.mostrar();
        numeros.deleteDuplicates();
        numeros.mostrar();

        System.out.println();

        ListLinked<Integer> num = new ListLinked<>();
        num.insertLast(1);
        num.insertLast(2);
        num.insertLast(3);
        num.insertLast(4);
        num.insertLast(5);
        num.insertLast(6);

        num.mostrar();
        num.deleteDuplicates();
        num.mostrar();

        System.out.println();

        ListLinked<String> nombres = new ListLinked<>();
        nombres.insertLast("Luis");
        nombres.insertLast("Rodrigo");
        nombres.insertLast("Luis");

        nombres.mostrar();
        nombres.deleteDuplicates();
        nombres.mostrar();

        System.out.println();



        //EJERCICIO 2
        System.out.println("Ejercicio 2");

        ListLinked<String> letras2 = new ListLinked<>();
        letras2.insertLast("A");
        letras2.insertLast("B");
        letras2.insertLast("D");
        
        letras2.mostrar();
        letras2.insertNth("C", 2);
        letras2.mostrar();  

        System.out.println();

        ListLinked<String> let = new ListLinked<>();
        let.insertLast("A");
        let.insertLast("B");
        let.insertLast("D");

        let.mostrar();
        let.insertNth("C", 3);
        let.mostrar();

        System.out.println();

        ListLinked<String> le = new ListLinked<>();
        le.insertLast("A");
        le.insertLast("B");
        le.insertLast("D");

        le.mostrar();
        le.insertNth("C", 5);
        le.mostrar();

        System.out.println();

        ListLinked<Integer> num2 = new ListLinked<>();
        num2.insertLast(10);
        num2.insertLast(20);
        num2.insertLast(30);

        num2.mostrar();
        num2.insertNth(15, 0);
        num2.mostrar();

        System.out.println();



        //EJERCICIO 3
        System.out.println("Ejercicio 3"); 
        ListLinked<String> letras3 = new ListLinked<>();
        letras3.insertLast("A");
        letras3.insertLast("B");
        letras3.insertLast("D");

        letras3.mostrar();
        letras3.deleteNth(2);
        letras3.mostrar();

        System.out.println();
        ListLinked<String> letras33 = new ListLinked<>();
        letras33.insertLast("A");
        letras33.insertLast("B");
        letras33.insertLast("D");

        letras33.mostrar();
        letras33.deleteNth(4);
        letras33.mostrar();

        System.out.println();
        ListLinked<String> letras333 = new ListLinked<>();
        letras333.insertLast("A");
        letras333.insertLast("B");
        letras333.insertLast("D");

        letras333.mostrar();
        letras333.deleteNth(0);
        letras333.mostrar();

        System.out.println();
        ListLinked<Integer> numeros3 = new ListLinked<>();
        numeros3.insertLast(10);

        numeros3.mostrar();
        numeros3.deleteNth(0);
        numeros3.mostrar();



        //EJERCICIO 4
        System.out.println("Ejercicio 4");
        OrderListLinked<Persona> listaPersonas = new OrderListLinked<>();
        listaPersonas.insertLast(new Persona("Jose", "Gonzales", 15));
        listaPersonas.insertLast(new Persona("Ana", "Garcia", 18));
        listaPersonas.insertLast(new Persona("Luis", "Fernandez", 25));

        // Mostrar la lista de personas
        System.out.println("\nLista de personas:");
        listaPersonas.mostrar();

        // Buscar a una persona en la lista
        System.out.println("\nBuscar a Ana: " + listaPersonas.search(new Persona("Ana", "Garcia", 18)));

        // Eliminar a Maria de la lista
        listaPersonas.removeNode(new Persona("Ana", "Garcia", 18));
        System.out.println("Buscar a Maria después de eliminarla: " + listaPersonas.search(new Persona("Ana", "Garcia", 18)));

        // Mostrar la lista después de eliminar a Maria
        System.out.println("\nLista después de eliminar a Ana:");
        listaPersonas.mostrar();

        // Destruir la lista
        listaPersonas.destroyList();
        System.out.println("\nLista después de destruirla:");
        listaPersonas.mostrar();
        System.out.println(); 
        


        //EJERCICIO 5
        System.out.println("Ejercicio 5"); 
        OrderListLinked<Integer> listaD = new OrderListLinked<>();
        listaD.insertLast(1);
        listaD.insertLast(3);
        listaD.insertLast(5);
        System.out.println("\nLista Derecha");
        listaD.mostrar();

        OrderListLinked<Integer> listaI = new OrderListLinked<>();
        listaI.insertLast(2);
        listaI.insertLast(4);
        listaI.insertLast(6);
        System.out.println("\nLista Izquierda");
        listaI.mostrar();

        ListLinked<Integer> mergedList = ListLinked.mergeLists(listaD, listaI);
        System.out.println("\nLista fusionada:");
        mergedList.mostrar();
        
        System.out.println();



        //EJERCICIO 6
        System.out.println("Ejercicio 6"); 
        ListLinked<Integer> numbers = new ListLinked<>();
        numbers.insertLast(1);
        numbers.insertLast(2);
        numbers.insertLast(3);
        numbers.insertLast(4);
        numbers.insertLast(5);
        numbers.insertLast(6);
        numbers.insertLast(7);
        System.out.println("\nLista original:");
        numbers.mostrar();

        System.out.println("\nInvertir la sublista del índice 2 al 5:");
        ListLinked.reverseSublist(numbers, 2, 5);
        numbers.mostrar();

    }
    
}