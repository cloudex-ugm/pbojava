import java.util.ArrayList;

class Composite extends Component {
    protected ArrayList<Component> _children = new ArrayList<Component>();

    public void Add(Component component){
        this._children.add(component);
    }

    public void Remove(Component component){
        this._children.remove(component);
    }

    public String Operation(){
        int i = 0;
        String result = "Branch(";

        for (var component : this._children){
            result += component.Operation();
            if (i != this._children.size() - 1){
                result += "+";
            }
            i++;
        }
        return result + ")";
    }
}
