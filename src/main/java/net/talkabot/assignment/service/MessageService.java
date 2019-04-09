package net.talkabot.assignment.service;


import net.talkabot.assignment.model.Message;

import java.util.List;


public interface MessageService {

    void saveMessage(Message message);

    List<Message> findAllMessages();

    void deleteMessageById(int id);

    Message findById(int id);

    void updateMessage(Message message);
}