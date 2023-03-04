package Invested.Invested.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable =false)
	private Long id;
	@Column(nullable =false)
	private String nombre;
	@Column(nullable = false)
	private Float monto;
	@Column(nullable = false)
	private Integer nocredito;
	@Column(nullable = false)
	private String status;
	
	public Clientes(Long id, String nombre, Float monto, Integer nocredito, String status) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.monto = monto;
		this.nocredito = nocredito;
		this.status = status;
	}//constructorconcampos

	public Clientes() {
		
	}//constructor vacio

	public String getnombre() {
		return nombre;
	}//getnombre

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}//setnombre

	public Float getmonto() {
		return monto;
	}//getmonto

	public void setmonto(Float monto) {
		this.monto = monto;
	}//setmonto

	public Integer getnocredito() {
		return nocredito;
	}//getnocredito

	public void setnocredito(Integer nocredito) {
		this.nocredito = nocredito;
	}//setnocredito

	public String getstatus() {
		return status;
	}//getstatus

	public void setstatus(String status) {
		this.status = status;
	}//setstatus

	public Long getid() {
		return id;
	}//getid

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", monto=" + monto + ", nocredito=" + nocredito
				+ ", status=" + status + "]";
	}//toString

}//classClintes
