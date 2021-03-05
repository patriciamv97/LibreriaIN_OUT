package libreria;

import libreria.entrada.EConsola;
import libreria.entrada.EVentana;
import libreria.salida.Consola;
import libreria.salida.Impresora;
import libreria.salida.Ventana;

public class FactoriaDeSalidas {

    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;
    public static final int IMPRESORA=3;

    public static InterfaceMetodosComunes getProductoTipoSalida(int type, String msg) {
        switch (type) {
            case CONSOLA:
                return new Consola(msg);
            //Como devuelvo el objeto instanciado (return) no hace falta poner break
            case VENTANA:
                return new Ventana(msg);
            case IMPRESORA:
                return new Impresora(msg);
            default:
                return null;
        }
    }
    public  static InterfaceMetodosComunes getProductoTipoEntrada(int type,String msg){
        switch (type){
            case CONSOLA:
                return new EConsola(msg);
            case VENTANA:
                return new EVentana(msg);
            default:
                return null;
        }
    }


}
