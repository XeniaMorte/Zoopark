public class Travoyadny extends Mlekopit {
    String eattYpe;

    public Travoyadny(int age, String name, String eattYpe) {
        super(age, name, eattYpe);
        this.eattYpe = eattYpe == null ? "NON" : eattYpe;

    }

    public String getEattYpe() {
        return eattYpe;
    }

    public void setEattYpe(String eattYpe) {
        this.eattYpe = eattYpe;
    }

    protected void pastis() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travoyadny that = (Travoyadny) o;
        return age == (that.age) &&
                name.equals(that.name) && eattYpe.equals(that.eattYpe);

    }

    @Override
    public String toString() {
        return "Travoyadny{" +
                "eattYpe='" + eattYpe + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+ this.getClass();
    }
}
