package libreria.salida;

import libreria.InterfaceMetodosComunes;

import javax.swing.*;

public class Ventana implements InterfaceMetodosComunes {
    private  final  String msg;

    public Ventana(String msg) {
        this.msg = msg;
    }
    @Override
    public void manejarDatos() {
        JOptionPane.showMessageDialog(null,"El mensaje se visualiza por ventana.\n" + msg);
    }
}
