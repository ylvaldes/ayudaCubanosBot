package ayudaCubanosBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class Bot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		System.out.println(update.getMessage().getFrom().getFirstName()+" " + update.getMessage().getText());
		SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
		sendMessage.setText("Hola " + update.getMessage().getFrom().getFirstName()+"\n" + update.getMessage().getText());
		
		try {
			execute(sendMessage);
		} catch (TelegramApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "AyudaCubanosBot";
	}

	@Override
	public String getBotToken() {
		return "792164501:AAFU9T6IVVxuyrnTdb3y1Z1weyQ34rNgoRg";
	}

}
