/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author fauzianordlund
 */
public class StudentDAO {
    public void addStudent(Student student){
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx = session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.flush();
            session.close();
        }
    }
    public void deleteStudent(int idStudent){
        
    }
    public void updateClient(Student student){
        
    }
    public Student getStudentById(int idStudent){
        return null;
    }
}