package Model;

public abstract class Entity {
    public String name;
    public Entity parent;

    public Entity(String name,Entity parent){
        this.name = name;
        this.parent = parent;
    }


    public abstract int size();

    public String getPath(){
        if (parent == null){
            return name;
        }
        return parent.getPath()+ "/" + name;
    }
}
