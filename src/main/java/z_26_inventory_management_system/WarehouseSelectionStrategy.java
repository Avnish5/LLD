package z_26_inventory_management_system;

import java.util.List;

public abstract  class WarehouseSelectionStrategy {
    public  abstract WareHouse selectWareHose(List<WareHouse> wareHouseList);
}
