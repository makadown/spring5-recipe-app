package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.RecipeService;


@Controller
public class IndexController {
	
	@Autowired
	private RecipeService recipeService;



    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        //log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}