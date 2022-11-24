public abstract class Animals {
    protected String name;
   protected int age;


    public Animals(int age,String name) {
        this.age = age==0?1: age;
        this.name=name==null?"NON":name;

    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void go();


}
