package net.talkabot.assignment.controller;
import net.talkabot.assignment.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    @Autowired
    MessageService messageService;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		return messageService.findById(1).getText();
	}
} 