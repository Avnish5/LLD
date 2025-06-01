package w_23_facade_design_pattern.Notification;

public class NotificationServiceImpl implements NotificationService{public void sendConfirmation(String userEmail) {
    System.out.println("Sending order confirmation to: " + userEmail);
}

}
