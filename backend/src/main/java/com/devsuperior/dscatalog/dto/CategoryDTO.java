package com.devsuperior.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID=1L;
	
	private Long id;
	private String name;
	public Instant created;
	
	public CategoryDTO () {
		
	}

	public CategoryDTO(Long id, String name, Instant created) {
		this.id = id;
		this.name = name;
		this.created = created;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.created = entity.getCreatedAt();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}
	
}
