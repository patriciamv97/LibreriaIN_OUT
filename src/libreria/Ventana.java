package libreria;

public class Ventana implements InterfaceMetodosComunes {
    private  String msg;

    public Ventana(String msg) {
        this.msg = msg;
    }
    @Override
    public void visualizar() {
        System.out.println("El mensaje se visualiza por ventana.\n" + msg);
    }
}
