package com.senati.lab402;
import java.util.HashSet;
import java.util.Set;



public class Listaraudio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cintaaudio audio01 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio02 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio03 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio04 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio05 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio06 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio07 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio08 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio09 = new Cintaaudio("suna","mar de copas","Independenia");
		Cintaaudio audio10 = new Cintaaudio("suna","mar de copas","Independenia");
		
Set <Cintaaudio> CintaaudioMediateca = new HashSet<Cintaaudio>();
		
		CintaaudioMediateca.add(audio01);
		CintaaudioMediateca.add(audio02);
		CintaaudioMediateca.add(audio03);
		CintaaudioMediateca.add(audio04);
		CintaaudioMediateca.add(audio05);
		CintaaudioMediateca.add(audio06);
		CintaaudioMediateca.add(audio07);
		CintaaudioMediateca.add(audio08);
		CintaaudioMediateca.add(audio09);
		CintaaudioMediateca.add(audio10);
		
		
		for (Cintaaudio audio : CintaaudioMediateca) {
			System.out.println(audio.getAutor() +" "+ audio.getLugar() + " " + audio.getDireccion());
		}
	}

}

