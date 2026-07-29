package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountRequest {

    @NotBlank(message="Name cannot be empty")
    private String accountHolderName;

    @NotNull(message="Balance is required")
    @PositiveOrZero(message="Balance cannot be negative")
    private Double balance;

}