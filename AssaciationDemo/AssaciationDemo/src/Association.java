
import java.util.HashSet;
import java.util.Set;
import org.hibernate.HibernateException;
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
public class Association {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        try{
        Session session  = HibernateUtil.getSessionFactory().openSession();
        Transaction trn = session.beginTransaction();         
       
        Employee e1 = new Employee();
        e1.setEmpName("Bipin");
        Employee e2 = new Employee();
        e2.setEmpName("Yadav");
        Set<Employee> eset = new HashSet<Employee>() {};
        eset.add(e1);
        eset.add(e2);
        
        Department dept = new Department();
        dept.setDeptName("Digi");
        dept.setEmployees(eset);
        
        session.save(dept);
        
        trn.commit();
        }
        catch(HibernateException he){
            System.out.println(he);
        }
        
    }
}
