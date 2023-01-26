package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.IProductoRep;


@Service
public class ProductoImpService implements IProductoService{

	@Autowired
	private IProductoRep prorep;
	
	@Override
	@Transactional(readOnly=true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) prorep.findAll();
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return prorep.findById(id).orElse(null);
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return prorep.save(producto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		prorep.deleteById(id);
		
	}
	

}
