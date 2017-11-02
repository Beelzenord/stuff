/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.StudentDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Student;

/**
 *
 * @author fauzianordlund
 */
@ManagedBean
@SessionScoped
public class StudentBean {
     private Integer id;
     private String fname;
     private String lname;
    /**
     * Creates a new instance of StudentBean
     */
    public StudentBean() {
    }
    public void addStudent(){
        Student student = new Student(getFname(),getLname());
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.addStudent(student);
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    
}