package com.bankDomain.BankingApp.repositories;

import com.bankDomain.BankingApp.enitites.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,String> {
}
