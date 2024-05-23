package com.ironhack.lab304.repository;

import com.ironhack.lab304.models.Customer;
import com.ironhack.lab304.models.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer>{
    //JPA maneja la query solo
    List<Customer> findCustomerByCustomerStatus (CustomerStatus customerStatus);



    //JPQL hacia la entidad, en código - JPA traduce la query a SQL
    @Query("select c from Customer c where c.customerStatus = :status")
    List<Customer> findCustomerByCustomerStatusCustomQuery(@Param("status") CustomerStatus customerStatus);

    //SQL hacia la tabla, en código de sql
    @Query(value = "select * from customers c where c.customer_status = :status", nativeQuery = true)
    List<Customer> findCustomerByCustomerStatusCustomNativeQuery(@Param("status") CustomerStatus customerStatus);
}

