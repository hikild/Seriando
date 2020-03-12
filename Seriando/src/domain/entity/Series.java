package domain.entity;

import java.util.Date;

import domain.entity.enumeration.ProductType;

public class Series extends Product {

	private int episodes;
	private int seasons;

	public Series(Integer id, String title, Date releaseYear, String photo, String director, ProductType type,
			int episodes, int seasons) {
		super(id, title, releaseYear, photo, director, type);
		this.episodes = episodes;
		this.seasons = seasons;

	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	@Override
	public void setType(ProductType type) {
		// TODO Auto-generated method stub
		type = ProductType.SERIES;
	}

}
