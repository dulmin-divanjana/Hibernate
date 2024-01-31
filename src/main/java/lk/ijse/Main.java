package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setId(2);
        student.setName("dulmin");
        student.setAddress("panadura");

        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        /*Session.save(String);
        session.close();*/

        /*session.delete(student);
        transaction.commit();
        session.close();*/

        /*Student s=session.load(Student.class,1);
        System.out.println(student);*/

        session.remove(student);

        transaction.commit();
        session.close();
    }
}