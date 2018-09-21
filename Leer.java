import java.util.Scanner;

public class Leer {

    public String leerString() {
        Scanner reader = new Scanner(System.in);
        String linia = reader.next();
        reader.close();
        return linia;
    }

    public int leerEntero() {
        Scanner reader = new Scanner(System.in);
        int numero = reader.nextInt();
        reader.close();
        return numero;
    }

    public char leerCaracter() {
        Scanner reader = new Scanner(System.in);
        String linia = reader.next();
        reader.close();
        return linia.charAt(0);
    }
    
    public boolean leerBooleano() {
        Scanner reader = new Scanner(System.in);
        boolean b;
        b = reader.nextBoolean();
        reader.close();
        return b;
    }
}
