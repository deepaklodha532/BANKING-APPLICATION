package com.bankDomain.BankingApp.enitites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String UserId;

    private String UserName;

    private String UserEmail;

    private int Balance;

    private String Password;

    //one to one mapping
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user",fetch = FetchType.EAGER)
    private Account account;





}
