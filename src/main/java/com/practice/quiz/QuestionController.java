package com.practice.quiz;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //because I want to accept the request.
@RequestMapping("question") //path of a request
public class QuestionController {

    @GetMapping("allQuestions")
    public String getAllQuestions() {
        return "Hi, These are your questions.";
    }
}
