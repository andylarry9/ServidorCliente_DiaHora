package consola;

import java.io.*;
import java.net.*;

public class Main {
    private static final int portdiahora = 13;
    private static Socket conexion;

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ServerSocket servidor = new ServerSocket(portdiahora);
            while(true){
                conexion = servidor.accept();
                PrintWriter out = new PrintWriter(conexion.getOutputStream(), true);
                out.println("La fecha y hora es: "+ new java.util.Date());
                conexion.close();
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
    
}
