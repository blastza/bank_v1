package com.platform.bank_v1.service;

import com.platform.bank_v1.domain.Investor;
import com.platform.bank_v1.domain.Product;
import com.platform.bank_v1.repository.InvestorRepository;
import com.platform.bank_v1.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final InvestorRepository investorRepository;

    public List<Product> findAllProductsLinkedToInvestor(String email) {
        Investor productByEmail = investorRepository.findByEmail(email);
        return productByEmail.getProducts();
    }
}
