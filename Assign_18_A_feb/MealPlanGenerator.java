public class PersonalizedMealPlanGenerator {
public static void main(String[] args) {
Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());
System.out.println("Generated Meal Plan: " + vegetarianMeal.getMealPlan().getPlanType());
System.out.println("Generated Meal Plan: " + veganMeal.getMealPlan().getPlanType());
System.out.println("Generated Meal Plan: " + ketoMeal.getMealPlan().getPlanType());
System.out.println("Generated Meal Plan: " + highProteinMeal.getMealPlan().getPlanType());
MealPlanValidator.validateMealPlan(vegetarianMeal);
MealPlanValidator.validateMealPlan(veganMeal);
MealPlanValidator.validateMealPlan(ketoMeal);
MealPlanValidator.validateMealPlan(highProteinMeal);
}
interface MealPlan {
String getPlanType();
}
static class VegetarianMeal implements MealPlan {
@Override
public String getPlanType() {
return "Vegetarian Meal Plan";
}
}
static class VeganMeal implements MealPlan {
@Override
public String getPlanType() {
return "Vegan Meal Plan";
}
}
static class KetoMeal implements MealPlan {
@Override
public String getPlanType() {
return "Keto Meal Plan";
}
}
static class HighProteinMeal implements MealPlan {
@Override
public String getPlanType() {
return "High-Protein Meal Plan";
}
}
static class Meal<T extends MealPlan> {
private T mealPlan;
public Meal(T mealPlan) {
this.mealPlan = mealPlan;
}
public T getMealPlan() {
return mealPlan;
}
}
static class MealPlanValidator {
public static <T extends MealPlan> void validateMealPlan(Meal<T> meal) {
System.out.println("Validating: " + meal.getMealPlan().getPlanType() + " - Validation Successfulx");
}
}
}

