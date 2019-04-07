package br.com.aulaObjetosEClasses;

public class Caneta {
    //atributos
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta: "+this.cor);
        System.out.println("Ponts: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Esta tampada? "+this.tampada);

    }

    //metodos
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar(){
        this.tampada=true;

    }
    void destampar(){
        this.tampada=false;

    }
}
