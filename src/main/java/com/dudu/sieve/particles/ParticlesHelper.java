package com.dudu.sieve.particles;

import net.minecraft.Block;
import net.minecraft.Icon;
import net.minecraft.Minecraft;
import net.minecraft.World;

public class ParticlesHelper {

    public static void spawnSieveParticles(World world, int x, int y, int z, int blockID, int blockMeta) {
        Block block = Block.blocksList[blockID];
        if (block != null) {
            Icon icon = block.getIcon(0, blockMeta);

            for (int i = 0; i < 4; i++) {
                ParticleSieve dust = new ParticleSieve(
                    world,
                    x + 0.8d * world.rand.nextFloat() + 0.15d,
                    y + 0.69d,
                    z + 0.8d * world.rand.nextFloat() + 0.15d,
                    0.0d, 0.0d, 0.0d,
                    icon
                );

                Minecraft.getMinecraft().effectRenderer.addEffect(dust);
            }
        }
    }
}