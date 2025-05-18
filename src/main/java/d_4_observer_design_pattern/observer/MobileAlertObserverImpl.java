package d_4_observer_design_pattern.observer;

import d_4_observer_design_pattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"product is in stock now");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("hey " + userName + ", " + msg);
    }
}
