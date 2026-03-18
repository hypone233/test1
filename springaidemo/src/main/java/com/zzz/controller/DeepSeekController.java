package com.zzz.controller;


import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ds")
@RestController
public class DeepSeekController {
    //接入
    @Autowired
    private OpenAiChatModel openAiChatModel;

    @RequestMapping("/chat")
    public String generate(String message){
        return openAiChatModel.call(message);
    }

}
