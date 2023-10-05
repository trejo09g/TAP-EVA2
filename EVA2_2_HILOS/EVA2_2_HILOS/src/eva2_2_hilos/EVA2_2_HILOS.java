/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FECHA: 4 DE OCTUBRE DEL 2023 MIERCOLES
 * @author Ana Gabriela Miramontes Mariñelarena 22550013
 */
public class EVA2_2_HILOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                //Cualquier tarea que se quiera ejecutar simultaneamente
                for(int i = 0;i < 10; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EVA2_2_HILOS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    };
        Thread thread = new Thread(runnable);
        thread.start(); //INICIO DEL HILO
        //-------------------------------------
        MiHilo miHilo = new MiHilo();
        miHilo.start();// inicio el hilo
    }
}
