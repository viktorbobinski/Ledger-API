package com.example.ledger;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String title;
    public String date;
    public double value;

    public Transaction() {

    }

    public Transaction(String title, String date, double value) {
        this.title = title;
        this.date = date;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", value=" + value +
                '}';
    }
}
