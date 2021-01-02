package oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("mappingFiles/persistence.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session openSession = sf.openSession();
		List<Role> list=new ArrayList<Role>();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Aadhar aadhar=new Aadhar(124512456,"Rahul","LIG 205 Sectore 16 Awa vikas colony sikandra Agra");
		PanCard pan=new PanCard(5354534, "Rahul Sharma");
		User user=new User(1,"Rahul Sharma",aadhar,pan);
		openSession.save(user);
		
		Role admin=new Role(1,"ADMIN");
		admin.setUser(user);
		admin.setDefault_role(true);
		openSession.save(admin);
		
		Role it=new Role(2,"IT");
		it.setUser(user);
		it.setDefault_role(false);
		openSession.save(it);
		
		beginTransaction.commit();
		openSession.close();
		sf.close();
	}

}
