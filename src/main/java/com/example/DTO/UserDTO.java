package com.example.DTO;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String password;
    private String name;
    private String age;
    private String email;
    private String nickname;
    private String school;
    private String profile;
}
