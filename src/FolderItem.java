import java.util.ArrayList;
import java.util.List;

public class FolderItem implements IItem{
    private String itemName;
    private List<IItem> itemChild = new ArrayList<>();

    public FolderItem() {
    }

    public FolderItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void addItem(IItem item){
        itemChild.add(item);
    }
    public void removeItem(IItem item){
        itemChild.remove(item);
    }
    public List<IItem> getItem(){
        return itemChild;
    }

    @Override
    public void printName() {
        System.out.println(itemName);
        for (IItem item: itemChild
             ) {
            if(item.IsMultimediaItem())
            item.printName();
        }
    }

    @Override
    public boolean IsMultimediaItem() {
        for (IItem item: itemChild
             ) {
            if(item.IsMultimediaItem())
                return true;
        }
        return false;
    }

    @Override
    public int CountMultimediaItem() {
        if(this.IsMultimediaItem()){
            int count = 0;
            for (IItem item: itemChild
            ) {
                if(item.IsMultimediaItem())
                    count += item.CountMultimediaItem();
            }
            return count;
        }
        return 0;
    }
}
