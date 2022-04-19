/* *
 * 
 */
package Guia05;
import java.time.LocalDate;	

/**
 * @author Suiva_Elías_José
 *
 */

public class AppMain {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO prueba_guia05
		
		System.out.println("PRUEBA DE APLIACION ReparaFix GUIA05 - SUIVA ELÍAS JOSÉ:"+ '\n');
	
		//CREANDO USUARIOS:
		USUARIO usuario1 = new USUARIO("FEDERICO");
		System.out.println("HOLA USUARIO NRO.1: '" + usuario1.getNombreUsuario() + "', ¿CÓMO ESTÁS?" +'\n');

		
		//CREANDO OFICIOS:
		OFICIO oficio1 = new OFICIO("DESARROLLADOR");
		OFICIO oficio2= new OFICIO("ELECTRICISTA");
		System.out.println("Oficios: ");
		System.out.println("OFICIO NRO.1: " + oficio1.getNombreOficio());
		System.out.println("OFICIO NRO.2: " + oficio2.getNombreOficio() +'\n') ;
		
		//CREANDO SERVICIOS:
		SERVICIO servicioEstandar1 = new ServicioEstandar(1000.0, 500.0, oficio1,"Java Developer");
		SERVICIO servicioPersonalizado1 = new ServicioPersonalizado(5000.0, 100.0, 100.0,oficio1, "Java App Web");
		SERVICIO servicioEstandar2 = new ServicioEstandar(8000.0, 280.0, oficio2,"Instalacion de Red Electrica");
		SERVICIO servicioPersonalizado2 = new ServicioPersonalizado(1000.0, 2000.0, 500.0,oficio2, "Instalacion de Luces Externas");
		
		System.out.println("Servicios: ");
		System.out.println(
		"Servicio NRO.1: " + servicioEstandar1.getNombreServicio()
		+ " Oficio: " +servicioEstandar1.getOficioNombre()
		+ " Tipo: " +servicioEstandar1.getTipo());

		System.out.println(
		"Servicio NRO.2: " + servicioPersonalizado1.getNombreServicio() 
		+ " Oficio: " +servicioPersonalizado1.getOficioNombre()
		+ " Tipo: " +servicioPersonalizado1.getTipo());
		
		System.out.println(
				"Servicio NRO.3: " + servicioEstandar2.getNombreServicio()
				+ " Oficio: " +servicioEstandar2.getOficioNombre()
				+ " Tipo: " +servicioEstandar2.getTipo());

				System.out.println(
				"Servicio NRO.4: " + servicioPersonalizado2.getNombreServicio() 
				+ " Oficio: " +servicioPersonalizado2.getOficioNombre()
				+ " Tipo: " +servicioPersonalizado2.getTipo() +'\n');
				
		
		//CREANDO HERRAMIENTAS:
		HERRAMIENTA herramienta1 = new HERRAMIENTA("COMPUTADORA", 1250);
		HERRAMIENTA herramienta2 = new HERRAMIENTA("TECLADO", 250);
		HERRAMIENTA herramienta3 = new HERRAMIENTA("TALADRO", 800);
		HERRAMIENTA herramienta4 = new HERRAMIENTA("TESTER", 300);
		
		System.out.println("Herramientas: ");
		System.out.println("Herramienta 1: " + herramienta1.getNombre() + " Costo: " + herramienta1.getCostoXDia());
		System.out.println("Herramienta 2: " + herramienta2.getNombre() + " Costo: " + herramienta2.getCostoXDia());
		System.out.println("Herramienta 3: " + herramienta3.getNombre() + " Costo: " + herramienta3.getCostoXDia());
		System.out.println("Herramienta 4: " + herramienta4.getNombre() + " Costo: " + herramienta4.getCostoXDia()+'\n');
		
		//CREANDO ALQUILERES:
		ALQUILER alquiler1 = new ALQUILER(herramienta1, LocalDate.now().minusDays(4), 6);
		ALQUILER alquiler2 = new ALQUILER(herramienta1, LocalDate.now().minusDays(6), 7);
		ALQUILER alquiler3 = new ALQUILER(herramienta2, LocalDate.now().minusDays(5), 4);
		ALQUILER alquiler4 = new ALQUILER(herramienta2, LocalDate.now().minusDays(4), 4);
		ALQUILER alquiler5 = new ALQUILER(herramienta3, LocalDate.now().minusDays(3), 4);
		ALQUILER alquiler6 = new ALQUILER(herramienta3, LocalDate.now().minusDays(1), 4);
		ALQUILER alquiler7 = new ALQUILER(herramienta4, LocalDate.now().minusDays(2), 4);
		ALQUILER alquiler8 = new ALQUILER(herramienta4, LocalDate.now().minusDays(3), 4);
		
		
		System.out.println("Alquileres: ");
		System.out.println("Alquiler 1 - Precio: " + alquiler1.Precio());
		System.out.println("Alquiler 2 - Precio: " + alquiler2.Precio());
		System.out.println("Alquiler 3 - Precio: " + alquiler3.Precio());
		System.out.println("Alquiler 4 - Precio: " + alquiler4.Precio());
		System.out.println("Alquiler 5 - Precio: " + alquiler5.Precio());
		System.out.println("Alquiler 6 - Precio: " + alquiler6.Precio());
		System.out.println("Alquiler 7 - Precio: " + alquiler7.Precio());
		System.out.println("Alquiler 8 - Precio: " + alquiler8.Precio() +'\n');
		
		
		System.out.println("Alquiler 1 - Finalizado: " + alquiler1.terminar());
		System.out.println("Alquiler 1 - enMora: " + alquiler1.enMora());
		
