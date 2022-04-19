/*   							SUIVA, ELÍAS JOSE - GUIA 05						 */
/*Package																		 */
package Guia05;
/*Clases Importadas: 															 */
import java.util.ArrayList;


/*CLASE PUBLICA 'USUARIO'													     */
public class USUARIO {
	
	//ATRIBUTOS: 
	private String nombre;
	private ArrayList<CONTRATABLES> servicioContratables = new ArrayList<CONTRATABLES>();
	
	//CONSTRUCTORES, SETTERS Y GETTERS: 
	public USUARIO(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreUsuario() {
		return this.nombre;
	}
	
	//METODOS: 
	public boolean Contratar(CONTRATABLES c) throws ALQUILER_NO_ENTREGADO_EXCEPTION {
		if(c instanceof TRABAJO) {
			servicioContratables.add(c);
			return true;
		} else {
			long count = servicioContratables.stream()
					.filter(s -> s instanceof ALQUILER && !s.terminar())
					.count();
			if(count > 2) {
				throw new ALQUILER_NO_ENTREGADO_EXCEPTION("EXCEPTION ERROR, EL USUARIO YA POSEE MAS DE DOS ALUILERES EN ESTADO PENDIENDE, DEVUEVLA UNO PARA PODER ALQUILAR OTRO");
					
			} else {
				servicioContratables.add(c);
				return true;
			}
		}
	}

}
