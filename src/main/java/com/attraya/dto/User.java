package com.attraya.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

}
