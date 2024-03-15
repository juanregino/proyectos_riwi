import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoPermanente extends GestionEmpleado{

    private ArrayList<Empleado> listEmpleadoPer;

    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario ) {
        super(nombre, edad, idEmpleado, salario);

    }
    public EmpleadoPermanente(){
        this.listEmpleadoPer = new ArrayList<>();
    }





    @Override
    public void agregarEmpleado(Scanner objScan) {
        System.out.println("Agrega un empleado permanente");
        System.out.println("Ingresa el hombre");
        String nombre = objScan.next();
        System.out.println("Ingresa la edad");
        int edad = objScan.nextInt();
        System.out.println("Ingresa el salario");
        double salario = objScan.nextDouble();
        Empleado objEmpleado = new Empleado(nombre,edad,1, salario);
        this.listEmpleadoPer.add(objEmpleado);
        System.out.println("Empleado agregado correctamente");
    }

    @Override
    public void eliminarEmpleado(Scanner objScan) {


        System.out.println("ingrese el id a eliminar");
        int idEliminar = objScan.nextInt();
        this.listEmpleadoPer.removeIf(Empleado -> this.getIdEmpleado() == idEliminar);

    }
    @Override
    public void listarEmpleados(Scanner objScan){
     for(Empleado empleadoTemp : listEmpleadoPer){
         System.out.println("Empleado Permanente " + empleadoTemp.toString());
     }
    }
}
