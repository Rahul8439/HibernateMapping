package oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class User {
	public User(int user_id, String name, Aadhar aadhar, PanCard pan) {
		this.user_id = user_id;
		this.name = name;
		this.aadhar = aadhar;
		this.pan = pan;
	}

	@Id
	int user_id;
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	public PanCard getPan() {
		return pan;
	}

	public void setPan(PanCard pan) {
		this.pan = pan;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Column(name="user_name")
	String name;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "aadhar_card")
	Aadhar aadhar;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name="pan_card")
	PanCard pan;
	
	@OneToMany(mappedBy="user", cascade = {CascadeType.ALL})
	List<Role> roleList;
}
