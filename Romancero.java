package u4.u5.entregable;

public abstract class Romancero extends AgrupacionOficial implements Callejera{

	private String tematica_cartelon;
	
	@Override
	public String toString() {
		return "Romancero [tematica_cartelon=" + tematica_cartelon + ", nombre=" + nombre + ", autor=" + autor
				+ ", autor_musica=" + autor_musica + ", autor_letras=" + autor_letras + ", disfraz=" + disfraz + "]";
	}

	Romancero(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos) {
		super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
		this.tematica_cartelon=tematica_cartelon;
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentacion del romancero con nombre "+nombre);
	}
	
	@Override
	public void mostrar_tipo() {
		System.out.println("El romancero "+nombre+" va de "+disfraz);
	}
	
	@Override
	public void amo_a_escucha() {
		System.out.println("Amo escucha el romancero "+nombre);
	}
	
	@Override
	public int compareTo(Agrupacion o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
