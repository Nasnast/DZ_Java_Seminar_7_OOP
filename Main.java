/*Реализуйте класс Товар,-> String name, double cost + getter/setter
содержащий данные о товаре,
и ТорговыйАвтомат, содержащий -> ArrayList<Product> + initProducts + getProduct
в себе методы initProducts (List <Product>)
сохраняющий в себе список исходных продуктов
и getProduct(String name) */

/*Сделать класс Товар абстрактным, 
создать нескольких наследников (к примеру: БутылкаВоды), 
сделать интерфейсом ТорговыйАвтомат и реализовать класс 
какого-то одного типа ТорговогоАвтомата 
(пример: ПродающийБутылкиВодыАвтомат */
package temp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new BattleOfWater("квас", 1.0);
        Product prod2 = new BattleOfWater("молоко", 3.0);
        Product prod3 = new BattleOfWater("кофе", 5.0);
        Product prod4 = new BattleOfWater("кефир", 4.0);

        ProductMashineWater prodAuto = new ProductMashineWater();

        prodAuto.initProducts(List.of(prod1, prod2, prod3, prod4));

        System.out.println(prodAuto.getList());
        System.out.println(prodAuto.getProduct("квас"));

        Product prod8 = new HotDrink("чай", 5.5, 90, 300);
        Product prod6 = new HotDrink("горячее молоко", 7.1, 60, 200);
        Product prod7 = new HotDrink("латте", 10.1, 80, 400);
        Product prod5 = new HotDrink("вода", 10.1, 100, 400);

        HotDrinkMashine hotDrinkAuto = new HotDrinkMashine();
        List<HotDrink> hotDrink = new ArrayList(Arrays.asList(prod5, prod6, prod7, prod8));
        hotDrinkAuto.initProducts(hotDrink);
        // hotDrinkAuto.initProducts(List.of(prod5, prod6, prod7));
        System.out.println(hotDrinkAuto.getList() + "\n");

        System.out.println("Поиск по наименованию -> " +
                hotDrinkAuto.getProduct("чай") + "\n");
        System.out.println("Поиск по температуре -> " + hotDrinkAuto.getProduct(100) +
                "\n");
        System.out.println("Поиск по цене -> " + hotDrinkAuto.getProduct(5.5) +
                "\n");
    }
}
