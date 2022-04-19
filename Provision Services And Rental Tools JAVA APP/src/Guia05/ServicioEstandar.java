/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;

/*CLASE 'ServicioEstandar' SUBCLASE DE 'SERVICIO'*/
public class ServicioEstandar extends SERVICIO{
	
	//ATRIBUTOS:
	private double serviciosProfesionales;
	private double montoFijo;
	protected String tipo = "ESTANDAR";

	//CONSTRUCTORES: 
	public ServicioEstandar(double sP, double mF, OFICIO oficio, String nO) {
		this.serviciosProfesionales = sP;
		this.montoFijo = mF;
		this.oficio = oficio;
		this.nombreServicio = nO;
	
	}
	//SETTERS Y GETTERS: 
	public String getTipo() {
		return tipo;
	}
	
	
	
	
	//METODOS:
	public double costoTotal() {
		return (double) (montoFijo + serviciosProfesionales);
		
	}

}
