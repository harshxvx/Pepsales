package com.pepsales.SMSConsumer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsRequest {
    private String mobileNumber;
    private String message;
    private Long notificationId; //which notification the sms request belongs to
    //to track status,etc in other microservices as well

    public SmsRequest(String mobileNumber, String message){
        this.mobileNumber= mobileNumber;
        this.message = message;
    }
}
