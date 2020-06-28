package com.TelegramBot.EraserHead;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SaikatBOTGame extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // NEW:
            GameHandler.check(this, update);
        }
    }

    private void log(String username, String chatId, String textReceived, String botResponse) {
        System.out.println("----------------------------\n");
        // print out in PM/AM time
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd h:mm a");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Message from " + username + ". (id = " + chatId + ") \n Text - " + textReceived);
        System.out.println("Bot answer: \n Text - " + botResponse);
    }

    public void sendPhoto(String chatId, String url) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(url);

        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(Long chatId, String chatId2) {
        SendMessage sendMessageRequest = new SendMessage();
        sendMessageRequest.setChatId(chatId);
        sendMessageRequest.setText(chatId2);
        try {
            execute(sendMessageRequest);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        // Return bot username
        // If bot username is @MyAmazingBot, it must return 'MyAmazingBot'
        return "xSaikatBot";
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        return "1153525992:AAGLeLK-KcKkO2VPSm6Wk-q_cS8SaibRn9s";
    }
}