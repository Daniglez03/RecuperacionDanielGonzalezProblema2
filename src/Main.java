import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LibroCuentas pilaCuentas = new LibroCuentas();
        Scanner sc = new Scanner(System.in);
        //Gasto gasto = 0;
        Gasto gasto = null;
        boolean amapola = false;
        while (!amapola) {
            System.out.println("1.Añadir gasto");
            System.out.println("2.Ver gastos");
            System.out.println("3.Calcular gasto total");
            System.out.println("Q.Salir");

            String opcion = sc.next();
            switch (opcion) {
                case "1":
                    System.out.println("Introduce la cantidad de tu gasto");
                    float importe = sc.nextFloat();
                    System.out.println("Añade un concepto :");
                    String concepto = sc.next();
                    gasto = new Gasto(concepto, importe);

                    pilaCuentas.push(gasto);
                    break;
                case "2":
                    System.out.println(pilaCuentas);
                    break;
                case "3":
                    int tamano = pilaCuentas.tamano();
                    int sumaTotal = 0;
                    for (int i = 0; i < tamano ; i++) {
                        sumaTotal += pilaCuentas.pop().getImporte();
                    }
                    System.out.println("Suma total de gastos: " + sumaTotal + " €");
                    break;
                case "Q":
                    amapola = true;
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
