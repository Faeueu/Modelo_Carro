package br.com.catolica.Model;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;
    public int velocidade;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int velocidade){
        this.velocidade += velocidade;
        System.out.println("Acelerando, velociade atual de " + this.velocidade + "km/h");
    }

    public void reduzir(int velocidade){
        this.velocidade -= velocidade;
        System.out.println("Reduzindo, velociade atual de " + this.velocidade + "km/h");
    }

    public void frear(int velocidade){
        if (this.velocidade >= velocidade) {
            this.velocidade -= velocidade;
            System.out.println("Freando, velocidade atual: " + this.velocidade + " km/h.");
        }
        else if (this.velocidade >= 0) {
            this.velocidade = 0;
            System.out.println("O carro esta parado!!");
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
}
