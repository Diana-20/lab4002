package com.senati.lab402;

public class Cintavideo extends Mediateca{
		String director;
		String actorprincipal;
		String actorsecundario;
		int duracion;
		
		public Cintavideo() {
			super();
		}

		
		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public String getActorprincipal() {
			return actorprincipal;
		}

		public void setActorprincipal(String actorprincipal) {
			this.actorprincipal = actorprincipal;
		}

		public String getActorsecundario() {
			return actorsecundario;
		}

		public void setActorsecundario(String actorsecundario) {
			this.actorsecundario = actorsecundario;
		}

		public int getDuracion() {
			return duracion;
		}

		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}


		@Override
		public String toString() {
			return "Cintavideo [director=" + director + ", actorprincipal=" + actorprincipal + ", actorsecundario="
					+ actorsecundario + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo + ", precio="
					+ precio + "]";
		}

		public String protagonistas() {
			return director + "" + actorprincipal +" "+ actorsecundario;
		}
		
		
		
}
