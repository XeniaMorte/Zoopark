public class Neletaushie extends Animals{
   protected String typeMoving;
    public Neletaushie(int age, String name,String typeMoving) {
        super(age, name);
        this.typeMoving=typeMoving;
    }

    public String getTypeMoving() {
        return typeMoving;
    }

    public void setTypeMoving(String typeMoving) {
        this.typeMoving = typeMoving==null?"NON":typeMoving;
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
    public void gulyaat(){

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neletaushie that = (Neletaushie) o;
        return age == (that.age) &&
                name.equals(that.name) && typeMoving.equals(that.typeMoving);

    }

    @Override
    public String toString() {
        return "Neletaushie{" +
                "typeMoving='" + typeMoving + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+
                this.getClass();
    }
}
