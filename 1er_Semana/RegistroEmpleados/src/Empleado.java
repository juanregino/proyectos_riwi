
// Heredamos de persona para ello utilizamos el EXTENDS
public class Empleado extends Persona {

    //Creamos los atributos
 private int idEmpleado;
 private  double salario;

 public  Empleado(){};
 //Creamos el constructor con SUPER para traer los datos heredados de persona
    public Empleado(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "= {" +
                "nombre =" + getNombre() +
                ", edad = " + getEdad() +
                ", idEmpleado=" + idEmpleado +
                ", salario=" + salario +
                '}';
    }
}
