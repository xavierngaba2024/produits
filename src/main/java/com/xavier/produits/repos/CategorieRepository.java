/**
 * 
 */
package com.xavier.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.produits.entities.Categorie;

/**
 * @author xavier_ng
 *
 */
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
