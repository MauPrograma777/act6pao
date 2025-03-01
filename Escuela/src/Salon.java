public class Salon {
    private String nombre;
    private String edificio;

    public Salon(String nombre, String edificio) {
        this.nombre = nombre;
        this.edificio = edificio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    @Override
    public String toString(){
        return "Nombre: "+ nombre + "\n" + "Edificio: " + edificio;
    }
}