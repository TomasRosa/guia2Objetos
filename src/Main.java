import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ver. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
            }
        }
    }
    public static void ejercicio1()
    {
        Scanner scan = new Scanner(System.in);
        ///a
        Autor autorcito = new Autor("Joshua","Bloch","joshua@email.com",'M');
        ///b
        autorcito.mostrarAutor();
        System.out.println("--------------IMPRIMIENDO LIBRO COMPLETO---------------");
        ///c
        Libro librito = new Libro("Effective Java",450,150,autorcito);
        ///d
        librito.mostrarLibro();
        ///e y f
        librito.setPrecio(500);
        librito.setStock(librito.getStock()+50);
        System.out.println("Libro con nuevos atributos: ");
        ///imprimiendo el autor desde el libro.
        librito.mostrarLibro();
        ///gasd
        librito.mostrarAlgunosAtributos();

    }
}