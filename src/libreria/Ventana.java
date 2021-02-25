package libreria;

public class Ventana {
    private String msg;

    public Ventana(String msg) {
        this.msg = msg;
    }

    public void visualizar(){
        System.out.println("El mensaje se visualiza por ventana.\n"+msg);
    }
}
