package libreria.salida;

import libreria.InterfaceMetodosComunes;

public class Impresora implements InterfaceMetodosComunes {

    private String msg;

    public Impresora(String msg) {
        this.msg = msg;
    }

    @Override
    public void manejarDatos() {
        System.out.println("Imprimiendo...\n"+msg);
    }
}
