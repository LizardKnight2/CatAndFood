public class Plate {
    private int food;

    int getFood(){
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood(){
        this.food += 20;
        System.out.println("Добавлено 20 единиц еды");
    }

    boolean checkFood(int n){
        return (food - n) >= 0;

    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
