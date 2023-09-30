package com.platform.bank_v1.api;

import com.platform.bank_v1.domain.Investor;
import com.platform.bank_v1.domain.Product;
import com.platform.bank_v1.domain.ProductType;
import com.platform.bank_v1.dto.InvestorLinkProductRequest;
import com.platform.bank_v1.dto.WithdrawalRequest;
import com.platform.bank_v1.dto.WithdrawalResponse;
import com.platform.bank_v1.service.InvestorService;
import com.platform.bank_v1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@RestController
@RequestMapping("/api/v1/investment")
@RequiredArgsConstructor
public class InvestorController {

    private final InvestorService investorService;
    private final ProductService productService;

    @GetMapping("/investor-details/{email}")
    public ResponseEntity<Investor> retrieveInvestorDetailsByEmail(@PathVariable String email){
        return ResponseEntity.ok(investorService.findInvestorByEmail(email));
    }

    @GetMapping("/investor-details")
    public ResponseEntity<List<Investor>> retrieveAllInvestorsDetails(){
        return ResponseEntity.ok(investorService.findAllInvestors());
    }

    @PostMapping("/link-product")
    public Investor linkProduct(@RequestBody InvestorLinkProductRequest request){
        return investorService.saveInvestorObj(request);

    }

    @GetMapping("/investor/products/{email}")
    public List<Product> retrieveAllInvestorsProducts(@PathVariable String email){
        return productService.findAllProductsLinkedToInvestor(email);
    }

    @PutMapping("/investor/withdraw")
    public WithdrawalResponse withdraw(@RequestBody WithdrawalRequest request){
        return investorService.withdrawal(request);
    }
}
