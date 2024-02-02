package u4.u5.entregable;

public abstract class Coro extends AgrupacionOficial{

	private int num_bandurrias;
	private int num_guitarras;
	
	Coro(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos) {
		super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
		this.num_bandurrias=num_bandurrias;
		this.num_guitarras=num_guitarras;
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentacion del coro con nombre "+nombre);
	}
	
	@Override
	public void mostrar_tipo() {
		System.out.println("El coro "+nombre+" va de "+disfraz);
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

	@Override
	public String toString() {
		return "Coro [num_bandurrias=" + num_bandurrias + ", num_guitarras=" + num_guitarras + "]";
	}

}
