package com.xavier.produits;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xavier.produits.entities.Categorie;
import com.xavier.produits.repos.CategorieRepository;

@SpringBootTest
public class CategorieApplicationTests {
	
	@Autowired
	CategorieRepository categorieRepository;
	
	@Test
	public void testCreateCategorie() {
		Categorie categorie = new Categorie();
		categorie.setNomCat("HP");
		categorie.setDescriptionCat("PC HP Portable");
		categorieRepository.save(categorie);
	}

}
