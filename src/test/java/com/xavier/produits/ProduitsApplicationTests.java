package com.xavier.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xavier.produits.repos.ProduitRepository;
import com.xavier.produits.entities.Produit;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("Pack format A4",1200.500, new Date());
		produitRepository.save(prod);
	}
	
	@Test
	public void testFindAllProduits() {
		List<Produit> produits = produitRepository.findAll();
		for(Produit p : produits)
			System.out.println(p);
	}
	
	@Test
	public void testFindProduit() {
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}
	
	@Test
	public void testFindByNomProduit() {
		List<Produit> produits = produitRepository.findByNomProduit("PC Dell");
		for(Produit p : produits)
			System.out.println(p);
	}
	
	@Test
	public void testFindByNomProduitContains() {
		List<Produit> produits = produitRepository.findByNomProduitContains("P");
		for(Produit p : produits)
			System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(2000.00);
		produitRepository.save(p);
		System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	}

}
