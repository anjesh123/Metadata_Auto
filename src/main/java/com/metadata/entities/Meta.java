package com.metadata.entities;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Meta {
	@Id
	private String id;
	private String name;
	
	public Meta(String name) {
		this.id=UUID.randomUUID().toString();
		this.name = name;
	}
	
	public Meta() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
			this.id = id;
	}
	@Override
	public String toString() {
		return "Meta [id=" + id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
