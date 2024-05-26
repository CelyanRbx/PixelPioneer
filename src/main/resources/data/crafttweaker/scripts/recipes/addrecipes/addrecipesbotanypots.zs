//botany pots custom json recipe example, that will allow you to plant sticks, that will grow for 30 seconds, then can be harvested for 2-4 honeycombs, and a 5% chance for 1-2 diamonds. It will display a wheat crop as its growing, and can be planted

recipes.addJsonRecipe("purple_tulip",
	{
	//The type of recipe to be used
	"type":"botanypots:crop",
	// Item to be planted, does not actually need to be a seed. This is just the item that will cause this crop to be planted.
    "seed": {
        "item": "cyclic:flower_purple_tulip",
    },
	//The type of soil that it will grow in. In this case, soul sand. This value is NOT a minecraft block ID. This is instead determined by a different botanypots recipe type, botanypots:soil
    "categories": [
        "farmland"
    ],
	//How long it takes to grow in ticks, which are 1 20th of a second. This will take 30 seconds to grow
    "growthTicks": 600,
	//This will set what the crop looks like in the pot, using the ID of a block ingame. In this case, wheat. Botanypots also seems to have a special display type for crops, that causes them to show their stages of growth, as if they were planted on farmland
    "display": {
        "block": "cyclic:flower_purple_tulip",
    },
	//The drops output after the growthticks timer finishes as an array
    "drops": [
        {
			//the chance of this output happening as a float. 1.00 represents a 100% chance
            "chance": 1.00,
			//The item output, in this case, honeycomb
            "output": {
                "item": "minecraft:purple_dye",
            },
			//How many times the botany pot will try to drop this item when harvested. In this case, it will try anywhere between 2 and 4 times, each time it will have a 100% chance of dropping a honeycomb.
            "minRolls": 2,
            "maxRolls": 4
        },
		//The square brackets [] in this value mean it is an array. An array is a collection of data, so this output can actually output more than one type of item.
        {
			//chance of this output happening as a float. 0.05 represents a 5% chance
            "chance": 0.05,
			//The item output, in this case, diamonds
            "output": {
                "item": "minecraft:purple_dye",
            },
			//How many times the botany pot will try to drop this item, in this case, it will try either one or two times, each time it will have a 5% chance of dropping a diamond
            "minRolls": 1,
            "maxRolls": 2
        }
    ]
}
);

recipes.addJsonRecipe("lime_carnation",
{
	//The type of recipe to be used
	"type":"botanypots:crop",
	// Item to be planted, does not actually need to be a seed. This is just the item that will cause this crop to be planted.
    "seed": {
        "item": "cyclic:flower_lime_carnation",
    },
	//The type of soil that it will grow in. In this case, soul sand. This value is NOT a minecraft block ID. This is instead determined by a different botanypots recipe type, botanypots:soil
    "categories": [
        "farmland"
    ],
	//How long it takes to grow in ticks, which are 1 20th of a second. This will take 30 seconds to grow
    "growthTicks": 600,
	//This will set what the crop looks like in the pot, using the ID of a block ingame. In this case, wheat. Botanypots also seems to have a special display type for crops, that causes them to show their stages of growth, as if they were planted on farmland
    "display": {
        "block": "cyclic:flower_lime_carnation",
    },
	//The drops output after the growthticks timer finishes as an array
    "drops": [
        {
			//the chance of this output happening as a float. 1.00 represents a 100% chance
            "chance": 1.00,
			//The item output, in this case, honeycomb
            "output": {
                "item": "minecraft:lime_dye",
            },
			//How many times the botany pot will try to drop this item when harvested. In this case, it will try anywhere between 2 and 4 times, each time it will have a 100% chance of dropping a honeycomb.
            "minRolls": 2,
            "maxRolls": 4
        },
		//The square brackets [] in this value mean it is an array. An array is a collection of data, so this output can actually output more than one type of item.
        {
			//chance of this output happening as a float. 0.05 represents a 5% chance
            "chance": 0.05,
			//The item output, in this case, diamonds
            "output": {
                "item": "minecraft:lime_dye",
            },
			//How many times the botany pot will try to drop this item, in this case, it will try either one or two times, each time it will have a 5% chance of dropping a diamond
            "minRolls": 1,
            "maxRolls": 2
        }
    ]
}
);

