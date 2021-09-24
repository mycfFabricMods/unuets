package mycf.unnuets;

import mycf.unnuets.block.RubyClusterBlock;
import mycf.unnuets.food_components.FoodComponents;
import mycf.unnuets.item.RubyItem;
import mycf.unnuets.item.UnnuetsToolMaterials;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.tools.Tool;

public class unnuets implements ModInitializer {

	public static final String modid = "unnuets";

	public static final Item COOKED_EGG = new Item(new Item.Settings().fireproof().food(FoodComponents.COOKED_EGG_COMPONENT).maxCount(15).group(ItemGroup.FOOD));
	public static final Item RUBY = new RubyItem(new Item.Settings().fireproof().group(ItemGroup.MISC));
	public static final Block RUBY_CLUSTER = registerBlocks("ruby_cluster", new RubyClusterBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)
			.luminance(state -> 6)
			.strength(10.0f)));

	// cool one time use sword or something
	public static final SwordItem EGG_SWORD = new SwordItem(UnnuetsToolMaterials.EggToolMaterial.INSTANCE, 5, 5f, new Item.Settings().group(ItemGroup.FOOD));
	public static final ToolItem RUBY_TOOL = new ToolItem(UnnuetsToolMaterials.RubyToolMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(modid, "cooked_egg"), COOKED_EGG);
		Registry.register(Registry.ITEM, new Identifier(modid, "ruby"), RUBY);
		Registry.register(Registry.ITEM, new Identifier(modid, "egg_sword"), EGG_SWORD);
		Registry.register(Registry.ITEM, new Identifier(modid, "ruby_tool"), RUBY_TOOL);
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
/* TODO
create utility classes and methods for better registry of items and blocks and blockitems
create more art for all the stuff
*/