package com.senati.lab402;

public class Prestamo {
		int idprestamo;
		int idsocio;
		int idtitulo;
		int nrodias;
		float monto;
		public Prestamo() {
			super();
		}
		public Prestamo(int idprestamo, int idsocio, int idtitulo, int nrodias, float monto) {
			super();
			this.idprestamo = idprestamo;
			this.idsocio = idsocio;
			this.idtitulo = idtitulo;
			this.nrodias = nrodias;
			this.monto = monto;
		}
		public int getIdprestamo() {
			return idprestamo;
		}
		public void setIdprestamo(int idprestamo) {
			this.idprestamo = idprestamo;
		}
		public int getIdsocio() {
			return idsocio;
		}
		public void setIdsocio(int idsocio) {
			this.idsocio = idsocio;
		}
		public int getIdtitulo() {
			return idtitulo;
		}
		public void setIdtitulo(int idtitulo) {
			this.idtitulo = idtitulo;
		}
		public int getNrodias() {
			return nrodias;
		}
		public void setNrodias(int nrodias) {
			this.nrodias = nrodias;
		}
		public float getMonto() {
			return monto;
		}
		public void setMonto(float monto) {
			this.monto = monto;
		}
		@Override
		public String toString() {
			return "Prestamo [idprestamo=" + idprestamo + ", idsocio=" + idsocio + ", idtitulo=" + idtitulo
					+ ", nrodias=" + nrodias + ", monto=" + monto + "]";
		}
		
		
}
