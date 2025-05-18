package com.pepsales.SMSConsumer.service;

import com.pepsales.SMSConsumer.models.SmsRequest;
import org.springframework.stereotype.Service;

@Service
public class FailedNotificationsHandlerService {
    public void handleFailedRequest(SmsRequest smsRequest){
        //implement retry strategy or logging for failed notifications
    }
}
