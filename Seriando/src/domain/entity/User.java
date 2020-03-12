package domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.entity.enumeration.Gender;
import domain.entity.enumeration.ProfileType;

public class User extends Profile {

	private List<Movie> favoritesMovies;
	private List<Series> favoritesSeries;
	private String cpf;

	public User() {
		super();
		favoritesMovies = new ArrayList<Movie>();
		favoritesSeries = new ArrayList<Series>();
	}

	public User(Integer id, String name, String lastName, Date birthday, String photo, ProfileType profileType,
			Gender gender, String cpf) {
		super(id, name, lastName, birthday, photo, profileType, gender);
		this.cpf = cpf;
	}

	@Override
	public void setUserType(ProfileType type) {
		type = ProfileType.COMUM;
	}

}
