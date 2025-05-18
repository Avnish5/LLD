package d_4_observer_design_pattern;

import d_4_observer_design_pattern.observable.IphoneObservableImpl;
import d_4_observer_design_pattern.observable.StockObservable;
import d_4_observer_design_pattern.observer.EmailAlertObserverImpl;
import d_4_observer_design_pattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("avnish@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("naresh@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz_usernme", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }



}
