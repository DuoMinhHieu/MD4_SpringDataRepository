package com.example.paginationspringdatajpa.repository;

import com.example.paginationspringdatajpa.model.Customer;
import com.example.paginationspringdatajpa.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
