
public class Profesor {
    private String nombre;
    private int edad;
    private String clave;

    public Profesor(String nombre, int edad, String clave) {
        this.nombre = nombre;
        this.edad = edad;
        this.clave = clave;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre + "\n" + "Edad: " + edad 
        + "\n" + "Clave: "  + clave;
    }

}
