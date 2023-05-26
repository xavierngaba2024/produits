package com.xavier.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	List<Produit> findByNomProduit(String nomProduit);
	List<Produit> findByNomProduitContains(String nomProduit);
}
