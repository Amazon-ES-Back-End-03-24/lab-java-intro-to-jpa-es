package com.ironhack.lab304.models;

import jakarta.persistence.*;

@Entity
@Table(name ="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    private String customerName;

    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus;


    private Integer totalCustomerMileage;


    public Customer() {

    }

    public Customer(CustomerStatus customerStatus, Integer totalCustomerMileage, String customerName) {
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }
}
