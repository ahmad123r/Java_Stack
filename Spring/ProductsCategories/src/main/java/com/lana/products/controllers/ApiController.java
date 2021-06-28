package com.lana.products.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lana.products.models.Category;
import com.lana.products.models.CategoryProduct;
import com.lana.products.models.Product;
import com.lana.products.services.ProductServ;

@Controller
public class ApiController {
	private final ProductServ productServ;

	public ApiController(ProductServ productServ) {
		this.productServ = productServ;
	}

	@RequestMapping("/")
	public String back() {
		return "redirect:/product/new";
	}

	@RequestMapping("/product/new")
	public String product(@ModelAttribute("product") Product product) {
		return "product.jsp";
	}

	@PostMapping("/product/create")
	public String productCreate(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "product.jsp";
		} else

			productServ.createProduct(product);
		return "redirect:/products/" + product.getId();
	}

	@RequestMapping("/products/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id,
			@ModelAttribute("relation") CategoryProduct relation) {
		model.addAttribute("product", productServ.findProduct(id));
		model.addAttribute("categories", productServ.categoriesNotContainigPro(productServ.findProduct(id)));
		return "showProduct.jsp";
	}

	////////////////////////////////////////////////////
	@RequestMapping("/category/new")
	public String category(@ModelAttribute("category") Category category) {
		return "category.jsp";
	}

	@PostMapping("category/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "category.jsp";
		} else
			productServ.createCategory(category);
		return "redirect:/categories/" + category.getId();
	}

	@RequestMapping("/categories/{id}")
	public String showCategories(Model model, @PathVariable("id") Long id,
			@ModelAttribute("relation") CategoryProduct relation) {
		model.addAttribute("category", productServ.findCategory(id));
		model.addAttribute("products", productServ.productsNotContainigCat(productServ.findCategory(id)));

		return "showCategory.jsp";
	}

	@PostMapping("/product/addCategory")
	public String productAddCategory(@Valid @ModelAttribute("relation") CategoryProduct relation,
			BindingResult result) {
		if (result.hasErrors()) {
			return "showProduct.jsp";
		}

		productServ.createRelation(relation);
		return "redirect:/products/" + relation.getProduct().getId();

	}
	@PostMapping("/category/addProduct")
	public String categoryAddProduct(@Valid @ModelAttribute("relation") CategoryProduct relation,
			BindingResult result) {
		if (result.hasErrors()) {
			return "showProduct.jsp";
		}

		productServ.createRelation(relation);
		return "redirect:/categories/" + relation.getCategory().getId();

	}

}
