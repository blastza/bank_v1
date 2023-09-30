package com.platform.bank_v1.repository;

import com.platform.bank_v1.domain.Product;
import com.platform.bank_v1.dto.WithdrawalRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //TODO: get products linked to the investor
    //List<Product> findAllLinkedProducts(String ip_fk);
}
