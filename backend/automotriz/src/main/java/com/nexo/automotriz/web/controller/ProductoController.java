package com.nexo.automotriz.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexo.automotriz.bussines.service.ProductoService;
import com.nexo.automotriz.model.entity.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/all")
	private ResponseEntity<List<Producto>> getAll(){
		return new ResponseEntity<List<Producto>>(productoService.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	private ResponseEntity<Producto> save(@RequestBody Producto producto){
		return new ResponseEntity<Producto>(productoService.save(producto), HttpStatus.ACCEPTED);
	}
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/{id}")
	private ResponseEntity delete(@PathVariable Long id) {
		productoService.delete(id);
		return new ResponseEntity( HttpStatus.OK);
	}

}
