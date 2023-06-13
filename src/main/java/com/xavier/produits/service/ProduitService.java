package com.xavier.produits.service;

import java.util.List;


import com.xavier.produits.entities.Categorie;
import com.xavier.produits.entities.Produit;

public interface ProduitService {

	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	List<Produit> findByNomProduit(String nomProduit);
	List<Produit> findByNomProduitContains(String nomProduit);
	List<Produit> findByNomPrix(String nom,Double prix);
	List<Produit> findByCategorie (Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();
}
