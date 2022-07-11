package clases;

public class Funciones_Retiro extends CajeroAutomatico{

    @Override
    public void Transacciones () {
        System.out.println("Cuanto dinero deseas retirar: ");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones = retiro);
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());

        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