		System.out.println("Alquiler 6 - Finalizado: " + alquiler6.terminar());
		System.out.println("Alquiler 6 - enMora: " + alquiler6.enMora() +'\n');
		
		System.out.println("Alquileres Plus 8 Dias: ");
		alquiler1.devolver(LocalDate.now().plusDays(8));
		alquiler6.devolver(LocalDate.now().plusDays(8));
		
		System.out.println("Alquiler 1 - Precio: " + alquiler1.Precio());
		System.out.println("Alquiler 1 - Finalizado: " + alquiler1.terminar());
		System.out.println("Alquiler 1 - enMora: " + alquiler1.enMora());	
		
		System.out.println("Alquiler 6 - Precio: " + alquiler6.Precio());
		System.out.println("Alquiler 6 - Finalizado: " + alquiler6.terminar());
		System.out.println("Alquiler 6 - enMora: " + alquiler6.enMora());	
		

		//CREANDO TRABAJOS Y TRABAJADOR:
		TRABAJADOR trabajador1 = new TRABAJADOR("ELÍAS", "SUIVA@MAIL.COM", oficio1, 100.0, 150.0);
		TRABAJADOR trabajador2 = new TRABAJADOR("MAXI", "MAXI@MAIL.COM", oficio2, 200.0, 25.0);
		
		TRABAJO trabajo1 = new TRABAJO(servicioEstandar1, LocalDate.now(), true);
		TRABAJO trabajo2 = new TRABAJO(servicioPersonalizado1, LocalDate.now(), true);
		TRABAJO trabajo3 = new TRABAJO(servicioEstandar2, LocalDate.now().plusDays(1), false);
		TRABAJO trabajo4 = new TRABAJO(servicioPersonalizado2, LocalDate.now().plusDays(1), false);
		
		
		System.out.println('\n' + "Trabajadores: ");	
		System.out.println(trabajador1.getNombre() + " Oficio: " + trabajador1.getOficio());	
		System.out.println(trabajador2.getNombre() + " Oficio: " + trabajador2.getOficio());
		
		System.out.println('\n' + "Trabajos Precios: ");	
		System.out.println("Trabajo 1 - Precio " + trabajo1.Precio());
		System.out.println("Trabajo 2 - Precio " + trabajo2.Precio());
		System.out.println("Trabajo 3 - Precio " + trabajo3.Precio());
		System.out.println("Trabajo 4 - Precio " + trabajo4.Precio());
		
		System.out.println('\n' + "Agregar Trabajos: ");	
		try {
			System.out.println("Agregar Trabajo: " + trabajador1.agregarTrabajo(trabajo1));
		} catch (OFICIO_NO_COINCIDENTE_EXCEPTION e) {
			System.out.println(e.getMessage());
		} catch (AGENDA_OCUPADA_EXCEPTION e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Agregar Trabajo: " + trabajador1.agregarTrabajo(trabajo2));
		} catch (OFICIO_NO_COINCIDENTE_EXCEPTION e) {
			System.out.println(e.getMessage());
		} catch (AGENDA_OCUPADA_EXCEPTION e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Agregar Trabajo: " + trabajador1.agregarTrabajo(trabajo3));
		} catch (OFICIO_NO_COINCIDENTE_EXCEPTION e) {
			System.out.println(e.getMessage());
		} catch (AGENDA_OCUPADA_EXCEPTION e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Agregar Trabajo: " + trabajador2.agregarTrabajo(trabajo3));
		} catch (OFICIO_NO_COINCIDENTE_EXCEPTION e) {
			System.out.println(e.getMessage());
		} catch (AGENDA_OCUPADA_EXCEPTION e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Agregar Trabajo: " + trabajador2.agregarTrabajo(trabajo4));
		} catch (OFICIO_NO_COINCIDENTE_EXCEPTION e) {
			System.out.println(e.getMessage());
		} catch (AGENDA_OCUPADA_EXCEPTION e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Agregar Trabajo: " + trabajador2.agregarTrabajo(trabajo1));
		} catch (OFICIO_NO_COINCIDENTE_EXCEPTION e) {
			System.out.println(e.getMessage());
		} catch (AGENDA_OCUPADA_EXCEPTION e) {
			System.out.println(e.getMessage());
		}

		System.out.println('\n' + "Trabajos Terminados: ");	
		System.out.println("Trabajo Terminado: " + trabajo1.finalizado());
		trabajo2.finalizar(LocalDate.now());
		System.out.println("Trabajo terminado: " + trabajo2.finalizado()); 
		
		System.out.println('\n' + "Contratos: ");	
		try {
			System.out.println("Contratar Trabajador: " + usuario1.Contratar(trabajo2)); 
			System.out.println("Alquila: " + usuario1.Contratar(alquiler2)); 
			System.out.println("Alquila: " + usuario1.Contratar(alquiler3)); 
			System.out.println("Alquila: " + usuario1.Contratar(alquiler4)); 
			System.out.println("Alquila: " + usuario1.Contratar(alquiler5)); 	
		} catch (ALQUILER_NO_ENTREGADO_EXCEPTION e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
