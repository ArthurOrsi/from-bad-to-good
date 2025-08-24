package arthurori.from.bad.to.good;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FromBadToGood implements ModInitializer {
	// Defina o MOD_ID para corresponder ao ID no seu fabric.mod.json
	public static final String MOD_ID = "from-bad-to-good"; // Verifique se este é o ID correto
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("From Bad To Good Mod foi carregado!");
	}
}
