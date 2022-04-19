/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;
import java.time.LocalDate;

/*CLASE PUBLICA 'TRABAJO'*/
public class TRABAJO implements CONTRATABLES{
	
	//ATRIBUTOS: 
	private SERVICIO servicio;
	private LocalDate fechaInicio;
	private LocalDate fechaFin = null;
	private boolean urgente;
	
	//CONSTRUCTORES: 
	public TRABAJO(SERVICIO servicio, LocalDate fecha, boolean urgente) {
		this.servicio = servicio;
		this.fechaInicio = fecha;
		this.urgente = urgente;
	}
	


	//METODOS: 
	public double Precio() {
		double costoServicio = servicio.costoTotal();
		
		if(this.urgente) {
			costoServicio*=1.50;
		}
		return costoServicio;
	}

	public OFICIO getOficio() {
		return this.servicio.getOficio();
	}

	public boolean finalizado() {
		boolean ret = true;
		if(fechaFin == null || (fechaFin != null && fechaFin.isAfter(LocalDate.now()))) {
			ret=false;
		}
		return ret;
	}


	public LocalDate getFecha() {
		return fechaInicio;
	}

	public void finalizar(LocalDate fecha) {
		this.fechaFin = fecha;
	}

	public Boolean terminar() {

		return null;
	}


	
	
}
