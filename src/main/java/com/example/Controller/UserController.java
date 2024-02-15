package com.example.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    @GetMapping("/changePassword")
    public void changePassword(){}

    @GetMapping("/join")
    public void join(){}

    @GetMapping("/memberInformationS")
    public void memberInformationS(){}

    @GetMapping("/memberInformationU")
    public void memberInformationU(){}

    @GetMapping("/outCheck")
    public void outCheck(){}

    @GetMapping("/userActivities")
    public void userActivities(){}

    @GetMapping("/userQnA")
    public void userQnA(){}

    @GetMapping("/universityInput")
    public void universityInput(){}
}
