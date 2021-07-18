package mycf.unnuets.food_components;

import net.minecraft.item.FoodComponent;

public class FoodComponents {
    public static final FoodComponent COOKED_EGG_COMPONENT = (new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(0.4f).build());
}
