import java.util.Locale;

public class Item implements IItem{
    private String itemName;

    public Item() {
    }

    public Item(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void printName() {
        System.out.println(itemName);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean IsMultimediaItem() {
        String name = itemName;
        String suffix[] = {".MP3", ".MP4", ".WAV", ".MIDI",".AVI", ".DAT", ".MPEG"};
        for (String sf: suffix
             ) {
            if(name.toUpperCase().endsWith(sf)) return true;
        }
        return false;
    }

    @Override
    public int CountMultimediaItem() {
        if(this.IsMultimediaItem())
        return 1;
        else return 0;
    }
}
