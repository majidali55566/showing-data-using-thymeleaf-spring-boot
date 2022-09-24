package com.majid.SpringPractice.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.majid.SpringPractice.Dish;


@Controller
@RequestMapping("/list")
public class foodController {
	@GetMapping
	public String showFoodList(Model model) {
		List<Dish> dishes=Arrays.asList(
				new Dish("Chicken Karahi","Spicy taste","Pakistan and India"),
				new Dish("Chicken Kormo","Yummy","South Asia"),
				new Dish("Chicken Kabab","Spicy taste","Pakistan,India and Bangladesh"),
				new Dish("Allo Chips","slighly sweet","Pakistan and India")
				);
		model.addAttribute("dishes", dishes);	
		return "Dish-info";
	}
}
