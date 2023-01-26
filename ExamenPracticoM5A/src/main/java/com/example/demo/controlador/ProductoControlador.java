package com.example.demo.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.modelo.Producto;
import com.example.demo.service.IProductoService;



@CrossOrigin (origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class ProductoControlador {
	
	
	 
	@Autowired
	private IProductoService IPro;
	
	@GetMapping("/producto")
	public List<Producto>index(){
		return IPro.findAll();
	}
	
	//Bucar Proucto por id
	@GetMapping("/producto/{id}")
	public Producto show(@PathVariable Long id) {
		return IPro.findById(id);
	}

	//Guardar Producto
	@PostMapping("/producto")
	@ResponseStatus(HttpStatus.CREATED)
	public   Producto create (@Valid @RequestBody Producto producto ) {
		//BindingResult result
	
		//if (result.hasErrors()) {			
	       
	    //}
		 return IPro.save(producto);

	}

	

	

	//eliminar 

	@DeleteMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		IPro.delete(id);
	}


		

	
	@PutMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto productoactual = IPro.findById(id);
		productoactual.setDescripcion(producto.getDescripcion());
		productoactual.setPrecio(producto.getPrecio());
	    productoactual.setCantidad(producto.getCantidad());
		return IPro.save(productoactual);
	}


}
