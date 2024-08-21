package LLD.InventoryManagement;

import java.util.*;

public class WareHouseController {
    List<WareHouse> wareHouses;
    WareHouseSelector wareHouseSelector;

    public WareHouseController() {
        wareHouses = new ArrayList<>();
    }

    public WareHouse selectWareHouse(WareHouseSelector wareHouseSelector, List<WareHouse> wareHouses) {
        return wareHouseSelector.selectWarehouse(wareHouses);
    }
    public void addWareHouse(WareHouse wareHouse) {
        wareHouses.add(wareHouse);
    }

    public List<WareHouse> getAllWareHouse() {
        return this.wareHouses;
    }
    public void removeWareHouse() {

    }
}
