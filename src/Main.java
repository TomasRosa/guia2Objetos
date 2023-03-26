
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;
import java.time.LocalDate;


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
                break;
            }
            case 2:
            {
                ejercicio2();
                break;
            }
        }
    }
    public static void ejercicio1()
    {
        ///a
        Autor autorcito = new Autor("Joshua","Bloch","joshua@email.com",'M');
        Autor autorcito2 = new Autor ("Tomas","Rosa","tomas@hotmail.com",'M');
        Autor autorcito3 = new Autor ("Rosalia","Gimenez","rosalia@live.com",'M');
        ///b
        autorcito.mostrarAutor();
        System.out.println("--------------IMPRIMIENDO LIBRO COMPLETO---------------");
        ///c
        ///Creo un libro le mando el autor por parametro para que lo agregue, luego en las siguientes lineas
        ///Agrego dos autores mas al arreglo.
        Libro librito = new Libro("Effective Java",450,150,autorcito);
        librito.recibirAutorAgregaArray(autorcito2);
        librito.recibirAutorAgregaArray(autorcito3);
        ///d,e,f
        ///Muestro el libro con sus autores accediendo desde el libro.
        librito.mostrarLibro();

        librito.setPrecio(500);
        librito.setStock(librito.getStock()+50);
        System.out.println("Libro con nuevos atributos: ");
        ///imprimiendo el autor desde el libro, me imprime varios autores ya que los agregue contemplando el punto H.
        librito.mostrarLibro();

        ///librito.mostrarAlgunosAtributos();
        ///G, muestro algunos atributos con varios autores.
        librito.mostrarAlgunosAtributosArreglo();
    }
    public static void ejercicio2()
    {
        //a y b
        UUID id = UUID.randomUUID();

        Cliente clientecito = new Cliente(id,"Tomas Rosa","tomilautialdosivi@gmail.com",15);

        clientecito.mostrarCliente();
        ///c
        UUID idFactura  =UUID.randomUUID();
        LocalDate fecha = LocalDate.now();

        Factura facturita = new Factura(idFactura,1500,fecha,clientecito);
        System.out.println("Monto total de la factura: " + facturita.getMonto());
        System.out.println("Monto total de la factura con 15% de descuento: " + facturita.montoTotalConDescuento(clientecito.getDescuento()));
        ///d
        facturita.mostrarFactura(facturita.montoTotalConDescuento(clientecito.getDescuento()));
        ///FALTA HACER EL E
    }
}