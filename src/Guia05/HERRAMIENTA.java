/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;


/*CLASE PUBLICA 'HERRMIENTA'													 */
public class HERRAMIENTA {
	
	//ATRIBUTOS: 
	private double costoXDia;
	private String nombre;

	//CONSTRUCTORES, SETTERS Y GETTERS: 
	public HERRAMIENTA(String nombre, double costoXDia) {
		this.nombre = nombre;
		this.costoXDia = costoXDia;
	}


	public String getNombre() {
		return nombre;
	}
	public double getCostoXDia() {
		return costoXDia;
	}

	
	
}
