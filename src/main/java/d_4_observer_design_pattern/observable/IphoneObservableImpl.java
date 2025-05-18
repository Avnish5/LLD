package d_4_observer_design_pattern.observable;

import d_4_observer_design_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
          for (NotificationAlertObserver observer : observerList) {
              observer.update();
          }
    }

    @Override
    public void setStockCount(int newStockAdded) {
           if(stockCount == 0) {
               notifySubscribers();
        }
           stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
