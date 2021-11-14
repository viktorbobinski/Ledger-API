package com.example.ledger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LedgerController {

    private LedgerService ledgerService;

    @Autowired
    public LedgerController(LedgerService ledgerService) {
        this.ledgerService = ledgerService;
    }

    @GetMapping("/ledger")
    public String getLedger(Model model) {
        double balance = ledgerService.getBalance();

        model.addAttribute("balance", balance);
        model.addAttribute("transactions", ledgerService.getTransactions());
        return "ledger";
    }

    @PostMapping("/ledger")
    public String postToLedger(@RequestParam(name = "title") String title, @RequestParam(name="value") double value, Model model) {
        ledgerService.addToLedger(title, value);

        double balance = ledgerService.getBalance();

        model.addAttribute("balance", balance);
        model.addAttribute("transactions", ledgerService.getTransactions());
        return "ledger";
    }

}