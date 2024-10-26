package com.bankDomain.BankingApp.dto;

import com.bankDomain.BankingApp.enitites.Account;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String UserId;

    @Column(name = "userName")
    private String UserName;//UserName

    @Column(name = "userEmail")
    private String UserEmail;//UserEmail

    @Column(name = "userAccount")
    private Account account;

}
