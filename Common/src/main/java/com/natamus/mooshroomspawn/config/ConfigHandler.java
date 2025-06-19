package com.natamus.mooshroomspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.mooshroomspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceCowIsMooshroom = 0.05;

	public static void initConfig() {
		configMetaData.put("chanceCowIsMooshroom", Arrays.asList(
			"The chance a cow that has spawned is of the mooshroom variant."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}