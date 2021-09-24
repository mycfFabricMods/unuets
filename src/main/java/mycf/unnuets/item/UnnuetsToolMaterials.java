package mycf.unnuets.item;

import mycf.unnuets.unnuets;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class UnnuetsToolMaterials {
    public static class RubyToolMaterial implements ToolMaterial {

        public static final RubyToolMaterial INSTANCE = new RubyToolMaterial();

        @Override
        public int getDurability() {
            return 255;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 4; // I acutally didnt check what the vanilla Items have so idk if this is very bad or ok
        }

        @Override
        public float getAttackDamage() {
            return 12; // see above comment
        }

        @Override
        public int getEnchantability() {
            return 4; // see other comments above
        }

        @Override
        public int getMiningLevel() {
            return 4; // I think thats the best out there?
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(unnuets.RUBY);
        }
    }

    public static class EggToolMaterial implements ToolMaterial {

        public static final EggToolMaterial INSTANCE = new EggToolMaterial();

        @Override
        public int getDurability() {
            return 1;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 1000;
        }

        @Override
        public float getAttackDamage() {
            return 1000;
        }

        @Override
        public int getMiningLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return 4;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.EGG);
        }
    }
}
