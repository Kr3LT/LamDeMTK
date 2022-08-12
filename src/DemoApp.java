import java.util.ArrayList;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        List<IItem> itemList = new ArrayList<>();
        itemList.add(new Item("Sample.pptx"));
        itemList.add(new Item("tep 5.wav"));
        itemList.add(new Item("Thong Ke.xlsx"));
        FolderItem thumuc1 = new FolderItem("Thu muc 1");
        thumuc1.addItem(new Item("tep 1.lyrics"));
        thumuc1.addItem(new Item("tep 1.mp3"));
        thumuc1.addItem(new Item("tep 2.avi"));
        thumuc1.addItem(new Item("tep 4.mp4"));
        FolderItem thumuc11 = new FolderItem("Thu muc 1.1");
        thumuc11.addItem(new Item("tep 3.mp3"));
        thumuc11.addItem(new Item("tep 4.txt"));
        thumuc1.addItem(thumuc11);
        FolderItem thumuc12 = new FolderItem("Thu muc 1.2");
        thumuc12.addItem(new Item("tep 6.mp3.txt"));
        thumuc1.addItem(thumuc12);
        itemList.add(thumuc1);
        itemList.add(new FolderItem("Thu muc 2"));
        for (IItem items: itemList
             ) {
            if(items.IsMultimediaItem()) items.printName();
        }
        System.out.println("So luong tap tin da phuong tien duoc chua: " + itemList.get(itemList.indexOf(thumuc1)).CountMultimediaItem());

    }
}
