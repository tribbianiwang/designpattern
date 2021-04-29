package designpattern.iterator;

public class NameResponsity implements Container{
    String names[] = new String[]{"file","edit","view","navigate","code","analyze"};



    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator{
        int index=0;
        @Override
        public boolean hasNext() {
            if(index==(names.length-1)){
                return false;
            }else{
                return true;
            }


        }

        @Override
        public Object next() {
            if(hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}


