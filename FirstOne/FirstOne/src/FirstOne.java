
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bipin yadav
 */
public class FirstOne {

    /**
     * @param args the command line arguments
     */
    
    static void add(Session session){
        Employee emp1 = new Employee();
        emp1.setEmpName("Bipin");
        emp1.setEmpBand("TRB");
        session.save(emp1);
    }
    
    static void update(int in, String name, String band, Session session){
        Employee e = (Employee)session.get(Employee.class,in);
        e.setEmpName(name);
        e.setEmpBand(band);
        session.saveOrUpdate(e);
    }
    
    static void delete(int in, Session session){
        Employee e = (Employee)session.get(Employee.class,in);
        session.delete(e);
    }
    
    static void display(Session session){        
       Query query = session.createQuery("from Employee");
       List<Employee> list1 = query.list();
       for(Employee e : list1){
           System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpBand());
       }
    }
    
    
    public static void main(String[] args) {
        
        Session session  = HibernateUtil.getSessionFactory().openSession();
        Transaction trn = session.beginTransaction();   
        
        try{
        add(session);
        display(session);
        
        update(1,"Yadav","B1",session);
        display(session);
        
        delete(1,session);
        display(session);
        
        trn.commit();
        }
        catch(HibernateException he){
            System.out.println(he);
        }
        
    }
}
