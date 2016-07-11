package model;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(exclude = "id")
public class User {

	@Getter	@Setter
	private int id;

	@Getter	@Setter
	private String name;

	@Getter	@Setter
	private String login;

	@Getter	@Setter
	private String password;

	@Getter	@Setter
	private Date registerDate;

}
