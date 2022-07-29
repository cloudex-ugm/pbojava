class AlphabeticalOrderIterator{

    private WordsCollection _collection;
    private int _position = -1;
    private boolean _reverse = false;

    public AlphabeticalOrderIterator(WordsCollection collection, boolean reverse){
        this._collection = collection;
        this._reverse = reverse;

        if (reverse){
            this._position = collection.getItems().size();
        }
    }

    public Object Current(){
        return this._collection.getItems().get(_position);
    }

    public int Key(){
        return this._position;
    }

    public boolean MoveNext(){
        int updatedPosition = this._position + (this._reverse ? -1 : 1);

        if (updatedPosition >= 0 && updatedPosition < this._collection.getItems().size()){
            this._position = updatedPosition;
            return true;
        }
        else{
            return false;
        }
    }

    public void Reset(){
        this._position = this._reverse ? this._collection.getItems().size() -1 : 0;
    }
}