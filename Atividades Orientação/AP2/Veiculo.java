package Atts;

import java.util.Scanner;

abstract class Veiculos {
	 public String marca;
	 public String modelo;
	 private int ano;

 
	 public Veiculos(String marca, String modelo, int ano) {
	     this.marca = marca;
	     this.modelo = modelo;
	     this.ano = ano;
	 }


	 public abstract String informacoesVeiculo();


	 public int getAno() {
		 return ano;
	 }

	 public void setAno(int ano) {
		 this.ano = ano;
	 }
}


class Carro extends Veiculos {
	public int numeroPortas;


	public Carro(String marca, String modelo, int ano, int numeroPortas) {
		super(marca, modelo, ano);
		this.numeroPortas = numeroPortas;
	}


	@Override
	public String informacoesVeiculo() {
		return "Carro [Marca: " + marca + ", Modelo: " + modelo + 
				", Ano: " + getAno() + ", Número de Portas: " + numeroPortas + "]";
	}
}


class Moto extends Veiculos {
	private int cilindrada;


	public Moto(String marca, String modelo, int ano, int cilindrada) {
		super(marca, modelo, ano);
		this.cilindrada = cilindrada;
	}


	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	@Override
	public String informacoesVeiculo() {
		return "Moto [Marca: " + marca + ", Modelo: " + modelo + 
				", Ano: " + getAno() + ", Cilindrada: " + cilindrada + "cc]";
	}
}


public class Veiculo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o veiculo(Moto ou Carro): ");
        String veiculo = scanner.next();
        if(veiculo.equalsIgnoreCase("Moto")) {
        	Moto moto = new Moto("Yamaha", "MT-07", 2021, 689);
    		System.out.println(moto.informacoesVeiculo());
        }
        if(veiculo.equalsIgnoreCase("Carro")) {
        	Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
    		System.out.println(carro.informacoesVeiculo());
        }
        scanner.close();
	}
}
