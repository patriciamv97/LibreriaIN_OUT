package libreria;

public class Consola implements InterfaceMetodosComunes {
    private  String msg;

    public Consola(String msg) {
        this.msg = msg;
    }

    //@Override para indicar que está sobrescribiendo el método de la interfaz
    @Override
    public void visualizar(){
        System.out.println("El mensaje se visualiza por consola.\n"+msg);
    }
}
