package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Trabajador;
import service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;
	
	// Listamos todos los trabajadores
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}
	
	// Listamos trabajadores por el campo nombre
	@GetMapping("/trabajadores/nombre/{nombre}")
	public List<Trabajador> listarTrabajadorNombre(@PathVariable(name = "nombre") String nombre){
		return trabajadorServiceImpl.listarTrabajadorNombre(nombre);
	}
	
	// Listamos trabajadores por TRABAJO
	@GetMapping("/trabajadores/trabajo/{trabajo}")
	public List<Trabajador> listarTrabajadorXTrabajo(@PathVariable(name = "trabajo") String trabajo){
		return trabajadorServiceImpl.listarTrabajadoresXTrabajo(trabajo);
	}
	
	// Posteamos un trabajador
	@PostMapping("/trabajadores")
	public Trabajador guardarTrabajador(@RequestBody Trabajador trabajador) {
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	
	// Listamos trabajadores por ID
	@GetMapping("/trabajadores/{id}")
	public Trabajador trabajadorXId(@PathVariable(name = "id") Long id) {
		Trabajador trabajador_x_id = new Trabajador();
		trabajador_x_id = trabajadorServiceImpl.trabajadorXId(id);
		return trabajador_x_id;
	}
	
	// Actualizamos trabajadores por ID
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name = "id") Long id, @RequestBody Trabajador trabajador) {
		Trabajador trabajador_seleccionado = new Trabajador();
		Trabajador trabajador_actualizado = new Trabajador();
		
		trabajador_seleccionado = trabajadorServiceImpl.trabajadorXId(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setTrabajo(trabajador.getTrabajo());
		trabajador_seleccionado.setSalario(trabajador.getSalario());
		
		trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
		
		return trabajador_actualizado;
	}
	
	// Eliminar trabajador por ID
	@DeleteMapping("/trabajadores/{id}")
	public void eliminarTrabajador(@PathVariable(name = "id") Long id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
	}

}
