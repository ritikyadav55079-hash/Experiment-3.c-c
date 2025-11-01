package com.example.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

    @Autowired
    private AccountDAO accountDAO;

    @Transactional
    public void transferMoney(int fromId, int toId, double amount) {
        Account from = accountDAO.findById(fromId);
        Account to = accountDAO.findById(toId);

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountDAO.update(from);
        accountDAO.update(to);

        // Uncomment to simulate rollback:
        // if (true) throw new RuntimeException("Simulated failure");
    }
}
