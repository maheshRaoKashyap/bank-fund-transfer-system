package com.example.demo.service;

import com.example.demo.dto.AccountRequest;
import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    // Create Account
    public Account createAccount(AccountRequest request) {

        Account account = new Account();

        account.setAccountHolderName(request.getAccountHolderName());
        account.setBalance(BigDecimal.valueOf(request.getBalance()));

        return (Account) accountRepository.save(account);
    }

    // Get Account by ID
    public Account getAccount(Long id){

        return accountRepository.findById(id)
                .orElse(null);

    }
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    public boolean deleteAccount(Long id) {

        if(accountRepository.existsById(id)){

            accountRepository.deleteById(id);
            return true;

        }

        return false;
    }
    public Account deposit(Long id, Double amount) {

        Account account = accountRepository.findById(id).orElse(null);

        if (account != null) {
            BigDecimal depositAmount = BigDecimal.valueOf(amount);
            account.setBalance(account.getBalance().add(depositAmount));
            accountRepository.save(account);
        }

        return account;
    }
    public String transferMoney(Long fromId, Long toId, Double amount) {

        BigDecimal transferAmount = BigDecimal.valueOf(amount);

        Account sender = accountRepository.findById(fromId).orElse(null);
        Account receiver = accountRepository.findById(toId).orElse(null);

        if (sender == null || receiver == null) {
            return "Account Not Found";
        }

        if (sender.getBalance().compareTo(transferAmount) < 0) {
            return "Insufficient Balance";
        }

        sender.setBalance(sender.getBalance().subtract(transferAmount));
        receiver.setBalance(receiver.getBalance().add(transferAmount));

        accountRepository.save(sender);
        accountRepository.save(receiver);

        return "Transfer Successful";
    }
}