package com.example.ledger;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ledger {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    double balance;

    @OneToMany(cascade = CascadeType.ALL)
    List<Transaction> transactions;

    public Ledger() {
        this.balance = 0;
        transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void updateBalance(double value) {
        this.balance += value;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
