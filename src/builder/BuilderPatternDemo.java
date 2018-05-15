package builder;

/**
 * 建站者模式使用实例
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItem();
        System.out.println("Total Cost:"+vegMeal.getCost());

        Meal noVegMeal = mealBuilder.prepareNonVegMeal();
        noVegMeal.showItem();
        System.out.println("Total Cost:"+noVegMeal.getCost());

    }
}
