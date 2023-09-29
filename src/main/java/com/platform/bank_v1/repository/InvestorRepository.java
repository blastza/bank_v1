package com.platform.bank_v1.repository;


import com.platform.bank_v1.domain.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Integer> {
    @Query(value = "SELECT * FROM investors WHERE email = :email", nativeQuery = true)
    Investor findByEmail(String email);
}
