package com.example.demouwu.learning.domain.model.valueobjects;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmailAddress {
    private String address;

    protected EmailAddress(){}

    public EmailAddress(String address) {
        if (!address.contains("@")) throw new IllegalArgumentException("Email inválido");
        this.address = address;
    }

    public String getAddress() { return address; }

}
