package com.example.ledger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LedgerService {

    private LedgerRepository ledgerRepository;

    @Autowired
    public LedgerService(LedgerRepository ledgerRepository) {
        this.ledgerRepository = ledgerRepository;
        this.ledgerRepository.save(new Ledger());
    }

    public double getBalance() {
        Ledger ledger = ledgerRepository.getById(1L);

        return ledger.getBalance();
    }

    public void addToLedger(String title, double value) {
        Ledger ledger = ledgerRepository.getById(1L);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String dateString = formatter.format(new Date());

        Transaction transaction = new Transaction(title, dateString, value);
        ledger.addTransaction(transaction);

        ledger.updateBalance(value);
        ledgerRepository.save(ledger);

        ledger.getBalance();
    }

    public List<Transaction> getTransactions() {
        Ledger ledger = ledgerRepository.getById(1L);
        return ledger.getTransactions();
    }
}
