package clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<CajeroAutomatico> usuario = new ArrayList<>();
        CajeroAutomatico mensaje = new Funciones_Consulta();
        for (int i=0; i<3;i++) {
            System.out.println("Usuario "+(i+1));
            System.out.println("Ingrese el saldo: ");
            int saldo = entrada.nextInt();
            saldo = mensaje.getSaldo();
            usuario.add(new CajeroAutomatico() {
                @Override
                public void Transacciones() {
                    System.out.println("Ingrese el saldo: ");
                    int saldo = entrada.nextInt();
                }
            }) ;
        }
        mensaje.operaciones();


        try(BufferedWriter bw= new BufferedWriter(new FileWriter("cajero.txt"))){
            for(CajeroAutomatico u : usuario) {
                bw.newLine();
                bw.write("Usuario ");
                bw.newLine();
                bw.write(u.getSaldo());
                bw.close();
            }
            System.out.println("Escritura correcta");
        } catch (
                IOException e) {
            System.out.println("Error");
        }





    }


}
