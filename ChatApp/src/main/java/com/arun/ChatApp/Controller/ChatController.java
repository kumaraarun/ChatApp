package com.arun.ChatApp.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.arun.ChatApp.model.ChatMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ChatController {

	
	@MessageMapping("/sendMessage")//  /app/sendMessage
	@SendTo("/topic/messages")     //registry.enableSimpleBroker("/topic")
	public ChatMessage sendMessage(ChatMessage message) {
		return message;
	}
	@GetMapping("chat")
	public String chat() {
		return "chat";
	}
	

}
