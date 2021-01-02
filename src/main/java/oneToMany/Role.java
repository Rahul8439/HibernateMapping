package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Role")
public class Role {
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Id
	int role_id;
	
	public User getUser() {
		return user;
	}

	public Role(int role_id, String name) {
		this.role_id = role_id;
		this.name = name;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDefault_role() {
		return default_role;
	}

	public void setDefault_role(Boolean default_role) {
		this.default_role = default_role;
	}

	@Column(name="role_name")
	String name;
	
	@Column(name="default_role")
	Boolean default_role;
}
