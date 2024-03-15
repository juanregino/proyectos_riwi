import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private int codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    private static int idEstudiante = 1;


    //METODOS
    public void guardarEstudiante(Scanner objScan) {
        System.out.println("Agrega un estudiante");
        System.out.println("Ingresa el nombre");
        String nombreEstudiante = objScan.next();

        System.out.println("Ingresa el Email");
        String email = objScan.next();

        Estudiante objEstudiante = new Estudiante(idEstudiante, nombreEstudiante, email);
        idEstudiante++;

        if (this.listaEstudiantes.add(objEstudiante)) {
            System.out.println("Se agrego correctamente");
        } else {
            System.out.println("No se pudo agregar");
        }
    }

    public void eliminarEstudiante(Scanner objScan) {

        this.listaEstudiantes();

        System.out.println("ingrese el identificador del Estudiante");

        int option = objScan.nextInt();

        if (this.listaEstudiantes.removeIf(Estudiante -> Estudiante.getIdEstudiante() == option)) {
            System.out.println("Se ha eliminado correctamente");

        } else {
            System.out.println("no se pudo elminar");
        }
    }

    /**
     * <h1>Listar Estudiantes</h1>
     *
     * @return
     * @params
     */
    public void listaEstudiantes() {

        if (this.listaEstudiantes.isEmpty()) {
            System.out.println("Esta lista esta vacia");
        } else {
            for (Estudiante estudTemp : listaEstudiantes)
                System.out.println(estudTemp.toString());
        }
    }


    //GETTER AND SETTERS

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    //Constructor
    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", listaCursos=" + listaEstudiantes +
                '}';
    }
}
