import java.util.ArrayList;

public class GenerateInfoFiles {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");

        ArrayList<String> DatosVendedores = new ArrayList<>();

        DatosVendedores.add("Documento: C.C. 001, Nombre: Carlos Velandia");
        DatosVendedores.add("Documento: C.C. 002, Nombre: Adriana Gomez");
        DatosVendedores.add("Documento: C.C. 003, Nombre: Felipe Alvarez");
        DatosVendedores.add("Documento: C.C. 004, Nombre: Carolina Perez");
        DatosVendedores.add("Documento: C.C. 005, Nombre: Tito Acosta");
        DatosVendedores.add("Documento: C.C. 006, Nombre: Hugo Ariza");
        DatosVendedores.add("Documento: C.C. 007, Nombre: Catalina Herrera");
        DatosVendedores.add("Documento: C.C. 008, Nombre: Federico Leon");
        DatosVendedores.add("Documento: C.C. 009, Nombre: Pablo Silva");
        DatosVendedores.add("Documento: C.C. 010, Nombre: Nicolas Mora");

       System.out.println("Datos de los vendedores:");
       for (String datos : DatosVendedores) {
        System.out.println(datos);
    }
    }
    import java.util.ArrayList;
public class  GenerateInfoFiles {
        ArrayList<Producto> productos = new ArrayList<>();

        // Agregar productos a la lista
        productos.add(new Producto(ID11, "Cuaderno argollado cuadriculado pequeño", 12000));
        productos.add(new Producto(ID12, "Esfero negro marca BIC", 2000));
        productos.add(new Producto(ID13, "Lápiz mirado 2", 3000));
        productos.add(new Producto(ID14, "Post It color morado mediano", 5000));
        productos.add(new Producto(ID15, "Post It color amarillo pequeño", 12000));
        productos.add(new Producto(ID16, "Resma de hojas tamaño carta", 40000));
        productos.add(new Producto(ID17, "Regla 30 cm", 6000));
        productos.add(new Producto(ID18, "Libreta de notas mediana argollada", 15000));
        productos.add(new Producto(ID19, "Sobre manila tamaño oficio", 200));
        productos.add(new Producto(ID20, "Sobre manila tamaño carta", 100));

        // Imprimir los productos
        for (Producto producto : productos) {
            System.out.println(producto);
        }
}
}
