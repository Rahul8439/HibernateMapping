package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aadhar_Card")
public class Aadhar {
	@Id
	int aadhar_id;

	public int getAadhar_id() {
		return aadhar_id;
	}

	public Aadhar() {
		// TODO Auto-generated constructor stub
	}

	public Aadhar(int aadhar_id, String name, String address) {
		this.aadhar_id = aadhar_id;
		this.name = name;
		this.address = address;
	}

	public void setAadhar_id(int aadhar_id) {
		this.aadhar_id = aadhar_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column
	String name;

	@Column
	String address;

}
