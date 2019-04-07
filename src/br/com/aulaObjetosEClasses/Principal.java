package br.com.aulaObjetosEClasses;

public class Principal {
    public static void main(String[] args) {
        Caneta c1= new Caneta();
        c1.modelo="bic";
        c1.cor="azul";
        c1.ponta=0.5f;
        c1.status();

        c1.tampar();
        c1.rabiscar();

        Caneta c2= new Caneta();
        c2.modelo="Faber Castel";
        c2.cor="vermelho";
        c2.ponta=1.0f;
        c2.status();

        c2.destampar();
        c2.rabiscar();


    }
}
