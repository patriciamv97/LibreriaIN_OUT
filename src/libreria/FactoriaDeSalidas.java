package libreria;

import libreria.entrada.EConsola;
import libreria.entrada.EVentana;
import libreria.salida.SConsola;
import libreria.salida.SImpresora;
import libreria.salida.SVentana;

public class FactoriaDeSalidas {

    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;
    public static final int IMPRESORA=3;

    public static InterfaceMetodosComunes getProductoTipoSalida(int type, String msg) {
        switch (type) {
            case CONSOLA:
                return new SConsola(msg);
            //Como devuelvo el objeto instanciado (return) no hace falta poner break
            case VENTANA:
                return new SVentana(msg);
            case IMPRESORA:
                return new SImpresora(msg);
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
