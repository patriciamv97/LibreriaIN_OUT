package libreria.salida;

import libreria.InterfaceMetodosComunes;

public class SImpresora implements InterfaceMetodosComunes {

    private String msg;

    public SImpresora(String msg) {
        this.msg = msg;
    }

    @Override
    public void comunicar() {
        System.out.println("Imprimiendo...\n"+msg);
    }
}
