package com.platform.bank_v1.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/investment")
//@PreAuthorize("hasRole('INVESTOR')")
@RequiredArgsConstructor
public class InvestorController {

/*    @Autowired
    private final InvestorService investorService;

    @PostMapping("")
    public ResponseEntity<?> updateInvestorDetails(@RequestBody InvestorDetails request){
        return ResponseEntity.ok(investorService.updateProfile(request));
    }

    @PostMapping("{}")
    public ResponseEntity<?> getInvestorByEmail(@AuthenticationPrincipal User user){
        return null;//ResponseEntity.ok(investorService.updateProfile(user));
    }*/
}
