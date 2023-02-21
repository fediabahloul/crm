package com.csf.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity  

@Table 
public class Client {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String nom; 
	@Column  
	private String prenom; 
	@Column  
	private String Adresse; 
	@Column  
	private String Phone;
	@Column  
	private String Email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom = nom;
	}
	public String getprenom() {
		return nom;
	}
	public void setprenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String Adresse) {
		this.Adresse = Adresse;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", Adresse=" + Adresse + "Phone" + Phone + "Email" + Email + "]";
	}  
		

}
