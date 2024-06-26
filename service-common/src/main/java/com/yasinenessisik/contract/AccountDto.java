package com.yasinenessisik.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private String id;
    private String username;

    private String surname;

    private String name;

    private String email;

    private Date birthDate;

    public String getNameSurname(){
        return this.name +" "+this.surname;
    }

}