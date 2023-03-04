package Invested.Invested.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="creditos")
public class Creditos {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name="id",unique=true,nullable =false)
private Long id;
@Column(nullable = false)
private String nombre;
@Column(nullable = false)
private Integer nocontrato;
@Column(nullable = false)
private String direccion;
@Column(nullable = false)
private Float monto;
@Column(nullable = false)
private Integer nocredito;
@Column(nullable = false)
private String status;

public Creditos(Long id, String nombre, Integer nocontrato, String direccion, Float monto, Integer nocredito,
		String status) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.nocontrato = nocontrato;
	this.direccion = direccion;
	this.monto = monto;
	this.nocredito = nocredito;
	this.status = status;
}//constructorcampos
public Creditos() {
	
}//constructorvacio

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getNocontrato() {
	return nocontrato;
}
public void setNocontrato(Integer nocontrato) {
	this.nocontrato = nocontrato;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public Float getMonto() {
	return monto;
}
public void setMonto(Float monto) {
	this.monto = monto;
}
public Integer getNocredito() {
	return nocredito;
}
public void setNocredito(Integer nocredito) {
	this.nocredito = nocredito;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Long getId() {
	return id;
}
@Override
public String toString() {
	return "Creditos [id=" + id + ", nombre=" + nombre + ", nocontrato=" + nocontrato + ", direccion=" + direccion
			+ ", monto=" + monto + ", nocredito=" + nocredito + ", status=" + status + "]";
}//tostring


}//classCreditos
