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

    /**
     * @return country_id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 获取国家名称
     *
     * @return country_name - 国家名称
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置国家名称
     *
     * @param countryName 国家名称
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}