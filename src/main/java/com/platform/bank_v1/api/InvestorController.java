package com.platform.bank_v1.api;

import com.platform.bank_v1.domain.Investor;
import com.platform.bank_v1.service.InvestorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/investment")
@RequiredArgsConstructor
public class InvestorController {

    @Autowired
    private final InvestorService investorService;

    @GetMapping("/investor-details/{email}")
    public Investor retrieveInvestorDetailsByEmail(@PathVariable String email){
        return investorService.findInvestorByEmail(email);
    }

    @GetMapping("/investor-details")
    public List<Investor> retrieveAllInvestorsDetails(){
        return investorService.findAllInvestors();
    }

}
