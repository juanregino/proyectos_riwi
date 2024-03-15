import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoTemporal extends GestionEmpleado {
    private ArrayList<Empleado> listEmpleadosTemp;

    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);

    }
    public EmpleadoTemporal(){
        this.listEmpleadosTemp = new ArrayList<>();
    }

    


    @Override
    public void agregarEmpleado(Scanner obj) {
        System.out.println("Agrega un empleado temporal");

        System.out.println("Ingrese el nombre del empleado");
        String nombre = obj.next();
        System.out.println("ingrese la edad ");
        int edad = obj.nextInt();
        System.out.println("Ingrese el salario que va a ganar este mansito");
        double salario = obj.nextDouble();


        Empleado objEmpleado = new Empleado(nombre, edad, 2, salario);
        this.listEmpleadosTemp.add(objEmpleado);

        System.out.println("Empleado agregado correctamente");

    }

    @Override
    public void eliminarEmpleado(Scanner obj) {
        System.out.println("Ingrese el ID del empleado que va a eliminar");
        int idEliminar = obj.nextInt();
        this.listEmpleadosTemp.removeIf(Empleado -> this.getIdEmpleado() == idEliminar);

    }

    @Override
    public void listarEmpleados(Scanner obj) {
        for (Empleado empleadoTemp : listEmpleadosTemp) {
            System.out.println("Empleado Temporal " +empleadoTemp.toString());
        }
    }


}
