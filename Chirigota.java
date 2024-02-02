package u4.u5.entregable;

public class Chirigota extends AgrupacionOficial implements Callejera{

	private int num_cuples;
	
	Chirigota(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos) {
		super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
		this.num_cuples=num_cuples;
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentacion de la chirigota con nombre "+nombre);
	}
	
	@Override
	public void mostrar_tipo() {
		System.out.println("La chirigota "+nombre+" va de "+disfraz);
	}
	
	@Override
	public void amo_a_escucha() {
		System.out.println("Amo escucha la chirigota "+nombre);
	}
	
	@Override
	public void caminito_del_falla() {
		System.out.println("El/la "+nombre+"va caminito del falla");
	}
	
	@Override
	public String toString() {
		return "Chirigota [num_cuples=" + num_cuples + "]";
	}

	@Override
	public int compareTo(Agrupacion o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
