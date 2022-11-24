public class Zemnovodniye extends Animals{
   protected String sredaViscj;
    public Zemnovodniye(int age, String name,String sredaViscj) {
        super(age, name);
        this.sredaViscj=sredaViscj==null?"NON":sredaViscj;
    }

    public void setSredaViscj(String sredaViscj) {
        this.sredaViscj = sredaViscj;
    }

    public String getSredaViscj() {
        return sredaViscj;
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
    protected void ohota(){

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zemnovodniye that = (Zemnovodniye) o;
        return age == (that.age) &&
                name.equals(that.name) && sredaViscj.equals(that.sredaViscj);

    }

    @Override
    public String toString() {
        return "Zemnovodniye{" +
                "sredaViscj='" + sredaViscj + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+
                this.getClass();
    }
}
