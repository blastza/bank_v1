package com.platform.bank_v1.dto;

import com.platform.bank_v1.domain.ProductType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class WithdrawalResponse {
    private ProductType type;
    private String name;
    private Double current_balance;
    private Double previous_balance;
}
