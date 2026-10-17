package com.serilum.mooshroomspawn;

import com.natamus.collective.globalcallbacks.ConfigCallback;
import com.natamus.collective.objects.SAMObject;
import com.serilum.mooshroomspawn.config.ConfigHandler;
import com.serilum.mooshroomspawn.util.Reference;
import net.minecraft.world.entity.EntityTypes;

public class ModCommon {
	private static SAMObject samObject;

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		samObject = new SAMObject(EntityTypes.COW, EntityTypes.MOOSHROOM, null, ConfigHandler.chanceCowIsMooshroom, false, false, false, false, false, Integer.MAX_VALUE);

		ConfigCallback.CONFIG_CHANGED.register((String modid) -> {
			if (!modid.equals(Reference.MOD_ID)) {
				return;
			}

			samObject.changeChance = ConfigHandler.chanceCowIsMooshroom;
		});
	}
}