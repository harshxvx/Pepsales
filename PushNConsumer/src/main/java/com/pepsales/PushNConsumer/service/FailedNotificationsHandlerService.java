package com.pepsales.PushNConsumer.service;

import com.pepsales.PushNConsumer.models.PushNRequest;
import org.springframework.stereotype.Service;

@Service
public class FailedNotificationsHandlerService {
    public void handleFailedRequest(PushNRequest pushNRequest){
        //implement retry strategy or logging for failed notifications
    }
}
