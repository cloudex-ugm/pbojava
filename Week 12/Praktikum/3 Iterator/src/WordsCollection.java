import java.util.ArrayList;
import java.util.Collections;

public class WordsCollection {
    ArrayList<String> _collection = new ArrayList<String>();
    boolean _direction = false;

    public void ReverseDirection(){
        Collections.reverse(_collection);
    }

    public ArrayList<String> getItems(){
        return _collection;
    }

    public void AddItem(String item){
        this._collection.add(item);
    }

    public AlphabeticalOrderIterator GetEnumerator(){
        return new AlphabeticalOrderIterator(this, _direction);
    }
}
