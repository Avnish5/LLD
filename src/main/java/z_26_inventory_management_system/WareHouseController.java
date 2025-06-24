package z_26_inventory_management_system;

import java.util.List;

public class WareHouseController {

    List<WareHouse> wareHouseList;
    WarehouseSelectionStrategy warehouseSelectionStrategy;

    public WareHouseController(List<WareHouse> wareHouseList, WarehouseSelectionStrategy warehouseSelectionStrategy) {
        this.wareHouseList = wareHouseList;
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    }

    public void addWareHouse(WareHouse wareHouse) {
        wareHouseList.add(wareHouse);
    }

    public void removeWareHouse(WareHouse wareHouse) {
        wareHouseList.remove(wareHouse);
    }

    public WareHouse selectWareHose(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
        return warehouseSelectionStrategy.selectWareHose(wareHouseList);
    }
}
