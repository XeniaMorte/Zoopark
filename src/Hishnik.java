public class Hishnik extends Mlekopit{

    public Hishnik(int age, String name,String eattYpe) {
        super(age, name,eattYpe);


    }
    protected void ohotitsya(){

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hishnik that = (Hishnik) o;
        return age == (that.age) &&
                name.equals(that.name) && eattYpe.equals(that.eattYpe);

    }

    @Override
    public String toString() {

        return "Hishnik{" +
                "eattYpe='" + eattYpe + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+this.getClass();
    }
}


