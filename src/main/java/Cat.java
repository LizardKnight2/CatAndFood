public class Cat {
    private String name;
    private int appetite;



    private int satisfying;
    private int desire;
    public Cat(String name, int appetite, int satisfying, int desire) {
        this.name = name;
        this.appetite = appetite;
        this.satisfying = satisfying;
        this.desire = desire;
    }

    String getName(){
        return name;
    }

    int getAppetite(){
        return appetite;
    }

    int getSatisfying(){
        return satisfying;
    }
    public void setSatisfying(int satisfying) {
        this.satisfying = satisfying;
    }

    int getDesire(){
        return desire;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

}










/*private String name;
    private int appetite;
    private int satisfying;
    private int desire;


    public Cat(String name, int appetite, int satisfying, int desire) {
        this.name = name;
        this.appetite = appetite;
        this.satisfying = satisfying;
        this.desire = desire;
    }
}*/

   

