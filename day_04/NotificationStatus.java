package day_04;

public class NotificationStatus {

	public void sendNotification(String _type) {
		System.out.println("Notification.Bug free()");

		if (_type.equalsIgnoreCase("sms")) {
			sendSMS();

		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();

		} else if (_type.equalsIgnoreCase("whatsApp")) {
			whatsApp();

		} else {
			phone();
		}

	}

	private void sendSMS() {
		System.out.println("Enter in sendSMS Method().Start()");
		System.out.println("Enter in sendSMS Method().End()");

	}

	private void sendEmail() {
		System.out.println("Enter in sendEmail Method().Start()");
		System.out.println("Enter in sendEmail Method().End()");
	}

	private void whatsApp() {
		System.out.println("Enter in whatsApp Method().Start()");
		System.out.println("Enter in whatsApp Method().End()");
	}

	private void phone() {
		System.out.println("Enter in phone Method().Start()");
		System.out.println("Enter in phone Method().End()");
	}
}
