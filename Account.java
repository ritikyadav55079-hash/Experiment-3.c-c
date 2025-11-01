package com.example.bankapp;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    private int accountId;

    @Column
    private String holderName;

    @Column
    private double balance;

    // Getters, setters, and constructors
}
