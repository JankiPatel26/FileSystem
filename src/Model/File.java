package Model;

public class File extends Entity{
    private String content;
    private int size;

    public File(String name,Entity parent,String content){
        super(name,parent);
        this.content=content;
        this.size=content.length();
    }

    @Override
    public int size() {
        return size;
    }
}
