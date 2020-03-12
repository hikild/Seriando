package domain.entity;

import java.util.Date;

import domain.entity.enumeration.ProductType;

public class Movie extends Product {

	private double duration;

	public Movie(Integer id, String title, Date releaseYear, String photo, String director, ProductType type,
			double duration) {
		super(id, title, releaseYear, photo, director, type);
		this.duration = duration;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public void setType(ProductType type) {
		type = ProductType.MOVIE;

	}

}
