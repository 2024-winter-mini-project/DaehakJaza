package com.example.domain.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    private String userId;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String school;

    @Column(nullable = false)
    @ColumnDefault("'default.png'")
    private String profile;


}
