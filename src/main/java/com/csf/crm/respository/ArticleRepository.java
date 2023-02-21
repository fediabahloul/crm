package com.csf.crm.respository;

import org.springframework.data.repository.CrudRepository;

import com.csf.crm.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> 
{  
	
}
