package com.TelegramBot.EraserHead;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main {
  public static void main(String[] args) throws TelegramApiRequestException {
      // Initialize Api Context
      ApiContextInitializer.init();

      // Instantiate Telegram Bots API
      TelegramBotsApi botsApi = new TelegramBotsApi();

      // Register our bot
		botsApi.registerBot(new Commands());
  }
}

