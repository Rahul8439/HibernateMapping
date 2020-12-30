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
		/*
		 	Upto these line <property name="hibernate.hbm2ddl.auto"></property>
			Above cfg property execute and perform below action
			create-Drop existing table and create new table
			update-If table exist,update table else create new table
			validate-If entity class column is equal or less then database columns
			create-drop-Drop existing table and create new table and on session.close drop all table used this ddl operation is used for testing. 
		*/
		
		
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
		s.saveOrUpdate(student);//return void;
		
		
		/*s.persist(student); //return void
		  s.save(student);
		  s.save(student); //return primary key
		  s.update(student);//Not update key and we need to update all column then this action execute otherwise not
		  and update does not works when we perform update on same object that we get before by session.get(Student.class,1) method.
		  For avoiding this error we use session.merge(student);
		  session.delete(student);//for deleting object from table 
		  */
		
		
		tnx.commit();

		// Student st=(Student) s.get(Student.class,3);
		// s.delete(st);
		// tnx1.commit();
		s.close();
		sf.close();
	}

}
