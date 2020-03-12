package domain.entity;

import java.util.List;

import domain.entity.enumeration.ProfileType;

public class Administrator extends Profile {

	  private List<User> usersList;
	 
	@Override
	public void setUserType(ProfileType type) {
		
		type = ProfileType.ADMINISTRATOR;
		
	}

}
