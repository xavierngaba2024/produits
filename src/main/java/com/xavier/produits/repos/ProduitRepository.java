package com.xavier.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
