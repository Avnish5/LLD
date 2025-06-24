package z_26_inventory_management_system;

import java.util.List;

public class NearestWarehouseSelectionStrategy extends WarehouseSelectionStrategy{
    @Override
    public WareHouse selectWareHose(List<WareHouse> wareHouseList) {
        return wareHouseList.get(0);
    }
}
