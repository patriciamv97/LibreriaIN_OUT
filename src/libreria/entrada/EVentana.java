package libreria.entrada;

import libreria.InterfaceMetodosComunes;

import javax.swing.*;

public class EVentana implements InterfaceMetodosComunes {
    private final String msg;

    public EVentana(String msg){
        this.msg=msg;
    }
    @Override
    public void manejarDatos(){
        JOptionPane.showInputDialog(msg);
    }
}
