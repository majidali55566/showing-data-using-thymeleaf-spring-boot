package com.majid.SpringPractice.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class RegisterBrand {
	@RequestMapping("/registerBrand")
	public String registerBrand(Model model,@RequestParam(name="productName") String productName
			,@RequestParam(name="brandName") String brandName,@RequestParam(name="productType") String producttype) {
		String name=productName+"";
		String brand=brandName+"";
		String productType=producttype+"";
		
		model.addAttribute("product",(new Product(name,productType,brand)));	
		return "productDetails";
	}
}
