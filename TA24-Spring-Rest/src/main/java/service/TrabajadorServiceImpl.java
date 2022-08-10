package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ITrabajadorDAO;
import dto.Trabajador;

@Service
public class TrabajadorServiceImpl implements ITrabajadorService{
	
	// Utilizamos los metodos de la interface ITrabajadorDAO, es como si instaciaramos.
	@Autowired
	ITrabajadorDAO iTrabajadorDAO;

	@Override
	public List<Trabajador> listarTrabajadores() {


		return iTrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {

		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador clienteXId(Long id) {

		return iTrabajadorDAO.findById(id).get();
	}

	@Override
	public List<Trabajador> listarTrabajadorNombre(String nombre) {
		
		return iTrabajadorDAO.findByNombre(nombre);
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {

		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(Long id) {
		
		iTrabajadorDAO.deleteById(id);
		System.out.println("Trabajador con id " + id + " eliminado.");
	}

}
