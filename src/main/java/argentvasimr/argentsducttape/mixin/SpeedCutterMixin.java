package argentvasimr.argentsducttape.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Entity.class)
public abstract class SpeedCutterMixin {
	@WrapMethod(method = "move")
	private void cutSpeed(double xd, double yd, double zd, Operation<Void> original) {
		if ((Object)this instanceof Player player && !player.isInWater()) {
			if (Math.abs(xd) < 0.005) xd = 0;
			if (Math.abs(zd) < 0.005) zd = 0;
		}
		original.call(xd, yd, zd);
	}
}
