package domain.entity;

import java.util.Date;

import domain.entity.enumeration.Gender;
import domain.entity.enumeration.ProfileType;

public abstract class Profile {

	private Integer id;
	private String name;
	private String lastName;
	private Date birthday;
	private String photo;
	private ProfileType profileType;
	private Gender gender;

	public Profile() {

	}

	public Profile(Integer id, String name, String lastName, Date birthday, String photo, ProfileType profileType,
			Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
		this.photo = photo;
		this.profileType = profileType;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public ProfileType getUserType() {
		return profileType;
	}

	public abstract void setUserType(ProfileType type);

}
