package libreria;

public class Consola {
    private String msg;

    public Consola(String msg) {
        this.msg = msg;
    }
    public void visualizar(){
        System.out.println("El mensaje se visualiza por consola.\n"+msg);
    }
}
