package com.platform.bank_v1;

import com.platform.bank_v1.repository.InvestorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BankV1Application {

	//private final InvestorRepository investorRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankV1Application.class, args);
	}

}
