import hygiene.*;
import child.*;
import drink.*;
import food.*;
import product.*;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();

        Product oatMilk = new Milk("Oat drink.Milk", 2.19, 5, "pkg", 1, 0.1f, "20.07.23");
        Product lemPear = new Lemonade("Pear lemonade", 1.10, 7, "btl", 0.5f);
        Product borBread = new Bread("food.Bread 'Borodinsky'", 0.90, 20, "pcs", "20.01.23",
                "Higher");
        Product eggElite = new Egg("Eggs 'Elite'", 2.90, 10, "pkg", "02.02.23", 8);
        Product medMask = new Mask("Medical hygiene.Mask", 6.99, 10, "pkg", 50);
        Product toilPapLam = new ToiletPaper("Toilet paper 'Lambi'", 1.99, 10, "pkg", 8,
                3);
        Product diaPmpXL = new Diaper("Pampers", 10.99, 10, "pkg", 20, "XL",
                3.5f, 7.8f, "Disposable");
        Product pacClas = new Pacifier("child.Pacifier 'Classic'", 0.59, 10, "pc", 0, true);

        program.getProductData(oatMilk);
        program.getProductData(lemPear);
        program.getProductData(borBread);
        program.getProductData(eggElite);
        program.getProductData(medMask);
        program.getProductData(toilPapLam);
        program.getProductData(diaPmpXL);
        program.getProductData(pacClas);

    }
}
