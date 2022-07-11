package clases;

public class Funciones_Consulta extends CajeroAutomatico{
    @Override
    public void Transacciones () {
        System.out.println("Tu saldo es: " + getSaldo());
    }
}
