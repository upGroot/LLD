package LLD.VendingMachineLLD;

public class Inventory {
    public ItemShelf[] itemShelves;
    int size;
    public Inventory(int size) {
        this.itemShelves = new ItemShelf[size];
        this.size = size;
    }
    public void setInventory(ItemShelf itemShelf[]) {
        this.itemShelves = itemShelf;
    }
    public void addEmptyInventory() {
        int startCode = 101;
        for(int i = 0; i < size; i++) {
            ItemShelf shelf = new ItemShelf();
            shelf.setAvailable(false);
            shelf.setItemCode(startCode);
            itemShelves[i] = shelf;
            startCode ++;
        }
    }
    public void addItem(Item item, int codeNumber) throws Exception{
        for(ItemShelf itemShelf : itemShelves) {
            if (itemShelf.getItemCode() == codeNumber) {
                if (!itemShelf.isAvailable())
                {
                    itemShelf.setItem(item);
                    itemShelf.setAvailable(true);
                }
                else throw new Exception("Item already present in this slot");
            }
        }
    }
    public Item getItem(int codeNumber) throws Exception {

        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.getItemCode() == codeNumber) {
                if (!itemShelf.isAvailable()) {
                    throw new Exception("item already sold out");
                } else {
                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.getItemCode() == codeNumber) {
                itemShelf.setAvailable(false);
            }
        }
    }

}
