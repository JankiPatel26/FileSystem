package Model;

import java.util.HashMap;
import java.util.Map;

public class Folder extends Entity{

    public HashMap<String,File> files;
    public HashMap<String,Folder> folders;

    public Folder(String name,Entity parent){
        super(name,parent);
        this.files = new HashMap<>();
        this.folders = new HashMap<>();
    }

    public int size() {
        int size = 0;
        for (Map.Entry<String, File> entry : files.entrySet()) {
            size += entry.getValue().size();
        }
        for (Map.Entry<String, Folder> entry : folders.entrySet()) {
            size += entry.getValue().size();
        }
        return size;
    }
}
