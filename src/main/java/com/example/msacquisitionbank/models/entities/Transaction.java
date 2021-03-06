package com.example.msacquisitionbank.models.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Transaction {

    @Field(name = "transactionType")
    private String transactionType;

    @Field(name = "transactionAmount")
    private Double transactionAmount;

    @Field(name = "account")
    private Bill bill;

}
