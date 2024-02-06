public class FacultyName implements Course{
    public String names[]={"Kiya","Riddhi","Sneha","Kavya","Mahi"};

    @Override
    public Dept getdept() {
        return new Name();
    }
    private class Name implements Dept{
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
