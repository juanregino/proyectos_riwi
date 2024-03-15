public class Producto {

    //Creamos los atributos de esta clase privados para hacer uso del encapsulamiento
    private  int id;

    private double precio ;
    private String nombre ;


    // Generamos los get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Este es el constructor para poder que otras clases lo Hereden
    public Producto(int id, double precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }


    //Método para imprimir los atributos
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
