/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sifiso.yazisa.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "learners")
@NamedQueries({
    @NamedQuery(name = "Learners.findAll", query = "SELECT l FROM Learners l"),
    @NamedQuery(name = "Learners.findByLearnersID", query = "SELECT l FROM Learners l WHERE l.learnersID = :learnersID"),
    @NamedQuery(name = "Learners.findByName", query = "SELECT l FROM Learners l WHERE l.name = :name"),
    @NamedQuery(name = "Learners.findBySurname", query = "SELECT l FROM Learners l WHERE l.surname = :surname"),
    @NamedQuery(name = "Learners.findByIdnumber", query = "SELECT l FROM Learners l WHERE l.idnumber = :idnumber"),
    @NamedQuery(name = "Learners.findByUsername", query = "SELECT l FROM Learners l WHERE l.username = :username"),
    @NamedQuery(name = "Learners.findByPassword", query = "SELECT l FROM Learners l WHERE l.password = :password")})
public class Learners implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "learnersID")
    private Integer learnersID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idnumber")
    private int idnumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "learners")
    private List<Clazzlearner> clazzlearnerList;
    @JoinColumn(name = "parentID", referencedColumnName = "parentID")
    @ManyToOne(optional = false)
    private Parent parent;
    @OneToMany(mappedBy = "learners")
    private List<Exammark> exammarkList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "learners")
    private List<Subclazz> subclazzList;

    public Learners() {
    }

    public Learners(Integer learnersID) {
        this.learnersID = learnersID;
    }

    public Learners(Integer learnersID, String name, String surname, int idnumber, String username, String password) {
        this.learnersID = learnersID;
        this.name = name;
        this.surname = surname;
        this.idnumber = idnumber;
        this.username = username;
        this.password = password;
    }

    public Integer getLearnersID() {
        return learnersID;
    }

    public void setLearnersID(Integer learnersID) {
        this.learnersID = learnersID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Clazzlearner> getClazzlearnerList() {
        return clazzlearnerList;
    }

    public void setClazzlearnerList(List<Clazzlearner> clazzlearnerList) {
        this.clazzlearnerList = clazzlearnerList;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public List<Exammark> getExammarkList() {
        return exammarkList;
    }

    public void setExammarkList(List<Exammark> exammarkList) {
        this.exammarkList = exammarkList;
    }

    public List<Subclazz> getSubclazzList() {
        return subclazzList;
    }

    public void setSubclazzList(List<Subclazz> subclazzList) {
        this.subclazzList = subclazzList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (learnersID != null ? learnersID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Learners)) {
            return false;
        }
        Learners other = (Learners) object;
        if ((this.learnersID == null && other.learnersID != null) || (this.learnersID != null && !this.learnersID.equals(other.learnersID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sifiso.yazisa.data.Learners[ learnersID=" + learnersID + " ]";
    }

}