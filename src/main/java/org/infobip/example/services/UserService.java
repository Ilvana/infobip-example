package org.infobip.example.services;

import lombok.extern.slf4j.Slf4j;
import org.infobip.example.models.User;

@Slf4j
public class UserService {

    public static void main(String[] args) {
        User example1 = User.builder()
                            .address("Evnera Sehovica")
                        .build();
        User example2 = User.builder()
                            .address("Evnera Sehovica")
                            .email("ilvana_brankovic@hotmail.com")
                            .name("Ilvana")
                        .build();
        User example3 = User.builder()
                            .password("ivana")
                            .username("ibrankovic")
                            .email("ilvana_example@hotmail.com")
                            .telephone("38761585254")
                            .surname("Brankovic")
                        .build();
        User example4 = User.builder().build();
    }

    public void create(User user) {
        log.info("Creating user...");
    }
}
