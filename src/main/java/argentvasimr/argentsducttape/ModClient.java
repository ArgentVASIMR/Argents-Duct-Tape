package argentvasimr.argentsducttape;

import net.fabricmc.api.ClientModInitializer;
import turniplabs.halplibe.event.defs.ClientEvents;
import turniplabs.halplibe.util.dependency.Key;

import static argentvasimr.argentsducttape.Main.MOD_ID;

public class ModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ClientEvents.BLOCK_MODEL_RELOAD.listen(Key.of(MOD_ID),(t)->new ModModels().initBlockModels(t));
	}
}
