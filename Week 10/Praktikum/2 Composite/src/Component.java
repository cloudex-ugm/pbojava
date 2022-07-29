abstract class Component{
    public Component(){

    }

    public abstract String Operation();

    public void Add(Component component){
        throw new UnsupportedOperationException();
    }

    public void Remove(Component component){
        throw new UnsupportedOperationException();
    }

    public boolean IsComposite(){
        return true;
    }
}