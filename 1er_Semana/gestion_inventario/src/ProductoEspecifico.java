
//Extiendo la clase con Producto para poder heredar

public class ProductoEspecifico extends Producto{

    //Declaro los atributos adicionales para un producto espécifico
    private String marca ;
    private String categoria ;


    // Este es el constructor, hacemos uso de súper para heredar los atributos de producto
    public ProductoEspecifico(int id, double precio, String nombre, String marca, String categoria) {
        super(id, precio, nombre);
        this.marca = marca;
        this.categoria = categoria;
    }

    // Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Método para imprimir los atributos de la clase
    @Override
    public String toString() {
        return "ProductoEspecifico{" +
                "marca='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
