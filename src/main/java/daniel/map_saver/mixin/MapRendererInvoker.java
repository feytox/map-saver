package daniel.map_saver.mixin;

import net.minecraft.client.render.MapRenderer;
import net.minecraft.item.map.MapState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(MapRenderer.class)
public interface MapRendererInvoker {

    @Invoker("getMapTexture")
    MapRenderer.MapTexture invokeGetMapTexture(int id, MapState state);
}
