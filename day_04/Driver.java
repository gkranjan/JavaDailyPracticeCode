package day_04;

public class Driver {

	public static void main(String[] args) {

		NotificationStatus obj = new NotificationStatus();

		obj.sendNotification("sms");
		obj.sendNotification("email");
		obj.sendNotification("whatsApp");
		obj.sendNotification("phone");

	}
}
