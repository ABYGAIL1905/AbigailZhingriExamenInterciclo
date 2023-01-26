package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Producto;



public interface IProductoService {
public List<Producto>findAll();
	
	public Producto findById(Long id);
		
	public Producto save(Producto producto);

	public void delete(Long id);


}
