package br.com;

public class TestaCarro {
    public static void main(String[] args) {

        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

       //modelo do carro
        System.out.println("Modelo do Carro:  " + meuCarro.modelo);

        //cor do carro
        System.out.println("Cor do carro:  "  +  meuCarro.cor);

        //liga o carro
        meuCarro.liga();

        // acelerar o carro
        meuCarro.acelera(20);
        System.out.println("Velocidade atua neste momento do carro:  " + meuCarro.velocidadeAtual  +  "Km");

        meuCarro.acelera(80);
        System.out.println("Velocidade maxima do carro:  " + meuCarro.velocidadeMaxima  + "Km" );


    }
}
