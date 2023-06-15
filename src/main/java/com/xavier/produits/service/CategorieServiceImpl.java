package com.xavier.produits.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xavier.produits.entities.Categorie;
import com.xavier.produits.repos.CategorieRepository;

public class CategorieServiceImpl implements CategorieService{
	
	@Autowired
	CategorieRepository categorieRepository;

	@Override
	public Categorie saveCategorie(Categorie c) {
		return categorieRepository.save(c);
	}

}
