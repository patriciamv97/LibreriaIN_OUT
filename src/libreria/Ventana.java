package libreria;

import javax.swing.*;

public class Ventana implements InterfaceMetodosComunes {
    private  String msg;

    public Ventana(String msg) {
        this.msg = msg;
    }
    @Override
    public void visualizar() {
        JOptionPane.showMessageDialog(null,"El mensaje se visualiza por ventana.\n" + msg);
    }
}
