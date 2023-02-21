package com.csf.crm.respository;

import org.springframework.data.repository.CrudRepository;

import com.csf.crm.model.Client;


public interface ClientRepository extends CrudRepository<Client, Integer> 
{  
	
}

