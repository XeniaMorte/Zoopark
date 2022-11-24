public abstract class Mlekopit extends Animals{
    protected String eattYpe;
    public Mlekopit(int age, String name, String eattYpe){
        super(age, name);
        this.eattYpe=eattYpe==null?"NON":eattYpe;

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    protected void walking(){

    }
}
