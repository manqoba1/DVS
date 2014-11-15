/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sifiso.yazisa.dto;

import com.sifiso.yazisa.data.School;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class SchoolDTO {

    private Integer schoolID;
    private String schoolName;
    private double latitude;
    private double longitude;
    private TownshipDTO township;
    private List<TeachersDTO> teachersList;

    public SchoolDTO(School s) {
        schoolID = s.getSchoolID();
        schoolName = s.getSchoolName();
        latitude = s.getLatitude();
        longitude = s.getLongitude();
        township = new TownshipDTO(s.getTownship());

    }

   

    public Integer getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Integer schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public TownshipDTO getTownship() {
        return township;
    }

    public void setTownship(TownshipDTO township) {
        this.township = township;
    }

    public List<TeachersDTO> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<TeachersDTO> teachersList) {
        this.teachersList = teachersList;
    }

}