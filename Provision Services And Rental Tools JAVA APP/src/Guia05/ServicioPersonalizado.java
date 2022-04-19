/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;

/*CLASE 'ServicioPersonalizado' SUBCLASE DE 'SERVICIO'*/
public class ServicioPersonalizado extends SERVICIO {
	
	/*ATRIBUTOS: */
	private double presupuesto;
	private double costoMateriales;
	private double costoTransporte;
	protected String tipo = "PERSONALIZADO";
	
	/*CONSTRUCTORES: */
	public ServicioPersonalizado( double presupuesto, double costoMateriales, double costoTransporte,OFICIO oficio, String nO) {
		this.presupuesto = presupuesto;
		this.costoMateriales = costoMateriales;
		this.costoTransporte = costoTransporte;
		this.oficio = oficio;
		this.nombreServicio = nO;
	}
	
	/*SETTERS Y GETTERS: */
	public String getTipo() {
		return tipo;
	}
	
	

	/*METODOS: */
		public double costoTotal() {
			return presupuesto + costoMateriales + costoTransporte;
		}

}
