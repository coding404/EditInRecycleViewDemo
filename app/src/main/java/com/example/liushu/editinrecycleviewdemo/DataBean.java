package com.example.liushu.editinrecycleviewdemo;

public class DataBean {
    //姓名
    private String studentName;
    //班级
    private String studentGrade;
    //成绩
    private String studentRecord;

    public DataBean(String studentName, String studentGrade, String studentRecord) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentRecord = studentRecord;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentRecord() {
        return studentRecord;
    }

    public void setStudentRecord(String studentRecord) {
        this.studentRecord = studentRecord;
    }
}
