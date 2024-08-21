package LLD.InventoryManagement;

import java.util.*;

public class CheapestWareHouse extends WareHouseSelector{
    @Override
    public WareHouse selectWarehouse(List<WareHouse> wareHouses) {
        return wareHouses.get(0);
    }
}
