public  abstract class Birds  extends Animals{
   protected String sredaViscj;
        public Birds(int age, String name,String sredaViscj) {
            super(age, name);
            this.sredaViscj=sredaViscj==null?"NON":sredaViscj;


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
    public String toString() {
        return "Birds{" +
                "sredaViscj='" + sredaViscj + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+this.getClass();
    }
}
