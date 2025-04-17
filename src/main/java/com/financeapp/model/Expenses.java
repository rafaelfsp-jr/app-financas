package com.financeapp.model;

import lombok.AllArgsConstructor:
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Expenses {
    private String name;
    private BigDecimal amount;
    private TypeExpense type;
    private String methodPayment;
    private StatusPayment statusPayment;
    private String notes;
}
