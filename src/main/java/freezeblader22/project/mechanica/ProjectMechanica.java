package freezeblader22.project.mechanica;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;


public class ProjectMechanica implements ModInitializer {
	
	public static final Item SWORD = new Item(new Settings().group(ItemGroup.MISC));

	public static final Block REFINED_STONE = new Block(FabricBlockSettings.copy(Blocks.STONE));

	public static final Item IBS = new Item(new Item.Settings().group(ItemGroup.FOOD).food(PMFoodComponents.IBS));

	public static ToolItem REFINED_STONE_PICKAXE = new PickaxeBase(ToolMaterialRefinedStone.INSTANCE, 3, 1.5f, new Item.Settings().group(ItemGroup.TOOLS));
	
	@Override 
	public void onInitialize() {
	
		Registry.register(Registry.ITEM, new Identifier("projectmechanica", "sword"), SWORD);
		
		Registry.register(Registry.BLOCK, new Identifier("projectmechanica", "refined_stone"), REFINED_STONE);
		
		Registry.register(Registry.ITEM, new Identifier("projectmechanica", "refined_stone"), new BlockItem(REFINED_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		
		Registry.register(Registry.ITEM, new Identifier("projectmechanica", "ibs"), IBS);
		
		Registry.register(Registry.ITEM, new Identifier("projectmechanica", "refined_stone_pickaxe"), REFINED_STONE_PICKAXE);
	
	
	
	}
}
