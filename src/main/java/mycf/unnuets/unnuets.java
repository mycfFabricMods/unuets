package mycf.unnuets;

import mycf.unnuets.food_components.food_components;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class unnuets implements ModInitializer {

	public static final String modid = "unnuets";

	public static final Item COOKED_EGG = new Item(new Item.Settings().fireproof().food(food_components.COOCKED_EGG_COMPONENT).group(ItemGroup.FOOD));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(modid, "cooked_egg"), COOKED_EGG);
	}
}
