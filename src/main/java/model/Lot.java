package model;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(exclude = "id")
public class Lot {

	@Getter	@Setter
	private int id;

	@Getter	@Setter
	private String name;

	@Getter	@Setter
	private String description;

	@Getter	@Setter
	private int creatorId;

	@Getter	@Setter
	private int currentOwnerId;

	@Getter	@Setter
	private double startPrice;

	@Getter	@Setter
	private double currentPrice;

	@Getter	@Setter
	private Date endDate;
	
	@Getter	@Setter
	private LotStatus status;

}
