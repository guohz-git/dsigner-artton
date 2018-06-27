package iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    private class NameInterator implements Interator{
        int index;
        @Override
        public boolean hasNext() {
           if(index < names.length){
               return true;
           }else{
               return false;
           }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
    @Override
    public Interator getInterator() {
        return new NameInterator();
    }
}
