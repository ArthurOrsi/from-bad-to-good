package arthurori.from.bad.to.good;

import arthurori.from.bad.to.good.datagen.ModRecipeProvider; // Importe a nova classe
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FromBadToGoodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		// Adicione esta linha para registrar seu provedor de receitas
		pack.addProvider(ModRecipeProvider::new);
	}
}
