package mycf.unnuets;

import mycf.unnuets.block.RubyClusterBlock;
import mycf.unnuets.food_components.FoodComponents;
import mycf.unnuets.item.RubyItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class unnuets implements ModInitializer {

	public static final String modid = "unnuets";

	public static final Item COOKED_EGG = new Item(new Item.Settings().fireproof().food(FoodComponents.COOKED_EGG_COMPONENT).group(ItemGroup.FOOD));
	public static final Item RUBY = new RubyItem(new Item.Settings().fireproof().group(ItemGroup.MISC));
	public static final Block RUBY_CLUSTER = registerBlocks("ruby_cluster", new RubyClusterBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)
			.luminance(state -> 6)
			.strength(10.0f)));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(modid, "cooked_egg"), COOKED_EGG);
		Registry.register(Registry.ITEM, new Identifier(modid, "ruby"), RUBY);
	}

	/*
	Method which automatically registers blocks + block items to the BUILDING BLOCKS group
	 */
	public static Block registerBlocks(String id, Block block) {
		Item blockItem = new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
		Registry.register(Registry.ITEM, new Identifier(modid, id), blockItem);
		return Registry.register(Registry.BLOCK, new Identifier(modid, id), block);
	}
}
