package u4.u5.entregable;

public abstract class Comparsa extends AgrupacionOficial{

	private String atrezzo;
	
	Comparsa(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos) {
		super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
		this.atrezzo=atrezzo;
	}

	@Override
	public String toString() {
		return "Comparsa [atrezzo=" + atrezzo + "]";
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentacion de la comparsa con nombre "+nombre);
	}
	
	@Override
	public void mostrar_tipo() {
		System.out.println("La comparsa "+nombre+" va de "+disfraz);
	}
	
	@Override
	public void caminito_del_falla() {
		System.out.println("El/la "+nombre+"va caminito del falla");
	}
	
	@Override
	public int compareTo(Agrupacion o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
