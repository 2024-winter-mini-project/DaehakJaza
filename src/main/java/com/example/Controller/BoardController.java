package com.example.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    @GetMapping("/community")
    public void community(){}

    @GetMapping("/communityNew")
    public void communityNew(){}

    @GetMapping("/communityPost")
    public void communityPost(){}

    @GetMapping("/question")
    public void question(){}

    @GetMapping("/questionNew")
    public void questionNew(){}

    @GetMapping("/questionPost")
    public void questionPost(){}

    @GetMapping("/review")
    public void review(){}

    @GetMapping("/reviewNew")
    public void reviewNew(){}

    @GetMapping("/reviewPost")
    public void reviewPost(){}
}
