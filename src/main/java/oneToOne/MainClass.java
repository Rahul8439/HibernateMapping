package oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("mappingFiles/persistence.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tnx = s.beginTransaction();
		Student student = new Student();
		student.setId(4);
		student.setName("Rahul");
		Course c = new Course();
		c.setCourseName("Python");
		c.setFee(10000);
		c.setDuration("5 Month");
		student.setCourse(c);
		student.setEmail("rahul.sharma@adeptia.com");
		s.saveOrUpdate(student);// s.save(student);
		tnx.commit();

		// Student st=(Student) s.get(Student.class,3);
		// s.delete(st);
		// tnx1.commit();
		s.close();
		sf.close();
	}

}
