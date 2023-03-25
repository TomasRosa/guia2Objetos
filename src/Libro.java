import java.sql.SQLOutput;
import java.util.ArrayList;

public class Libro
{
    ///Atributos
    private String titulo;
    private int precio;
    private int stock;
    private Autor autorcito;
    private ArrayList <Autor> autorArreglo;

    ///Getters y Setters
    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getPrecio()
    {
        return precio;
    }

    public void setPrecio(int precio)
    {
        this.precio = precio;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public Autor getAutorcito()
    {
        return autorcito;
    }

    public void setAutorcito(Autor autorcito)
    {
        this.autorcito = autorcito;
    }
    ///Constructores
    public Libro ()
    {

    }
    public Libro (String titulo, int precio, int stock, Autor autorcito)
    {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autorcito = autorcito;
    }
    ///metodos
    public void mostrarLibro ()
    {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
        autorcito.mostrarAutor();
    }
    public void mostrarAlgunosAtributos()
    {
        System.out.println("El libro, " + this.titulo + " de " + this.autorcito.getNombre() + " se vende a " + this.precio + " pesos");
    }
}
