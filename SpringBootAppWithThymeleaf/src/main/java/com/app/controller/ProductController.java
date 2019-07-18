package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Product;
import com.app.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private IProductService service;
	
	@RequestMapping("/reg")
	public String showRegPage(Model map) {
		map.addAttribute("product", new Product());
		return "RegisterPage";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveProduct(@ModelAttribute Product product,Model map) {
		Integer id=service.saveProduct(product);
		map.addAttribute("message", "Product saved with '"+id+"' successfully");
		map.addAttribute("product", new Product());
		return "RegisterPage";
	}
}