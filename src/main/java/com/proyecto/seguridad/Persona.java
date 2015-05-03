package com.proyecto.seguridad;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	/**
	 * Constructor sin parametros de la clase Persona
	 */
	public Persona(){}

	/**
	 * Constructor por parametros de la clase Persona
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/**
	 * Método get del atributo nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set del atributo nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método get del atributo apellido
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Método set del atributo apellido
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Método get del atributo edad
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método set del atributo ewdad
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
