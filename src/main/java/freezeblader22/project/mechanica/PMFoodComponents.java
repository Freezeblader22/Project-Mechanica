package freezeblader22.project.mechanica;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;


public class PMFoodComponents {
    
    public static final FoodComponent IBS = (new FoodComponent.Builder()).hunger(20).saturationModifier(3).statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 600, 30), 1).build();

}
