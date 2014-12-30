/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sifiso.dvs.dto;

import com.sifiso.dvs.data.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class CountryDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer countryID;
    private String countryName;
    private String countryCode;
    private Double latitude;
    private Double longitude;
    private List<ProvinceDTO> provinceList = new ArrayList<>();

    public CountryDTO() {
    }

    public CountryDTO(Integer countryID) {
        this.countryID = countryID;
    }

    public CountryDTO(Country a) {
        this.countryID = a.getCountryID();
        this.countryName = a.getCountryName();
        this.countryCode = a.getCountryCode();
        latitude = a.getLatitude();
        longitude = a.getLongitude();
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<ProvinceDTO> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceDTO> provinceList) {
        this.provinceList = provinceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryID != null ? countryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryDTO)) {
            return false;
        }
        CountryDTO other = (CountryDTO) object;
        if ((this.countryID == null && other.countryID != null) || (this.countryID != null && !this.countryID.equals(other.countryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sifiso.dvs.data.Country[ countryID=" + countryID + " ]";
    }

}
