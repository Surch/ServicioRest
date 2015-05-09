package com.proyecto.seguridad;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/**
	 * Responde a la URL "/persona" gracias al RequestMapping.
	 * Requiere de un parametro llamado "id", podr�a ser obcional pero as� es m�s sencillo.
	 * En vez de devolver un String como el nombre de la vista home.jsp va a devolver un objeto del tipo Persona.
	 * La etiqueta @ResponseBody le dice a Spring Framework que convierta en objeto una respuesta http.
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/persona", method = RequestMethod.GET)
	public @ResponseBody Persona obtenerPersona(@RequestParam(value="id", required=true) int id){
		//Logica para obtener los datos de la persona
		Persona p = new Persona();
		p.setNombre("Sergio");
		p.setApellido("Romero");
		p.setEdad(20);
		return p;
	}
}
