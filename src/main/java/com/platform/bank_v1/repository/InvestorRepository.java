package com.platform.bank_v1.repository;


import com.platform.bank_v1.domain.Investor;
import com.platform.bank_v1.domain.Product;
import io.swagger.v3.oas.models.links.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Integer> {
    @Query(value = "SELECT * FROM investor WHERE email = :email", nativeQuery = true)
    Investor findByEmail(String email);

    @Query(value = "SELECT * FROM investor, products WHERE investor_id = ip_fk", nativeQuery = true)
    List<Product> getProductsLinkedToInvestor(Integer investor_id);

}
