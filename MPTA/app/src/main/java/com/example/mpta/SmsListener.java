package com.example.mpta;

public interface SmsListener {
    public void messageReceived(String messageText, String nameText);
}
