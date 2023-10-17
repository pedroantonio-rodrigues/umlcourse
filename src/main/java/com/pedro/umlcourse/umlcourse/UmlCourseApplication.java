package com.pedro.umlcourse.umlcourse;

import java.util.Arrays;

import com.pedro.umlcourse.umlcourse.domain.City;
import com.pedro.umlcourse.umlcourse.domain.State;
import com.pedro.umlcourse.umlcourse.repositories.CitiesRepository;
import com.pedro.umlcourse.umlcourse.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedro.umlcourse.umlcourse.domain.Category;
import com.pedro.umlcourse.umlcourse.domain.Product;
import com.pedro.umlcourse.umlcourse.repositories.CategoryRepository;
import com.pedro.umlcourse.umlcourse.repositories.ProductRepository;

@SpringBootApplication
public class UmlCourseApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CitiesRepository citiesRepository;

	public static void main(String[] args) {
		SpringApplication.run(UmlCourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Informatica");
		Category cat2 = new Category(null, "Escritorio");

		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 60.00);

		cat1.getProducts().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProducts().addAll(Arrays.asList(p2));

		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1,cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));

		State sta1 = new State(null, "minas gerais");
		State sta2 = new State(null, "São Paulo");

		City ct1 = new City(null, "Uberlandia", sta1);
		City ct2 = new City(null, "São Paulo",sta2);
		City ct3 = new City(null, "Campinas", sta2);

		sta1.getCities().addAll(Arrays.asList(ct1));
		sta2.getCities().addAll(Arrays.asList(ct2,ct3));


		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1,p2,p3));

		stateRepository.saveAll(Arrays.asList(sta1,sta2));
		citiesRepository.saveAll(Arrays.asList(ct1,ct2,ct3));

	}
	
}
