package com.pedro.umlcourse.umlcourse;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedro.umlcourse.umlcourse.domain.Category;
import com.pedro.umlcourse.umlcourse.domain.Product;
import com.pedro.umlcourse.umlcourse.repositories.CategoryRepository;
import com.pedro.umlcourse.umlcourse.repositories.ProductRepository;

@SpringBootApplication
public class UmlcourseApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(UmlcourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(1, "Informatica");
		Category cat2 = new Category(2, "Escritorio");

		Product p1 = new Product(1, "Computador", 2000.00);
		Product p2 = new Product(2, "Impressora", 800.00);
		Product p3 = new Product(3, "Mouse", 60.00);

		cat1.getProducts().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProducts().addAll(Arrays.asList(p2));

		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1,cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));



		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
	}
	
}
