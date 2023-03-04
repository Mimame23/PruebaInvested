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

import Invested.Invested.model.Creditos;
import Invested.Invested.service.CreditosService;

@RestController
@RequestMapping(path="/api/v1/cliente/:idCliente/credito/")
public class CreditosController {
private final CreditosService creditosService;

public CreditosController(CreditosService creditosService) {
	this.creditosService = creditosService;
}//constructor
@GetMapping
public List<Creditos> getAllCreditos() {
return creditosService.getAllCreditos();
}//getallcreditos
@GetMapping(path = "{Id}")
public Creditos getCreditos(@PathVariable("Id") Long id) {
return creditosService.getCreditos(id);
}//getcredito
@DeleteMapping(path = "{Id}")
public Creditos deleteCreditos(@PathVariable("Id") Long id) {
	return creditosService.deleteCreditos(id);
}//deleteCrdito

@PostMapping
public Creditos addCreditos(@RequestBody Creditos creditos) {
	return creditosService.addCreditos(creditos);
}//addCredito
@PutMapping(path= "{Id}")
public Creditos updateProducto(
		@PathVariable("Id")Long id,
		@RequestParam(required = false) String nombre, 
		@RequestParam(required = false) Integer nocontrato, 
		@RequestParam(required = false) String direccion, 
		@RequestParam(required = false)Float monto, 
		@RequestParam(required = false)Integer nocredito, 
		@RequestParam(required = false)String status) {
	return creditosService.updateCreditos(id, nombre, nocontrato,direccion, monto, nocredito, status);
}//updateController
}//classCreditosController