package org.infobip.example.models;

import lombok.*;

@Data
@Builder
public class User {
    private @NonNull  String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private String address;

    private String address1;
}
