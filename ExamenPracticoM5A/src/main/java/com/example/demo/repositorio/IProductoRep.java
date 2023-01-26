package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Producto;



public interface IProductoRep  extends JpaRepository<Producto, Long>{

}
