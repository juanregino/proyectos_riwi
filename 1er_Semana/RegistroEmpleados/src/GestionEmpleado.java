import java.util.Scanner;

//HEREDO EMPLEADO PARA QUE HAGA UNA CONECCION CON CADA TIPO  DE EMPLEADO
public abstract class GestionEmpleado extends Empleado {
    //CONSTRUCTOR CON EL SUPER PARA TRAER LOS ATRIBUTOS DE EMPLEADO
    public GestionEmpleado(){}
    public GestionEmpleado(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);
    }

    //CREAMOS LOS METODOS O FUNCIONES ABSTRACTAS PARA UTLIZARLAS EN CADA TIPO DE EMPLEADO
    public abstract void agregarEmpleado(Scanner obj);
    public abstract void eliminarEmpleado(Scanner obj);
    public abstract void
    listarEmpleados(Scanner obj);

}
