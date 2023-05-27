package com.xavier.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xavier.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	List<Produit> findByNomProduit(String nomProduit);
	List<Produit> findByNomProduitContains(String nomProduit);
	
	@Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Produit> findByNomPrix (@Param("nom") String nom, @Param("prix")Double prix);
}
