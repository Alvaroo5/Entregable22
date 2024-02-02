package u4.u5.entregable;

public abstract class Agrupacion implements Comparable<Agrupacion>{

	protected String nombre;
	protected String autor;
	protected String autor_musica;
	protected String autor_letras;
	protected String disfraz;
	
	Agrupacion(String nombre, String autor, String autor_musica, String autor_letras, String disfraz){
		this.nombre=nombre;
		this.autor=autor;
		this.autor_musica=autor_musica;
		this.autor_letras=autor_letras;
		this.disfraz=disfraz;
	}
	
	public abstract void cantar_la_presentacion();
	
	public abstract void mostrar_tipo();
	
}
