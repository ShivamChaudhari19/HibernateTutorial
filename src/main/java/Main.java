import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("project started......");
        SessionFactory Factory=new Configuration().configure("HibernateConfig.xml").buildSessionFactory();
        System.out.println(Factory);
        System.out.println(Factory.isClosed());
    }
}
