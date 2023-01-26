package com.example.demo.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "producto")
public class Producto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="codigo_producto")
	private Long codigo_producto;
	
	@Size(min = 3, max = 100, message="Maximo son 100 caracteres y minimo 3 caracteres")
	@Column (name="descripcion")
	private String descripcion;
	 @Min(value = 1, message = "El precio mínimo es 1")
	@Column (name="precio")
    private double precio;
	
	 @Min(value = 1, message = "El valor mínimo es 1")
	@Column (name="cantidad")
	private int cantidad;
	
	

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(Long codigo_producto, String descripcion, double precio, int cantidad) {
		super();
		this.codigo_producto = codigo_producto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Long getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
