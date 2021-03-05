package libreria.entrada;

import libreria.InterfaceMetodosComunes;

import java.util.Scanner;

public class EConsola implements InterfaceMetodosComunes {
    private final String msg;
    public EConsola(String msg){
        this.msg=msg;
    }
    @Override
    public void comunicar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        String respuesta=sc.nextLine();

    }
}
