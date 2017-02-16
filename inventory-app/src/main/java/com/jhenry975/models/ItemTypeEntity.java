package com.jhenry975.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ItemTypeEntity {

	@Column(name="item-code")
	private Long itemTypeCode;
	
	@Column
	private String description;

	public Long getItemTypeCode() {
		return itemTypeCode;
	}
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="itemType")
	private Set<ItemEntity> items;

	public void setItemTypeCode(Long itemTypeCode) {
		this.itemTypeCode = itemTypeCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<ItemEntity> getItems() {
		return items;
	}

	public void setItems(Set<ItemEntity> items) {
		this.items = items;
	}
	
	
}
