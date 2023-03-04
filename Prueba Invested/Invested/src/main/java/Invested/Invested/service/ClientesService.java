package Invested.Invested.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Invested.Invested.model.Clientes;
@Service
public class ClientesService {
	private final ClienteRepository clienteRepository;
	@Autowired
	public ClientesService(ClienteRepository clienteRepository) {
		this.clienteRepository=  clienteRepository;
	}//constructor
	public List<Clientes>getAllClientes(){
		return clienteRepository.findAll();
	}//getAllClientes
	public Clientes getClientes(Long id) {
		return clienteRepository.findById(id).orElseThrow(
				()->new IllegalAccessError("El cliente con el id" + id +"no existe.")
				);			
	}//getCliente
	public Clientes deleteClientes(Long id) {
		Clientes tmp =null;
		if (clienteRepository.existsById(id)) {
			tmp=clienteRepository.findById(id).get();
			clienteRepository.deleteById(id);
		}//if
		return tmp;
	}//deleteCliente
	public Clientes addClientes(Clientes clientes ) {
		return clienteRepository.save(clientes);
	}//addCliente
	public Clientes updateClientes(Long id, String nombre, Float monto, Integer nocredito, String status) {
		Clientes tmp=null;
		if(clienteRepository.existsById(id)) {
			tmp=clienteRepository.findById(id).get();
			if(nombre != null)tmp.setnombre(nombre);
			if(monto != null)tmp.setmonto(monto.floatValue());
			if(nocredito != null)tmp.setnocredito(nocredito.intValue());
			if(status != null)tmp.setstatus(status);
			clienteRepository.save(tmp);
		}else {
			System.out.println("Update - del cliente con el id" + id +"no se ha actualizado");
		}//else
		return tmp;
	}//updateClientes

}//classClientesService
