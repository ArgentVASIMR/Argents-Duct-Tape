package argentvasimr.argentsducttape;

import argentvasimr.argentsducttape.mixin.DispatcherAccessor;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.generic.BlockModelGeneric;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;

import java.util.Map;

import static net.minecraft.client.render.block.model.BlockModelDispatcher.loadDataModel;

public class ModModels {
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		@SuppressWarnings("unchecked") Map<Block<?>, BlockModel<?>> dispatches = ((DispatcherAccessor<Block<?>, BlockModel<?>>) (Object) dispatcher).getDispatches();
		dispatches.put(Blocks.CACTUS, new BlockModelGeneric(Blocks.CACTUS, loadDataModel("minecraft:block/cactus")).forceCullSelf(true));
	}
}
