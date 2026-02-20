package com.dudu.sieve;

import com.dudu.sieve.blocks.Blocks;
import com.dudu.sieve.blocks.models.ModelSieve;
import com.dudu.sieve.blocks.models.ModelSieveMesh;
import com.dudu.sieve.items.Items;
import com.dudu.sieve.render.RenderSieve;
import com.dudu.sieve.tileentities.TileEntitySieve;
import com.google.common.eventbus.Subscribe;
import net.xiaoyu233.fml.reload.event.*;

public class EventListener {

    @Subscribe
    public void onItemRegister(ItemRegistryEvent event) {
        Items.registerItems(event);
        Blocks.registerItemBlocks(event);
    }

    @Subscribe
    public void onRecipeRegister(RecipeRegistryEvent event) {
        Items.registerRecipes(event);
        Blocks.registerRecipes(event);
    }

    @Subscribe
    public void onTileEntityRegister(TileEntityRegisterEvent event) {
        event.register(TileEntitySieve.class,"sieve:sieve_tileentity");
    }

    @Subscribe
    public void onTileEntityRendererRegister(TileEntityRendererRegisterEvent event) {
        event.register(TileEntitySieve.class,new RenderSieve(new ModelSieve(),new ModelSieveMesh()));
    }
}