package mx.edu.uam.practica3;

import java.util.Date;

import mx.edu.uam.practica3.control.ControlTv;
import mx.edu.uam.practica3.control.ControlVentilador;
import mx.edu.uam.practica3.electrodomestico.Television;
import mx.edu.uam.practica3.electrodomestico.Ventilador;


public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Television television = new Television("SONY", 15, false, 5, 950, 10, 100);
        Television television2 =new Television();
        
        television2.setMarca("LG");
        television2.setCanalActual(2);
        television2.setEncendido(false);
        television2.setVolumenMaximo(1000);
        
        System.out.println("la segunda television esta encendida??? "+television2.isEncendido());
        television2.setEncendido(true);
        System.out.println("la segunda television esta encendida??? "+television2.isEncendido());
        
        ControlTv controlTv = new ControlTv();
        Date fecha = new Date();
        int anio=fecha.getYear();
        System.out.println("Feliz año: "+ (anio+1900));        
        controlTv.powerTv(television);
        System.out.println("cambios en volumen");
        controlTv.subeVolumen(television);
        controlTv.bajaVolumen(television);
        System.out.println("cambios en canal");
        controlTv.subeCanal(television);
        controlTv.bajaCanal(television);
        controlTv.cambiaCanal(television, 700);

        System.out.println("");

        Ventilador ventilador = new Ventilador("AIRE", 90, false, 10, 50);
        ControlVentilador controlVent = new ControlVentilador();

        controlVent.powerVentilador(ventilador);
        System.out.println("cambios en velocidad");
        controlVent.subeVelocidad(ventilador);
        controlVent.bajaVelocidad(ventilador);
        controlVent.cambiaVelocidad(ventilador, 40);

        System.out.println("");

    }

}