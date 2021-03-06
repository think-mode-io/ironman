package com.ironman.domain;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author jsingh on 2013-06-18 at 11:36 PM
 */
@Entity
@Table(name = "LISTINGS")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Listing extends BaseObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "LISTING_ID", unique = true, nullable = false)
    private long listingId;

    @Column(name = "PICTURE_URL")
    private String picture;

    @Column(name = "LISTED_PRICE", nullable = false)
    private BigDecimal listedPrice;

    @Column(name = "BEDROOMS", nullable = false)
    private float bedrooms;

    @Column(name = "BATHROOMS", nullable = false)
    private float bathrooms;

    @Column(name = "PROPERTY_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private PropertyType propertyType;

    @Column(name = "PROPERTY_TAX")
    private BigDecimal propertyTax;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LISTING_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private ListingStatus listingStatus;

    @Column(name = "PROVINCE")
    private String province;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    public long getListingId() {
        return listingId;
    }

    public void setListingId(long listingId) {
        this.listingId = listingId;
    }

    public BigDecimal getListedPrice() {
        return listedPrice;
    }

    public void setListedPrice(BigDecimal listedPrice) {
        this.listedPrice = listedPrice;
    }

    public float getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(float bedrooms) {
        this.bedrooms = bedrooms;
    }

    public float getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(float bathrooms) {
        this.bathrooms = bathrooms;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public BigDecimal getPropertyTax() {
        return propertyTax;
    }

    public void setPropertyTax(BigDecimal propertyTax) {
        this.propertyTax = propertyTax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListingStatus getListingStatus() {
        return listingStatus;
    }

    public void setListingStatus(ListingStatus listingStatus) {
        this.listingStatus = listingStatus;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
