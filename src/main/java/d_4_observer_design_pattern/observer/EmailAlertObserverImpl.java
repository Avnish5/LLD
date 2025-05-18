package d_4_observer_design_pattern.observer;

import d_4_observer_design_pattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMEmail(emailId, "product is in stock now");
    }

    private void sendMEmail(String emailId, String msg) {
        System.out.println("hey " + emailId + ", " + msg);
    }
}
