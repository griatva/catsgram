package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"email"})
public class User {

    private Long id;
    private String username;
    private String email;
    private String password;
    private Instant registrationDate;

}
