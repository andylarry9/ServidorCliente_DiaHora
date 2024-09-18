package consola;

import java.io.*;
import java.net.*;

public class Main {
    private static String host = "localhost";
    private static int puerto = 13;

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Socket s = new Socket(host, puerto);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(entrada.readLine());
            s.close();
        } catch (UnknownHostException err) {
            err.printStackTrace();        
        } catch (IOException err) {
            // No existe un servidor en este puerto
            err.printStackTrace();             
        } 
    }
    
}
