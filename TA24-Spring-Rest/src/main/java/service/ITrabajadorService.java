package service;

import java.util.List;

import dto.Trabajador;

public interface ITrabajadorService {

	// Métodos del CRUD para Trabajador
	public List<Trabajador> listarTrabajadores(); // Mostramos todos los trabadores
	
	public Trabajador guardarTrabajador(Trabajador trabajador); // Guardamos un trabajador CREATE
	
	public Trabajador trabajadorXId(Long id); // Datos de un trabajador a partir de ID
	
	public List<Trabajador> listarTrabajadorNombre(String nombre); // Listamos trabajadores por nombre
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); // Actualizamos trabajador UPDATE
	
	public void eliminarTrabajador(Long id); // Eliminamos trabajador por ID DELETE
	
	public List<Trabajador> listarTrabajadoresXTrabajo(String nombre); // Listamos trabajadores por TRABAJO
}
