import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {

    // Primero declaro el tipo de dato ArrayList "importante importarlo "
    // Luego declaro <que tipo de datos va a recibir el array>, en este caso serán objetos tipo Producto
    private ArrayList<Producto> listaProductos;
     private  static int id = 0 ;

    //MÉTODO CONSTRUCTOR PARA CUANDO INSTANCIEMOS LA CLASE
    // El constructor se debe modificar para que cuando instancie la clase no me pida un argumento
    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }


    //Metodos o funciones

    public void agregarProducto(Scanner objScan ) {
        System.out.println("ingresa el nombre del producto");
        String nombre = objScan.next();
        System.out.println("ingresa el precio del producto");
        double precio = objScan.nextDouble();

        Producto objProducto = new Producto(  id,precio, nombre);
        id++;
        this.listaProductos.add(objProducto);

    }

    public void eliminarProducto(int id) {

        this.listaProductos.removeIf(Producto -> Producto.getId() == id);

    }

    public void listarProductos() {
        for (Producto productoTemp : this.listaProductos) {
            System.out.println(productoTemp.toString());
        }

    }

    public String filtrarProductos(String nombre){
        for (Producto productoTemp : this.listaProductos){
            if(productoTemp.getNombre().equalsIgnoreCase(nombre)){
                return productoTemp.toString();
            }
        }
        return null;
    }
}
