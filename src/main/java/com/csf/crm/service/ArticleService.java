package com.csf.crm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.crm.model.Article;
import com.csf.crm.respository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired  
	ArticleRepository articleRepository;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Article> getAllArticles()   
	{
		List<Article> articles = new ArrayList<Article>();  
	  articleRepository.findAll().forEach(a -> articles.add(a));  
		return articles;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Article getArticlesById(int id)   
	{  
		return articleRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Article a)   
	{  
		articleRepository.save(a);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		articleRepository.deleteById(id);  
	} 
  
}
