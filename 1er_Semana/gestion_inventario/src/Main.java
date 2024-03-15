import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario objInventario = new Inventario();
        Scanner objScan = new Scanner(System.in);

        int opcion = 0 ;
        do {
            System.out.println("""
                    SISTEMA DE INVENTARIO
                    
                    1. Agregar Un Producto
                    2. Buscar un Producto
                    3. Eliminar Producto 
                    4. Listar Inventario
                    
                    5. Salir
                    
                    """);

            opcion = objScan.nextInt();

            switch (opcion){
                case 1 :
                     objInventario.agregarProducto(objScan);
                    break;
                case 2 :
                    objInventario.listarProductos();
                    System.out.println("ELige el nombre del producto que deseas eliminar");
                    String nombreBuscar = objScan.next();
                    System.out.println("Acá lo tienes ");
                    System.out.println(objInventario.filtrarProductos(nombreBuscar));
                    break;
                case 3 :
                    objInventario.listarProductos();
                    System.out.println("ELige el nombre del producto que deseas eliminar");
                    int idEliminar = objScan.nextInt();
                    System.out.println("Acá lo tienes ");
                    objInventario.eliminarProducto(idEliminar);
                    System.out.println("Se a eliminado correctamente");
                    break ;
                case 4 :
                    objInventario.listarProductos();
                    break;
            }
        }while (opcion != 5);
    }
}