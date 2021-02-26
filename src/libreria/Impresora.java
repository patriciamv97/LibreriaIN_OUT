package libreria;

public class Impresora implements InterfaceMetodosComunes {

    private String msg;

    public Impresora(String msg) {
        this.msg = msg;
    }

    @Override
    public void visualizar() {
        System.out.println("Imprimiendo...\n"+msg);
    }
}
