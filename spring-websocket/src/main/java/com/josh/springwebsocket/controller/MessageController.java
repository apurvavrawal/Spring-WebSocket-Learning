package com.josh.springwebsocket.controller;

import com.josh.springwebsocket.model.InputMessage;
import com.josh.springwebsocket.model.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping({"/"})
    @SendTo({"/chat/sendMessage"})
    public OutputMessage sendMessage(InputMessage inputMessage) {
        return new OutputMessage("New message: " + inputMessage.getInputMessage());
    }
}
