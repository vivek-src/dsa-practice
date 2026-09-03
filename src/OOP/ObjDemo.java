package OOP;


public class ObjDemo {
    static void main() {
        ObjectDemo obj = new ObjectDemo(100);
        ObjectDemo obj2 = new ObjectDemo(100);

        System.out.println(obj.hashCode()); //Gives unique representation on an obj with a number

        System.out.println(obj.equals(obj2));// Overridden .equals to check for id not hashcode

        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj.getClass());


    }
}

class ObjectDemo{
    int id;
    ObjectDemo(int id){
        this.id = id;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((ObjectDemo)obj).id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//Returns String
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//Deprecated
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}