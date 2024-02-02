package u4.u5.entregable;

import java.util.Arrays;

public class COAC {

	private AgrupacionOficial[] agrupaciones;
	
	public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
		
	}
	
	public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
		return false;
	}
	
	public void ordenar_por_puntos() {
		Arrays.sort(agrupaciones, puntos);
	}	
	
	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones, nombre);
	}
	
	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, autor);
	}
}
