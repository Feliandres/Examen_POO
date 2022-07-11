package clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<CajeroAutomatico> usuario = new ArrayList<>();
        CajeroAutomatico mensaje = new Funciones_Consulta();
        for (int i=0; i<3;i++) {
            usuario.add(new Funciones_Consulta()) ;
        }
        mensaje.operaciones();


        try(BufferedWriter bw= new BufferedWriter(new FileWriter("cajero.txt"))){
            for(CajeroAutomatico u : usuario) {
                bw.newLine();
                bw.write(mensaje.getSaldo());
                bw.newLine();
                bw.write(usuario.toString());
                bw.close();
            }
            System.out.println("Escritura correcta");
        } catch (
                IOException e) {
            System.out.println("Error");
        }





    }


}
