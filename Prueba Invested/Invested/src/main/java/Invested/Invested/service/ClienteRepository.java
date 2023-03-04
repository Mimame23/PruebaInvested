package Invested.Invested.service;

import org.springframework.data.jpa.repository.JpaRepository;

import Invested.Invested.model.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Long>{

}
