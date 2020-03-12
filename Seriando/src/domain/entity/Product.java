package domain.entity;

import java.util.Date;

import domain.entity.enumeration.ProductType;
import domain.entity.enumeration.ProfileType;

public abstract class Product {

	private Integer id;
	private String title;
	private Date releaseYear;
	private String photo;
	private String director;
	private ProductType type;

	public Product(Integer id, String title, Date releaseYear, String photo, String director, ProductType type) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.photo = photo;
		this.director = director;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public ProductType getType() {
		return type;
	}

	public abstract void setType(ProductType type);
}
