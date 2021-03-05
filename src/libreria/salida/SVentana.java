package libreria.salida;

import libreria.InterfaceMetodosComunes;

import javax.swing.*;

public class SVentana implements InterfaceMetodosComunes {
    private  final  String msg;

    public SVentana(String msg) {
        this.msg = msg;
    }
    @Override
    public void comunicar() {
        JOptionPane.showMessageDialog(null,"El mensaje se visualiza por ventana.\n" + msg);
    }
}
