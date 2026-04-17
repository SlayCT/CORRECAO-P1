package br.edu.fatecpg.autodrive.main;
import br.edu.fatecpg.autodrive.view.Carro;
public class Main {
	
	   public static void main(String[] args) {
		   
	Carro carro1 = new Carro();
	
      carro1.marca="Ford";
      carro1.modelo= "Ka";
      carro1.ano = 2020; 
      
      
      System.out.println ("Marca: " +carro1.marca);
      System.out.println ("Modelo: " +carro1.modelo);
      System.out.println ("Ano: " +carro1.ano);
	 }
}

