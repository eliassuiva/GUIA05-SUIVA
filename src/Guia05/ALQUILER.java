/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;
/*CLASES IMPORTADAS: 															 */
import java.time.LocalDate;	
import java.time.temporal.ChronoUnit;


/*CLASE PUBLICA 'TRABAJO'														 */
public class ALQUILER implements CONTRATABLES {
	
	//ATRIBUTOS: 
	private LocalDate fechaFin2 = null; 
	private HERRAMIENTA herramienta;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate hoy = LocalDate.now();
	
	
	//CONSTRUCORES:
	public ALQUILER(HERRAMIENTA herramienta, LocalDate fechaInicio, int cantDias) {
		this.herramienta = herramienta;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaInicio.plusDays(cantDias);
		this.fechaFin2 = null;
	}
	
	
	//METODOS:
	public double Precio() {
		if(fechaFin2 != null) {
			return (ChronoUnit.DAYS.between(fechaInicio, fechaFin2))*herramienta.getCostoXDia();
		} else {
			return (ChronoUnit.DAYS.between(fechaInicio, hoy))*herramienta.getCostoXDia();
		}
	}	
	
	
	public Boolean enMora() {
		boolean ret = false;
		LocalDate hoy = LocalDate.now();
		if((fechaFin2 != null && fechaFin2.isAfter(fechaFin)) || (fechaFin2 == null && hoy.isAfter(fechaFin))) {
			ret = true;
		}
		return ret;
	}
	
	

	
	public Boolean terminar() {
		boolean ret = false;
		if(this.fechaFin2 != null) {
			ret = true;
		}
		
		return ret;
	}
	
	public void devolver(LocalDate fechaDev) {
		this.fechaFin2 = fechaDev;
	}
}
