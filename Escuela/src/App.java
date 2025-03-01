import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creacion de las listas que usaremos
        List<Profesor> profesores = new ArrayList<>();
        List<Salon> salones = new ArrayList<>();
        List<Materia> materias = new ArrayList<>();
        //Creacion del scanner que nos ayudara a recibir datos del usuario
        Scanner scanner = new Scanner(System.in); 

        int opcion = 0;

        //Creacion del menu con las opciones disponibles usando while con el parametro de repetir el despliegue del menu mientras no se seleccione el 5
        while (opcion !=5){

            System.out.println("-- MENU --");
            System.out.println("1) Agregar un profesor.");
            System.out.println("2) Agregar un salon.");
            System.out.println("3) Agregar una materia.");
            System.out.println("4) Mostrar materias registradas.");
            System.out.println("5) Salir.\n");
            System.out.println("Ingrese una opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                System.out.println("Ingresa el nombre del profesor:");
                String nombre = scanner.nextLine();
                System.out.println("Ingresa la edad del profesor:");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa la clave del profesor:");
                String clave = scanner.nextLine();
                profesores.add(new Profesor(nombre, edad, clave));          //se agrega los datos que el usario proporciono a nuestra lista
                System.out.println("Profesor agregado exitosamente.");          
                System.out.println(profesores.get(profesores.size() - 1) + "\n");  
                //impresion de los datos que el usuario acaba de agregar con el parametro que solo se 
                // imprima el ultimo añadido, se usa la informacion de nuestro metodo toString
                
                    break;
                case 2:
                System.out.println("Ingresa el nombre: ");
                String nombreSalon = scanner.nextLine();
                System.out.println("Ingresa el edificio:");
                String edificio = scanner.nextLine();
                salones.add(new Salon(nombreSalon, edificio));
                System.out.println("Salon agregado exitosamente.");
                System.out.println(salones.get(salones.size() - 1) + "\n"); //se imprime unicamente el ultimo salon añadido 
            
                    
                    break;

                case 3:
                //condicional que indica con || que si profesores y salones estan vacios se imprima un mensaje de error

                if (profesores.isEmpty() || salones.isEmpty()){
                    System.err.println("Error: Debe de haber al menos un salon y un profesor en el sistema antes de registrar una materia.");
                }
                //si no estan vacios procede con las siguientes instrucciones
                else{
                    System.out.println("Ingresa el nombre de la materia que deseas registrar: \n");
                    String nombreMateria = scanner.nextLine();

                    System.out.println("Seleccione el profesor que impartira la materia: \n");

                    for (int i = 0; i < profesores.size(); i++) {
                        System.out.println((i + 1) + ") " + profesores.get(i));      //se crea un contador para enumerar las opciones disponibles
                    }
                    int opcionProfesor = scanner.nextInt() - 1;     
                    scanner.nextLine();

                    //se almacena la seleccion en la variable opcionProfesor y se le resta -1 debido a que arriba el indice lo comenzamos en 1 esto para que la seleccion no empiece en 0 

                    System.out.println("Seleccione un salon: \n");
                    for (int i = 0; i < salones.size(); i++) {
                        System.out.println((i + 1) + ") " + salones.get(i));
                    }
                    int opcionSalon = scanner.nextInt() - 1;
                    scanner.nextLine();
                    
                    Materia materia = new Materia(nombreMateria);
                        materia.setProfesor(profesores.get(opcionProfesor));        //hacemos set con los parametros de la opcion al seleccionar al profesor y salon
                        materia.setSalon(salones.get(opcionSalon));
                        materias.add(materia);                                      //añadimos la materia

                        System.out.println("Materia agregada exitosamente: \n");
                        System.out.println(materias.get(materias.size() - 1) + "\n");//desplegamos los datos de la ultima materia registrada

                }
                break;

                case 4:
                if (materias.isEmpty()){            //si no hay materias registradas aun se imprimira un mensaje de error
                    System.err.println("Error: No hay materias registradas aún.");
                }
                else{
                    System.out.println("Materias registradas: ");
                    for (Materia m : materias) {            //usando for-each listamos todas las materias que se hayan agregado
                        System.out.println(m);
                    }   
                }

                break;
                case 5:
                 System.out.println("Usted ha salido del programa.");       //se imprime un mensaje para indicar que finalizo
                 break;

                default:
                    break;
            }
            
        }
        scanner.close();        //cerramos el scanner para consumir menos recursos
    }
    
}
