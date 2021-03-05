package libreria.salida;

import libreria.InterfaceMetodosComunes;

public class Consola implements InterfaceMetodosComunes {
    private  String msg;

    public Consola(String msg) {
        this.msg = msg;
    }

    //@Override para indicar que está sobrescribiendo el método de la interfaz
    @Override
    public void manejarDatos(){
        System.out.println("El mensaje se visualiza por consola.\n"+msg);
    }
}
