package com.erp.model;

import javax.persistence.*;

@Table(name = "country_info")
public class CountryInfo {
    @Id
    @Column(name = "country_id")
    private Integer countryId;


    /**
     * 国家名称
     */
    @Column(name = "country_name")
    private String countryName;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}