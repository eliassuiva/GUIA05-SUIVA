/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;

/*Clases Importadas: 															 */
import java.util.ArrayList;

/*CLASE 'TRABAJADOR'															 */
public class TRABAJADOR {
	
	//ATRIBUTOS: 
	private String nombre;
	private String email;
	private OFICIO oficio;
	private double costoPorHora;
	private double porcentajeComision;
	private ArrayList<TRABAJO> trabajoAsignados = new ArrayList<TRABAJO>();

	//CONSTRUCTORES GETTERS Y SETTERS: 
	public TRABAJADOR(String nombre, String email, OFICIO oficio, double costoXHora, double porcentajeComision) {
		this.nombre = nombre;
		this.email = email;
		this.oficio = oficio;
		this.costoPorHora = costoXHora;
		this.porcentajeComision = porcentajeComision;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getOficio() {
		return oficio.getNombreOficio();
	}
	
	//METODOS: 
	public double getPorcentajeComision() {
		return this.porcentajeComision;
	}
	
	public Boolean agregarTrabajo(TRABAJO trabajo) throws OFICIO_NO_COINCIDENTE_EXCEPTION, AGENDA_OCUPADA_EXCEPTION{
		if(trabajo.getOficio() != this.oficio) {
			throw new OFICIO_NO_COINCIDENTE_EXCEPTION("EXPECTION ERROR, EL TRABAJADOR NO ESTA CAPACITADO PARA REALIZAR ESTE TIPO DE TRABAJO");
		} else {
			long count = trabajoAsignados.stream().map(s -> s.getFecha()).filter(s-> s.compareTo(trabajo.getFecha()) == 0).count();
			if(count == 0) {
					trabajoAsignados.add(trabajo);
					return true;
				} else {
					throw new AGENDA_OCUPADA_EXCEPTION("EXEPCTION ERROR, EL TRABAJADOR YA TIENE TRABAJO AGENDADO PARA ESE DIA");
				}
		}
		
	}

	
}
