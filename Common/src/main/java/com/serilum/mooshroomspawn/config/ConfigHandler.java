package com.serilum.mooshroomspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.serilum.mooshroomspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceCowIsMooshroom = 0.05;
	@Entry public static boolean onlySpawnMooshroomsOnSurface = false;
	@Entry(registry = "dimension") public static String dimensionsToSpawnIn = "";
	@Entry(registry = "worldgen/biome") public static String biomesToSpawnIn = "";

	public static void initConfig() {
		configMetaData.put("chanceCowIsMooshroom", Arrays.asList(
			"The chance a cow that has spawned is of the mooshroom variant."
		));
		configMetaData.put("onlySpawnMooshroomsOnSurface", Arrays.asList(
			"When enabled, mooshrooms will only spawn on the surface."
		));
		configMetaData.put("dimensionsToSpawnIn", Arrays.asList(
			"Dimensions in which cows can turn into mooshrooms, separated by a comma. Leave empty for every dimension. For example: 'minecraft:overworld'."
		));
		configMetaData.put("biomesToSpawnIn", Arrays.asList(
			"Biomes in which cows can turn into mooshrooms, separated by a comma. Biome tags work too, starting with a '#'. Leave empty for every biome. For example: 'minecraft:plains,#minecraft:is_forest'."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}