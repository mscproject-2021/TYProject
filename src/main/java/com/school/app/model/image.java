package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name="native",strategy = "native")
	@Column(updatable = false,length = 5)
	private int imageId;
	
	@Size(max = 255)
	@Column(length = 255)
	private String imagePath;
	
	@NotNull
	@Size(max = 30)
	@Column(length = 30,nullable = false)
	private String imageName;

	public image() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public image(int imageId, @Size(max = 255) String imagePath, @NotNull @Size(max = 30) String imageName) {
		super();
		this.imageId = imageId;
		this.imagePath = imagePath;
		this.imageName = imageName;
	}


	
	public int getImageId() {
		return imageId;
	}


	public void setImageId(int imageId) {
		this.imageId = imageId;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	@Override
	public String toString() {
		return "image [imageId=" + imageId + ", imagePath=" + imagePath + ", imageName=" + imageName + "]";
	}
	
	
}
