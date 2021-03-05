package libreria.salida;

import libreria.InterfaceMetodosComunes;

public class SConsola implements InterfaceMetodosComunes {
    private  String msg;

    public SConsola(String msg) {
        this.msg = msg;
    }

    //@Override para indicar que está sobrescribiendo el método de la interfaz
    @Override
    public void comunicar(){
        System.out.println("El mensaje se visualiza por consola.\n"+msg);
    }
}
