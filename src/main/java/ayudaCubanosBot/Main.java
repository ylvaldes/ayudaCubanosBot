package ayudaCubanosBot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main {

	public static void main(String[] args) {
		System.out.println("Prueba de Correr App");
		ApiContextInitializer.init();
		TelegramBotsApi telegramBotApi = new TelegramBotsApi();
		Bot bot= new Bot();
		try {
			telegramBotApi.registerBot(bot);
		} catch (TelegramApiRequestException e) {
			e.printStackTrace();
		}

	}

}