recipes.addJsonRecipe("absalon_tulip",
{
	//The type of recipe to be used
	"type":"botanypots:crop",
	// Item to be planted, does not actually need to be a seed. This is just the item that will cause this crop to be planted.
    "seed": {
        "item": "cyclic:flower_absalon_tulip",
    },
	//The type of soil that it will grow in. In this case, soul sand. This value is NOT a minecraft block ID. This is instead determined by a different botanypots recipe type, botanypots:soil
    "categories": [
        "farmland"
    ],
	//How long it takes to grow in ticks, which are 1 20th of a second. This will take 30 seconds to grow
    "growthTicks": 600,
	//This will set what the crop looks like in the pot, using the ID of a block ingame. In this case, wheat. Botanypots also seems to have a special display type for crops, that causes them to show their stages of growth, as if they were planted on farmland
    "display": {
        "block": "cyclic:flower_absalon_tulip",
    },
	//The drops output after the growthticks timer finishes as an array
    "drops": [
        {
			//the chance of this output happening as a float. 1.00 represents a 100% chance
            "chance": 1.00,
			//The item output, in this case, honeycomb
            "output": {
                "item": "minecraft:brown_dye",
            },
			//How many times the botany pot will try to drop this item when harvested. In this case, it will try anywhere between 2 and 4 times, each time it will have a 100% chance of dropping a honeycomb.
            "minRolls": 2,
            "maxRolls": 4
        },
		//The square brackets [] in this value mean it is an array. An array is a collection of data, so this output can actually output more than one type of item.
        {
			//chance of this output happening as a float. 0.05 represents a 5% chance
            "chance": 0.05,
			//The item output, in this case, diamonds
            "output": {
                "item": "minecraft:brown_dye",
            },
			//How many times the botany pot will try to drop this item, in this case, it will try either one or two times, each time it will have a 5% chance of dropping a diamond
            "minRolls": 1,
            "maxRolls": 2
        }
    ]
}
);

recipes.addJsonRecipe("cyan_rose",
{
	//The type of recipe to be used
	"type":"botanypots:crop",
	// Item to be planted, does not actually need to be a seed. This is just the item that will cause this crop to be planted.
    "seed": {
        "item": "cyclic:flower_cyan",
    },
	//The type of soil that it will grow in. In this case, soul sand. This value is NOT a minecraft block ID. This is instead determined by a different botanypots recipe type, botanypots:soil
    "categories": [
        "farmland"
    ],
	//How long it takes to grow in ticks, which are 1 20th of a second. This will take 30 seconds to grow
    "growthTicks": 600,
	//This will set what the crop looks like in the pot, using the ID of a block ingame. In this case, wheat. Botanypots also seems to have a special display type for crops, that causes them to show their stages of growth, as if they were planted on farmland
    "display": {
        "block": "cyclic:flower_cyan",
    },
	//The drops output after the growthticks timer finishes as an array
    "drops": [
        {
			//the chance of this output happening as a float. 1.00 represents a 100% chance
            "chance": 1.00,
			//The item output, in this case, honeycomb
            "output": {
                "item": "minecraft:cyan_dye",
            },
			//How many times the botany pot will try to drop this item when harvested. In this case, it will try anywhere between 2 and 4 times, each time it will have a 100% chance of dropping a honeycomb.
            "minRolls": 2,
            "maxRolls": 4
        },
		//The square brackets [] in this value mean it is an array. An array is a collection of data, so this output can actually output more than one type of item.
        {
			//chance of this output happening as a float. 0.05 represents a 5% chance
            "chance": 0.05,
			//The item output, in this case, diamonds
            "output": {
                "item": "minecraft:cyan_dye",
            },
			//How many times the botany pot will try to drop this item, in this case, it will try either one or two times, each time it will have a 5% chance of dropping a diamond
            "minRolls": 1,
            "maxRolls": 2
        }
    ]
}
);
