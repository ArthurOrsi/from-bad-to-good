package arthurori.from.bad.to.good.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // A mesma lógica de antes: Carne de Zumbi -> Couro
        RecipeProvider.offerSmelting(
                exporter,
                List.of(Items.ROTTEN_FLESH),
                RecipeCategory.MISC,
                Items.LEATHER,
                0.25f,
                200,
                "leather_from_smelting_rotten_flesh"
        );
    }
}
