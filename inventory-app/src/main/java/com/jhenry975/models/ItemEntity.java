package com.jhenry975.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemEntity {
	
	@Column(name="item-code")
	private Long itemTypeCode;
	
	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name="item-type-code")
	private ItemTypeEntity itemType;

	public Long getItemTypeCode() {
		return itemTypeCode;
	}

	public void setItemTypeCode(Long itemTypeCode) {
		this.itemTypeCode = itemTypeCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ItemTypeEntity getItemType() {
		return itemType;
	}

	public void setItemType(ItemTypeEntity itemType) {
		this.itemType = itemType;
	}

}
