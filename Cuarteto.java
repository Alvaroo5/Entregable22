package u4.u5.entregable;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	private int num_miembros;
	
	Cuarteto(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos) {
		super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
		this.num_miembros=num_miembros;
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentacion del cuarteto con nombre "+nombre);
	}
	
	@Override
	public void mostrar_tipo() {
		System.out.println("El cuarteto "+nombre+" va de "+disfraz);
	}
	
	@Override
	public void amo_a_escucha() {
		System.out.println("Amo escucha el cuarteto "+nombre);
	}
	
	@Override
	public void caminito_del_falla() {
		System.out.println("El/la "+nombre+"va caminito del falla");
	}
	
	@Override
	public String toString() {
		return "Cuarteto [num_miembros=" + num_miembros + "]";
	}

	@Override
	public int compareTo(Agrupacion o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
