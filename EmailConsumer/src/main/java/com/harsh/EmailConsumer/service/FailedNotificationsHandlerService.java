package com.harsh.EmailConsumer.service;

import com.harsh.EmailConsumer.models.EmailRequest;
import org.springframework.stereotype.Service;

@Service
public class FailedNotificationsHandlerService {
    public void handleFailedRequest(EmailRequest emailRequest){
        //implement retry strategy or logging for failed notifications
    }
}
