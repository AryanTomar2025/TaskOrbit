package com.aryan.service;

import java.util.List;

import com.aryan.exception.ChatException;
import com.aryan.exception.ProjectException;
import com.aryan.exception.UserException;
import com.aryan.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

