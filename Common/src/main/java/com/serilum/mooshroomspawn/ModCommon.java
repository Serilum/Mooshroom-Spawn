package com.serilum.mooshroomspawn;

import com.natamus.collective.objects.SAMObject;
import com.serilum.mooshroomspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityType;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityType.COW, EntityType.MOOSHROOM, null, ConfigHandler.chanceCowIsMooshroom, false, false, false);
	}
}