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

       System.out.println("Datos de los vendedores");
       for (String datos : DatosVendedores) {
        System.out.println(datos);
    }
    }
}