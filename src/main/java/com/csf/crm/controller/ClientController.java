package com.csf.crm.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csf.crm.model.Client;

import com.csf.crm.service.ClientService;
@RestController
@CrossOrigin(origins = "*")

public class ClientController {

	//Attire the ArticlesService class  
	@Autowired  
	ClientService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Client")
	
	private List<Client> getAllClients()   
	{  
		return cs.getAllClients();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Client/{id}")  
	private Client getClients(@PathVariable("id") int id)   
	{  
		return cs.getClientsById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Client/{Clientid}")  
	private void deleteClient(@PathVariable("Clientid") int Clientid)   
	{  
		cs.delete(Clientid);  
	} 

	@PostMapping("/Client")  
	private int saveClient(@RequestBody Client c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Client")  
	private Client update(@RequestBody  Client c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}
