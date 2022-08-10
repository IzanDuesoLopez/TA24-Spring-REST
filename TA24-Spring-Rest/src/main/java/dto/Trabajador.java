package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trabajdores")
public class Trabajador {

	// Atributos de la entidad trabajador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Buscamos el ultimo valor y lo incrementamos desde la id final de la db
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private int salario;
	
	// Constructor default
	public Trabajador() {
		
	}

	/**
	 * Constructor con parametros
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Trabajador(Long id, String nombre, String trabajo, int salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	/**
	 * Trabajos predefinidos en enum
	 * @author Izan
	 *
	 */
	public enum Trabajos {
		CAMARERO,
		CAJERO,
		OBRERO,
		DEVELOPER,
		FUTBOLISTA
	}
	
	/**
	 * @return Getter de id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param Setter de ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return Getter de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param Setter de nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Getter de trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param Setter de trabajo
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	/**
	 * @return Getter de Salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param Setter de salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}
}
