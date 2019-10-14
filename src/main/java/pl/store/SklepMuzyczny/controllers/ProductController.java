package pl.store.SklepMuzyczny.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.store.SklepMuzyczny.models.Product;
import pl.store.SklepMuzyczny.services.ProductService;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/product/{id}")
    public String getProductById(@PathVariable Long id, Model model){
        Product p = productService.getProductById(id);
        model.addAttribute("id",id);
        return "product";
    }
}
