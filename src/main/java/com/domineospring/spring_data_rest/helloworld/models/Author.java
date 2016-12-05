package com.domineospring.spring_data_rest.helloworld.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	private String name;
	
}
