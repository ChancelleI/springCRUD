package com.example.webapp.model;

import lombok.Data;

@Data /**cette annoation permet de généré automatiquement les getter et les setters**/
  
public class Employee {
	private Integer id;
	private String firtsName;
	private String lastName;
	private String mail;
	private String password;

}
