import com.hibernate.hibernate.utils.HibernateUtils;
import model.Address;
import model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


public class Main {
    public static void main(String[] args)  throws Exception {

////        save Image
//        String city="Chhatrapati Sambhajinagar";
//        String street="Railway station road Chh. Sambhajinagar";
//        boolean isOpen=true;
//        Date date=new Date();
//
//        FileInputStream fis= new FileInputStream("src/main/resources/prof.jpg");
//        byte[] image=new byte[fis.available()];
//        fis.read(image);
//        Address address= new Address();
//        address.setStreet(street);
//        address.setCity(city);
//        address.setOpen(isOpen);
//        address.setAddedDate(date);
//        address.setImage(image);
//        Session session=new Configuration()
//                .configure()
//                .addAnnotatedClass(model.Address.class)
//                .buildSessionFactory()
//                .openSession();
//        Transaction transaction=null;
//        try {
//            transaction=session.beginTransaction();
//            session.persist(address);
//            transaction.commit();
//            session.close();
//        }catch (Exception e){
//            if (transaction!=null)
//            {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        session.close();



//        Fetch data
        Students students;
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session=factory.openSession();
        students=session.byId(Students.class).load();
        System.out.println(students);

    }
}
