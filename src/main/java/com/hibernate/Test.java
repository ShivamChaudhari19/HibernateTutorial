package  com.hibernate;

import com.hibernate.hibernate.utils.HibernateUtils;
import model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

class Test{
    public static void main(String[] args) {

        Students students1=new Students();
        students1.setSName("shivam");
        Transaction transaction=null;
        try {
            SessionFactory factory= HibernateUtils.getSessionFactory();
            Session session=factory.openSession();
            transaction=session.beginTransaction();
            session.persist(students1);
            transaction.commit();
            System.out.println("Instance saved successfully!!!!");
            session.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}