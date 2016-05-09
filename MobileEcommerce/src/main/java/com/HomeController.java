package com;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private ProductService obj_PrdSrvImpl;
	
	@RequestMapping("/")
	public ModelAndView Welcome()
	{
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/ProductAdd", method = RequestMethod.GET)
	public ModelAndView Product_Add()
	{
		Product prd = new Product();
		ModelAndView obj = new ModelAndView("ProductAdd");
		obj.addObject(prd);
		return obj;
	}
	
	@ModelAttribute("save_Product")
	public Product constructProduct(){
		return new Product();
	}
	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("save_Product") Product product) {
		obj_PrdSrvImpl.insertRow(product);
		return "ProductLists";
	}
	
	@ModelAttribute("save_edit_Product")
	public Product constructEditProduct(){
		return new Product();
	}
	
	@RequestMapping(value = "/delProduct", method = RequestMethod.GET)
	public ModelAndView delProduct(@RequestParam("id") int id) {
		System.out.println(id);
		obj_PrdSrvImpl.deleteRow(id);
		return new ModelAndView("showProduct");
	}
	
	@RequestMapping(value = "/saveEditProduct", method = RequestMethod.POST)
	public ModelAndView editProduct(@ModelAttribute("save_edit_Product") Product product) {
		obj_PrdSrvImpl.updateRow(product);
		
		List<Product> lsts = obj_PrdSrvImpl.getList();
		
		return new ModelAndView("ProductLists","prdList", lsts);
	}
	
	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public ModelAndView editProduct(@RequestParam("id") int id) {
		Product prd = obj_PrdSrvImpl.getRowById(id);
		return new ModelAndView("showeEditProduct", "prdList", prd);
	}
	
	@RequestMapping(value = "/ProductLists", method = RequestMethod.GET)
	public ModelAndView Product_List(Map<String, Object> model)
	{
		List<Product> lsts = obj_PrdSrvImpl.getList();
		return new ModelAndView("ProductLists","prdList", lsts);
	}
	
	
}
