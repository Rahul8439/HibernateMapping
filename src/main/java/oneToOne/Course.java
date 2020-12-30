package oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//We need to create this table manually through table create script


@Entity
@Table(name = "Course")
public class Course {
	@Id
	@Column(name="course_name")
	String courseName;

	@Column(name = "Course_Duration")
	String duration;

	@Column(name = "course_fee")
	Integer fee;

	public Course() {

	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}
}
