package clases;
import java.util.Scanner;

public abstract class CajeroAutomatico {
    protected int transacciones, retiro , deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void operaciones () {
        int contador = 0;
        int opcion = 0;

        do {
            do {
                System.out.println("MENU CAJERO AUTOMATICO");
                System.out.println("1. RETIRO: ");
                System.out.println("2. DEPOSITO: ");
                System.out.println("3. TRANSACCIONES: ");
                System.out.println("4. SALIR: ");
                opcion = entrada.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    contador = 1;
                } else {
                    System.out.println("Opcion no valida, intente de nuevo");
                }
            } while (contador == 0);

            if (opcion == 1) {
                CajeroAutomatico mensaje = new Funciones_Retiro();
                mensaje.Transacciones();
            }else if (opcion == 2) {
                CajeroAutomatico mensaje = new Funciones_Deposito();
                mensaje.Transacciones();
            } else if (opcion == 3) {
                CajeroAutomatico mensaje = new Funciones_Consulta();
                mensaje.Transacciones();
            }else if (opcion == 4) {
                System.out.println("Gracias, vuelva pronto");
                contador = 2;
            }
        } while (contador != 2);
    }

    public void Retiro () {
        retiro = entrada.nextInt();
    }

    public void Deposito () {
        deposito = entrada.nextInt();
    }

    public abstract void Transacciones ();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo (int saldo) {
        this.saldo  = saldo;
    }




}
