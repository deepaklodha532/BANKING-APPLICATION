package com.bankDomain.BankingApp.service.impl;

import com.bankDomain.BankingApp.dto.UserDto;
import com.bankDomain.BankingApp.enitites.Account;
import com.bankDomain.BankingApp.enitites.User;
import com.bankDomain.BankingApp.repositories.AccountRepo;
import com.bankDomain.BankingApp.repositories.UserRepo;
import com.bankDomain.BankingApp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

        userDto.setUserId(UUID.randomUUID().toString());

        Account account=new Account();

        account.setAccountId("SBI"+ UUID.randomUUID().toString());

        userDto.setAccount(account);

        User user = modelMapper.map(userDto, User.class);

        account.setUser(user);

        accountRepo.save(account);

        User savedUser=userRepo.save(user);
        System.out.println("Saved User : -  "+savedUser);

        return modelMapper.map(savedUser,UserDto.class);
    }
}
