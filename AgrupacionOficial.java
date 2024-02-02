package u4.u5.entregable;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion implements Callejera{

	private int puntos;
	private Integrante[] integrantes;
	
	AgrupacionOficial(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos) {
		super(nombre, autor, autor_musica, autor_letras, disfraz);
		this.puntos = 0;
	}
	
	public void insertar_integrante(Integrante i) {
		for(int j = 0; j < integrantes.length; j++) {
			if(integrantes[j]==null) {
				integrantes[j]=i;
			}
		}
	}
	
	public boolean eliminar_integrante(Integrante i) {
		for(int j = 0; j < integrantes.length; j++) {
			if(integrantes[j]!= null && integrantes[j].equals(i)) {
				integrantes[j]=null;
				return true;
			}
		}
		return false;
	}
	
	public void setPuntos(int puntos) {
		this.puntos=puntos;
	}
	
	public abstract void caminito_del_falla();
	
	@Override
	public String toString() {
		return "AgrupacionOficial [puntos=" + puntos + ", integrantes=" + Arrays.toString(integrantes) + ", nombre="
				+ nombre + ", autor=" + autor + ", autor_musica=" + autor_musica + ", autor_letras=" + autor_letras
				+ ", disfraz=" + disfraz + "]";
	}
}
