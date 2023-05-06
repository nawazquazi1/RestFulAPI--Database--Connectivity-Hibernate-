package org.studyeasy.showroom.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name="brands")
@Table(name="brands")
public class BrandEntity {
	@Id
	@Column(name="brandId")
	int brandId;
	
	@Column(name="brandName")
	String BrandName;
	
	public BrandEntity() {
		
	}

	public BrandEntity(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		BrandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	
}
