package com.example.lombok.builder.customSetter;

import lombok.Builder;
import lombok.Data;

import java.io.File;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 12:27 PM
**/
@Builder
@Data
public class Message {
    private String sender;
    private String recipient;
    private String text;
    private File file;

    public static class MessageBuilder{
        private String text;
        private File file;

        public MessageBuilder text(String text){
            this.text=text;
            verifyTextOrFile();
            return this;

        }
        private void verifyTextOrFile(){
            if (text !=null && file !=null){
                throw new IllegalMonitorStateException("Cannot send 'text' and 'file'. ");
            }
        }
    }

}
