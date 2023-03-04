package Invested.Invested.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Invested.Invested.model.Clientes;
import Invested.Invested.service.ClientesService;

@RestController
@RequestMapping(path="/api/v1/cliente/")
public class ClientesController {
private final ClientesService clientesService;
public ClientesController (ClientesService clientesService) {
	this.clientesService = clientesService;
}//constructor
@GetMapping
public List<Clientes>getAllClientes(){
	return clientesService.getAllClientes();
}//getallclientes
@GetMapping(path= "{Id}")
public Clientes getProducto(@PathVariable("Id")Long id) {
	return clientesService.getClientes(id);
}//getProducto
@DeleteMapping(path="{Id}")
public Clientes deleteClientes(@PathVariable("Id")Long id) {
	return clientesService.deleteClientes(id);
}//deleteclientes
@PostMapping
public Clientes addClientes(@RequestBody Clientes clientes) {
	return clientesService.addClientes(clientes);	
}//addclientes
@PutMapping(path= "{Id}")
public Clientes updateProducto(
		@PathVariable("Id")Long id,
		@RequestParam(required = false) String nombre, 
		@RequestParam(required = false)Float monto, 
		@RequestParam(required = false)Integer nocredito, 
		@RequestParam(required = false)String status) {
	return clientesService.updateClientes(id, nombre, monto, nocredito, status);
}//updatecliente
}//classClientesController
