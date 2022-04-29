package freezeblader22.project.mechanica;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialRefinedStone implements ToolMaterial {
 
 public static final ToolMaterialRefinedStone INSTANCE = new ToolMaterialRefinedStone();

    @Override
    public float getAttackDamage() {
        return 2.5f;
        
    }

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 6.0f;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(ProjectMechanica.REFINED_STONE);
    }
}
