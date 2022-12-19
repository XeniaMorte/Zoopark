public class Letaushie extends Animals{
       protected String typeMoving;
    public Letaushie(int age, String name,String typeMoving) {
            super(age, name);
            this.typeMoving=typeMoving==null?"NON":typeMoving;
        }

        public String getTypeMoving() {
            return typeMoving;
        }

        public void setTypeMoving(String typeMoving) {
            this.typeMoving = typeMoving;
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
        private void fly(){

        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letaushie that = (Letaushie) o;
        return age == (that.age) &&
                name.equals(that.name) && typeMoving.equals(that.typeMoving);

    }

    @Override
    public String toString() {
        return "Letaushie{" +
                "typeMoving='" + typeMoving + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+ this.getClass();
    }
}


