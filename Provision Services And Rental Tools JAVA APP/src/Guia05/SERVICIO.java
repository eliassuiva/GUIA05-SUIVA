/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;

/*CLASE ABSTRACTA 'SERVICIO'													 */
public abstract class SERVICIO {

	//ATRIBUTOS: 
	protected OFICIO oficio;
	protected String nombreOficio;
	protected String nombreServicio;
	public abstract double costoTotal();
	public abstract String getTipo();
	
	//SETTERS Y GETTERS: 
	
	public OFICIO getOficio() {
		return oficio;
	}
	

	public String getOficioNombre() {
		return oficio.getNombreOficio();
	}
	
	public String getNombreServicio() {
		return nombreServicio;
	}
	
	
}
