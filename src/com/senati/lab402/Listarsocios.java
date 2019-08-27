package com.senati.lab402;

import java.util.HashSet;
import java.util.Set;


import com.senati.lab402.Socio;

public class Listarsocios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio so01 =new Socio(1,"Jorge","Luque Chambi","Independencia");
		Socio so02 = new Socio(2,"Raquel","Chavez Dominguez","Av Las Lomas");
		Socio so03 = new Socio(3,"Fiorella","Bolaños Salas","Vara de oro");
		Socio so04 = new Socio(4,"Diego","Arica Trejos","Huachipa");
		Socio so05 = new Socio(5,"Flor","Huicho Mamani","Santa Rosa");
		Socio so06 = new Socio(6,"Juan","Pinto Paredes","Puente Piedra");
		Socio so07 = new Socio(7,"Carlos","Vidal Sandoval","Ancon");
		Socio so08 = new Socio(8,"Francisco","Chihuan Martinez","Cercado");
		Socio so09 = new Socio(9,"Eduardo","Pardo Chiroque","La Victoria");
		Socio so10 = new Socio(10,"David","Barrientos Torres","Callao");
		
Set <Socio> socioMediateca = new HashSet<Socio>();
		
		socioMediateca.add(so01);
		socioMediateca.add(so02);
		socioMediateca.add(so03);
		socioMediateca.add(so04);
		socioMediateca.add(so05);
		socioMediateca.add(so06);
		socioMediateca.add(so07);
		socioMediateca.add(so08);
		socioMediateca.add(so09);
		socioMediateca.add(so10);
		
		
		for (Socio socio : socioMediateca) {
			System.out.println(socio.getIdsocio() +" "+ socio.getApellido() + " " + socio.getNombre());
		}
	}

}
