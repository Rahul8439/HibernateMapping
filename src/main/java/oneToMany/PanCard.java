package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pan_Card")
public class PanCard {
	@Id
	int id;

	public PanCard() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOnPanCard() {
		return nameOnPanCard;
	}

	public void setNameOnPanCard(String nameOnPanCard) {
		this.nameOnPanCard = nameOnPanCard;
	}

	public PanCard(int id, String nameOnPanCard) {
		this.id = id;
		this.nameOnPanCard = nameOnPanCard;
	}

	@Column(name = "name_on_pan_card")
	String nameOnPanCard;
}
