package com.serilum.mooshroomspawn;

import com.natamus.collective.objects.SAMObject;
import com.serilum.mooshroomspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityTypes;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityTypes.COW, EntityTypes.MOOSHROOM, null, ConfigHandler.chanceCowIsMooshroom, false, false, false);
	}
}