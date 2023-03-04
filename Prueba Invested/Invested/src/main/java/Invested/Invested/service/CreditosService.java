package Invested.Invested.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Invested.Invested.model.Creditos;

@Service
public class CreditosService {
	private final CreditosRepository creditoRepository;
	
	@Autowired
	public CreditosService(CreditosRepository creditoRepository) {
		this.creditoRepository = creditoRepository;
	}//constructor
	
	public List<Creditos> getAllCreditos() {
		return creditoRepository.findAll();
	}//getAllCredito
	
	public Creditos getCreditos(Long id) {
		return creditoRepository.findById(id).orElseThrow(
				()->new IllegalAccessError("El crédito con el id" + id +"no existe.")
				);			
	}//getCredito
	public Creditos deleteCreditos(Long id) {
		Creditos tmp =null;
		if (creditoRepository.existsById(id)) {
			tmp=creditoRepository.findById(id).get();
			creditoRepository.deleteById(id);
		}//if
		return tmp;
	}//deleteCredito
	
	public Creditos addCreditos(Creditos creditos ) {
		return creditoRepository.save(creditos);
	}//addCredito
	
	public Creditos updateCreditos(Long id, String nombre,Integer nocontrato,String direccion,Float monto, Integer nocredito, String status) {
		Creditos tmp=null;
		if(creditoRepository.existsById(id)) {
			tmp=creditoRepository.findById(id).get();
			if(nombre != null)tmp.setNombre(nombre);
			if(nocontrato != null)tmp.setNocontrato(nocontrato.intValue());
			if(direccion != null)tmp.setDireccion(direccion);
			if(monto != null)tmp.setMonto(monto.floatValue());
			if(nocredito != null)tmp.setNocredito(nocredito.intValue());
			if(status != null)tmp.setStatus(status);
			creditoRepository.save(tmp);
		}else {
			System.out.println("Update - del credito con el id" + id +"no se ha actualizado");
		}//else
		return tmp;
	}//up

}//classCreditosService
