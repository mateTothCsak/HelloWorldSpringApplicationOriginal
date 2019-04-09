package net.talkabot.assignment.service;


import java.util.List;

import net.talkabot.assignment.dao.MessageDaoImpl;
import net.talkabot.assignment.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("messageService")
@Transactional
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageDaoImpl dao;

    public void saveMessage(Message message) {
        dao.saveMessage(message);
    }

    public List<Message> findAllMessages() {
        return dao.findAllMessages();
    }

    public void deleteMessageById(int id) {
        dao.deleteMessageById(id);
    }

    public Message findById(int id) {
        return dao.findById(id);
    }

    public void updateMessage(Message message){
        dao.updateMessage(message);
    }
}