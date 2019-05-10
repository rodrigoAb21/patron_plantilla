import java.util.Scanner;

public abstract class Serie {

    public void generarSerie(){
        System.out.print("¿Cantidad de elementos?: ");
        int cant = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        int nro = 1;
        System.out.print("Serie: ");
        for (int i = 1; i <= cant; i++) {
            System.out.print(nro + ", ");
            nro = operacion(nro, i);
        }
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
    }

    protected abstract int operacion(int nro, int i);

}
