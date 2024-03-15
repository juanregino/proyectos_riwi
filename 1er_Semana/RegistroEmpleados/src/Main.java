import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objScan = new Scanner(System.in);
        EmpleadoPermanente objEmpleadoPermanente = new EmpleadoPermanente();
        EmpleadoTemporal objEmpleadoTemporal = new EmpleadoTemporal();
        System.out.println("---ENTER---");
        objScan.nextLine();
        int opcion = 0;
        int opcionTipoEmpleado = 0;
        do {
            System.out.println("""
                    Gestion Empleados
                                        
                    1. Agregar un empleado
                    2. Eliminar un empleado
                    3. Listar empleados
                    4. Salir
                    """);
            opcion = objScan.nextInt();

            switch (opcion){

                case 1 :
                    System.out.println("""
                            Ingrese que tipo de contrato tiene el empleado 
                            
                            1. Temporal
                            2. Permanente
                            
                            """);

                    opcionTipoEmpleado = objScan.nextInt();

                    if(opcionTipoEmpleado == 1){
                        objEmpleadoTemporal.agregarEmpleado(objScan);
                    } else if (opcionTipoEmpleado == 2) {
                        objEmpleadoPermanente.agregarEmpleado(objScan);

                    }else{
                        System.out.println("marca una opcion correcta");
                    }
                    break;

                case 2 :
                    System.out.println("""
                            Para eliminar Ingrese que tipo de contrato tiene el empleado 
                            
                            1. Temporal
                            2. Permanente
                            
                            """);

                    opcionTipoEmpleado = objScan.nextInt();

                    if(opcionTipoEmpleado == 1){
                        objEmpleadoTemporal.listarEmpleados(objScan);
                        objEmpleadoTemporal.eliminarEmpleado(objScan);
                        System.out.println("ELIMINADO CORRECTAMENTE");

                        break;
                    } else if (opcionTipoEmpleado == 2) {
                        objEmpleadoPermanente.listarEmpleados(objScan);

                        objEmpleadoPermanente.eliminarEmpleado(objScan);
                        System.out.println("ELIMINADO CORRECTAMENTE");
                        break;

                    }else{
                        System.out.println("marca una opcion correcta");
                    }
                    break;
                case 3 :
                    System.out.println("""
                            Ingrese que tipo de contrato tiene el empleado 
                            
                            1. Temporal
                            2. Permanente
                            
                            """);

                    opcionTipoEmpleado = objScan.nextInt();

                    if(opcionTipoEmpleado == 1){
                        objEmpleadoTemporal.listarEmpleados(objScan);
                    } else if (opcionTipoEmpleado == 2) {
                        objEmpleadoPermanente.listarEmpleados(objScan);

                    }else{
                        System.out.println("marca una opcion correcta");
                    }
                    break;
            }

        } while (opcion != 4);

    }
}