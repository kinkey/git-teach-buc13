public class Cutie<T extends Masina> {
    //todo vezi de ce nu merge
        // t super Masina
    private T thingyInBox;

    public T takeFromBox(){
        return thingyInBox;
    }

    public void putInBox(T thing){
        thingyInBox = thing;
    }
}
