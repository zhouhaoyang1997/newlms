package cn.edu.henu.rjxy.lms.model;
// Generated 2015-10-23 19:30:46 by Hibernate Tools 4.3.1



/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private Integer studentId;
     private int studentSn;
     private String studentName;
     private String studentIdcard;
     private int studentGrade;
     private int studentCollegeId;
     private String studentTel;
     private String studentQq;
     private String studentPwd;
     private boolean studentSex;

    public Student() {
    }

    public Student(int studentSn, String studentName, String studentIdcard, int studentGrade, int studentCollegeId, String studentTel, String studentQq, String studentPwd, boolean studentSex) {
       this.studentSn = studentSn;
       this.studentName = studentName;
       this.studentIdcard = studentIdcard;
       this.studentGrade = studentGrade;
       this.studentCollegeId = studentCollegeId;
       this.studentTel = studentTel;
       this.studentQq = studentQq;
       this.studentPwd = studentPwd;
       this.studentSex = studentSex;
    }
   
    public Integer getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public int getStudentSn() {
        return this.studentSn;
    }
    
    public void setStudentSn(int studentSn) {
        this.studentSn = studentSn;
    }
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentIdcard() {
        return this.studentIdcard;
    }
    
    public void setStudentIdcard(String studentIdcard) {
        this.studentIdcard = studentIdcard;
    }
    public int getStudentGrade() {
        return this.studentGrade;
    }
    
    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
    public int getStudentCollegeId() {
        return this.studentCollegeId;
    }
    
    public void setStudentCollegeId(int studentCollegeId) {
        this.studentCollegeId = studentCollegeId;
    }
    public String getStudentTel() {
        return this.studentTel;
    }
    
    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel;
    }
    public String getStudentQq() {
        return this.studentQq;
    }
    
    public void setStudentQq(String studentQq) {
        this.studentQq = studentQq;
    }
    public String getStudentPwd() {
        return this.studentPwd;
    }
    
    public void setStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }
    public boolean isStudentSex() {
        return this.studentSex;
    }
    
    public void setStudentSex(boolean studentSex) {
        this.studentSex = studentSex;
    }




}


