package com.senati.lab402;

public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros libro1 = new Libros();
		libro1.id = 100;
		libro1.titulo ="C#";
		libro1.autor="Grupo Eidos";
		libro1.nropag=500;
		libro1.nroisbn=1496;
		libro1.precio= 50f;
		
		System.out.println(libro1.toString());

		
		Cintavideo video1 = new Cintavideo();
		video1.id = 15;
		video1.titulo="Jurassic Park";
		video1.director ="Steven Spielberg";
		video1.actorprincipal ="Richard Attenborough";
		video1.actorsecundario ="Sam Neill";
		video1.duracion = 127;
		video1.precio=25f;
		
		
		System.out.println(video1.toString());
		System.out.println(video1.protagonistas());
		
		
		Cintaaudio audio1 = new Cintaaudio();
		audio1.id= 001;
		audio1.titulo="Suna";
		audio1.autor="mar de copas";
		audio1.lugar="Lima";
		audio1.direccion="Lima";
		audio1.precio= 150f; 
		
		System.out.println(audio1.toString());
		
		Socio socio1  =new Socio(401,"Jorge","Luque Chambi","Av.Alisos");
		System.out.println(socio1.nombreCompleto());
		System.out.println(socio1.toString());
		
		Prestamo prestamo1= new Prestamo (501,401,200,4,20);
		System.out.println(prestamo1.toString());
		
				
}
		
}


