public class Materia{

    private String nombre;
    private Profesor profesor;
    private Salon salon;
    public Materia(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Salon getSalon() {
        return salon;
    }
    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    @Override
    public String toString(){
        return "Nombre: "+ nombre + "\n" + "Salon: " + salon + "\n" + "Profesor: " + profesor + "\n";
    }

    
}