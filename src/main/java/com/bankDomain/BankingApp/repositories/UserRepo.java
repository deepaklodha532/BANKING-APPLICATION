package com.bankDomain.BankingApp.repositories;

import com.bankDomain.BankingApp.enitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
