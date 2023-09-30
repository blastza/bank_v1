package com.platform.bank_v1.dto;

import com.platform.bank_v1.domain.Investor;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter @Setter
public class InvestorLinkProductRequest {
    private Investor investor;
}
