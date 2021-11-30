public class Main {


    public static void main(String[] args) {

            Cat[] cats = new Cat [2];
            cats[0] = new Cat("Sancho", 5, 10, 15);
            cats[1] = new Cat("Capone", 10, 15, 20 );
            Plate plate = new Plate(100);
        System.out.println("голодные Коты едят");
        for (Cat i: cats){
            if(i.getSatisfying() == 0){
                if(!plate.checkFood(i.getAppetite())){
                    plate.increaseFood();
                }
                i.eat(plate);
                System.out.println("Коты съели");
            }

            i.setSatisfying(i.getSatisfying() - 1);

        }

        System.out.println("Коты доели");
           /* plate.info();
            cats.eat(plate);
            cats.eat(plate);
            plate.info();*/
        }





}





    /*Cat catCurt = new Cat("Curt",5, 20, 30);

        Cat catAnatoliy = new Cat("Anatoliy", 10, 30, 40);

        Plate plateCurt = new Plate(100);
        Plate plateAnatoliy = new Plate(100);
        plateCurt.info();
        catCurt.eat(plateCurt);
        plateCurt.info();
        plateAnatoliy.info();
        catAnatoliy.eat(plateAnatoliy);
        plateAnatoliy.info();

    }
}*/
