package j_10_car_rental_system;

import java.util.List;

public class VehicleRentalSystem {

    List<User> userList;
    List<Store> storeList;

    VehicleRentalSystem(List<Store> stores, List<User> users) {

        this.storeList = stores;
        this.userList = users;
    }


    public Store getStore(Location location){

        //based on location, we will filter out the Store from storeList.
        return storeList.getFirst();
    }



    //addUsers

    //remove users


    //add stores

    //remove stores

}
