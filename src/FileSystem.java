import Model.Drive;
import Model.Entity;
import Model.Folder;

import java.util.HashMap;

public class FileSystem {

    static HashMap<String,Drive> drives = new HashMap<>();

    public static void main(String[] args) {
        Drive C_drive = new Drive("C");
        Drive D_drive = new Drive("D");
        Drive E_drive = new Drive("E");
        drives.put("C",C_drive);
        drives.put("D",D_drive);
        drives.put("E",E_drive);

    }

    public void move(String source,String destination){

        Folder source_folder = getFolder(source);
        Folder dest_folder = getFolder(destination);
        if (dest_folder == null){//in case of destination is drive
            Drive dest_drive = drives.get(destination.split("\\\\")[0]);
            dest_drive.folders.put(source_folder.name,source_folder);
        }
        if (!dest_folder.folders.containsKey(source_folder.name)){
            dest_folder.folders.put(source_folder.name,source_folder);
        }else {
            System.out.println("error. Folder exist in destination");
        }
    }

    private Folder getFolder(String path){
        String[] paths = path.split("\\\\");
        Drive drive = drives.get(paths[0]);
        Folder folder = null;
        for(int i=1;i<paths.length;i++){
            if (i==1){
                folder = drive.folders.get(paths[i]);
            }else {
                folder = folder.folders.get(paths[i]);
            }
        }
        return folder;
    }

    private Object getParent(Entity parent){
        String[] paths = path.split("\\\\");
        paths[paths.length-2]
    }
}
