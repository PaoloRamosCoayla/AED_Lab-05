public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Persona){
            Persona p = (Persona) obj;
            return this.nombre.equals(p.nombre) && this.apellido.equals(p.apellido) && this.edad == p.edad;
        }
        return false;
    }
    @Override
    public int compareTo(Persona otraPersona) {
        return this.nombre.compareTo(otraPersona.getNombre());
    }
    public String toString(){
        return "Nombre: "+this.nombre+" Apellido: "+this.apellido+" Edad: "+this.edad;
    }
}