package com.edu.dio.metodos;

public class App {

	public static void main(String[] args) {
		
		SmartTv smarTv = new SmartTv();
		
		System.out.println("A tv esta ligada?  " + smarTv.ligada);
		System.out.println("Qual o canal Atual? " + smarTv.canal);
		System.out.println("Qual o Volume Atual? " + smarTv.volume);
		
		smarTv.ligar();
		System.out.println("Novo Statos, Tv Ligada : " + smarTv.ligada);
		
		smarTv.desligar();
		System.out.println("Novo Statos, Tv Desligada : " + smarTv.ligada);
		
		smarTv.aumentarVolume();
		smarTv.aumentarVolume();
		
		System.out.println("Volume Atual? " + smarTv.volume);
		
		smarTv.diminuirVolume();
		smarTv.diminuirVolume();
		smarTv.diminuirVolume();
				
		System.out.println("Volume Atual? " + smarTv.volume);
		
		smarTv.mudarCanal(45);
		
		System.out.println("A tv esta ligada?  " + smarTv.ligada);
		System.out.println("Qual o canal Atual? " + smarTv.canal);
		System.out.println("Qual o Volume Atual? " + smarTv.volume);
		
		
	}

}
