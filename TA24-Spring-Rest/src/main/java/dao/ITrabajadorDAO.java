package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long>{
	
	// Listamos trabajadores por el campo nombre
	public List<Trabajador> findByNombre(String nombre);
	
	// Listamos trabajadores por el campo Trabajo
	public List<Trabajador> findByTrabajo(String nombre);
}
