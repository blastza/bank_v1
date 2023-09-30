package com.platform.bank_v1.dto;

import com.platform.bank_v1.domain.Product;
import com.platform.bank_v1.domain.ProductType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class WithdrawalRequest {

    private String name;
    private String email;
    private Double withdrawal_amount;
    private ProductType productType;

}
