package clases;

public class Funciones_Deposito extends CajeroAutomatico{
    @Override
    public void Transacciones () {
        System.out.println("Cuanto dinero deseas depositar: ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
    }

}
