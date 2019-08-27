package com.senati.lab402;

public class Libros extends Mediateca{
			String autor ;
			int nropag;
			int nroisbn;
			
			public Libros() {
				super();
			}

			
			public String getAutor() {
				return autor;
			}

			public void setAutor(String autor) {
				this.autor = autor;
			}

			public int getNropag() {
				return nropag;
			}

			public void setNropag(int nropag) {
				this.nropag = nropag;
			}

			public int getNroisbn() {
				return nroisbn;
			}

			public void setNroisbn(int nroisbn) {
				this.nroisbn = nroisbn;
			}

			@Override
			public String toString() {
				return "Libros [autor=" + autor + ", nropag=" + nropag + ", nroisbn=" + nroisbn + ", id=" + id
						+ ", titulo=" + titulo + ", precio=" + precio + "]";
			}


}
