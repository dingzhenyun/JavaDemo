public class Emperor {
    private static Emperor e=null;
    public Emperor(){}
    public Emperor get(){
        if(e==null){
            e=new Emperor();
        }
        return e;
    }
    public void getName(){
        System.out.println("我是你爸爸");
    }

    public static void main(String []args){
        System.out.println("one");
        Emperor e1=new Emperor();
        e1.getName();
        System.out.println("two");
        Emperor e2=new Emperor();
        e2.getName();
        System.out.println("three");
        Emperor e3=new Emperor();
        e3.getName();

    }

}
