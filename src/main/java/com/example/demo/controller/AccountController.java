package com.example.demo.controller;

import com.example.demo.dto.AccountRequest;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    // =========================
    // HOME PAGE
    // =========================
    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("accountRequest", new AccountRequest());
        model.addAttribute("accounts", accountService.getAllAccounts());

        return "index";
    }

    // =========================
    // CREATE ACCOUNT
    // =========================
    @PostMapping("/createAccount")
    public String createAccount(
            @Valid @ModelAttribute("accountRequest") AccountRequest accountRequest,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("accounts", accountService.getAllAccounts());
            return "index";
        }

        Account account = accountService.createAccount(accountRequest);

        model.addAttribute("message", "Account Created Successfully");
        model.addAttribute("account", account);
        model.addAttribute("accounts", accountService.getAllAccounts());
        model.addAttribute("accountRequest", new AccountRequest());

        return "index";
    }

    // =========================
    // SEARCH ACCOUNT
    // =========================
    @GetMapping("/search")
    public String searchAccount(@RequestParam Long id,
                                Model model) {

        Account account = accountService.getAccount(id);

        if (account == null) {
            model.addAttribute("error", "Account Not Found");
        } else {
            model.addAttribute("account", account);
        }

        model.addAttribute("accounts", accountService.getAllAccounts());
        model.addAttribute("accountRequest", new AccountRequest());

        return "index";
    }

    // =========================
    // VIEW ALL ACCOUNTS
    // =========================
    @GetMapping("/accounts")
    public String getAllAccounts(Model model) {

        model.addAttribute("accounts", accountService.getAllAccounts());
        model.addAttribute("accountRequest", new AccountRequest());

        return "index";
    }

    // =========================
    // DELETE ACCOUNT
    // =========================
    @GetMapping("/delete")
    public String deleteAccount(@RequestParam Long id,
                                Model model) {

        boolean deleted = accountService.deleteAccount(id);

        if (deleted) {
            model.addAttribute("message", "Account Deleted Successfully");
        } else {
            model.addAttribute("error", "Account Not Found");
        }

        model.addAttribute("accounts", accountService.getAllAccounts());
        model.addAttribute("accountRequest", new AccountRequest());

        return "index";
    }

    // =========================
    // DEPOSIT MONEY
    // =========================
    @PostMapping("/deposit")
    public String depositMoney(@RequestParam Long id,
                               @RequestParam Double amount,
                               Model model) {

        Account account = accountService.deposit(id, amount);

        if (account == null) {
            model.addAttribute("error", "Account Not Found");
        } else {
            model.addAttribute("message", "Money Deposited Successfully");
            model.addAttribute("account", account);
        }

        model.addAttribute("accounts", accountService.getAllAccounts());
        model.addAttribute("accountRequest", new AccountRequest());

        return "index";
    }

    // =========================
    // TRANSFER MONEY
    // =========================
    @PostMapping("/transfer")
    public String transferMoney(@RequestParam Long fromId,
                                @RequestParam Long toId,
                                @RequestParam Double amount,
                                Model model) {

        String result = accountService.transferMoney(fromId, toId, amount);

        if ("Transfer Successful".equals(result)) {
            model.addAttribute("message", result);
        } else {
            model.addAttribute("error", result);
        }

        model.addAttribute("accounts", accountService.getAllAccounts());
        model.addAttribute("accountRequest", new AccountRequest());

        return "index";
    }
}