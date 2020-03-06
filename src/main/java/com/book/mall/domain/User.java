package com.book.mall.domain;

public class User {

    //对应字段ID_user
    private Integer id;

    //对应字段LogName
    private String logname;

    //对应字段RealName;
    private String realname;

    //对应字段Password_md5;
    private String password;

    //对应字段Email
    private String email;

    //对应字段Gender
    private Integer gender;

    //对应字段Province
    private String province;

    //对应字段Education
    private String education;

    //对应字段Hobbies
    private String hobbies;

    //对应字段Selfinto
    private String  selfIntro;

    //对应字段Image_Path
    private String imagePath;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getLogname() {
        return logname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRealname() {
        return realname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEducation(String eductaion) {
        this.education = eductaion;
    }

    public String getEducation() {
        return education;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGender() {
        return gender;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setSelfintro(String selfintro) {
        this.selfIntro = selfintro;
    }

    public String getSelfintro() {
        return selfIntro;
    }
}
