import mods.create.MixingManager;
import mods.create.HeatCondition;
import mods.create.IProcessingRecipeManager;
import crafttweaker.api.recipe.CraftingTableRecipeManager;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.ingredient.IIngredient;
import crafttweaker.api.recipe.fun.RecipeFunction2D;
import mods.create.MillingManager;

// VIBRANIUM ALLTHEMODIUM ALLOY INGOT
<recipetype:create:mixing>.addRecipe("vibranium-allthemodium-alloy-ingot", <constant:create:heat_condition:none>, [<item:allthemodium:vibranium_allthemodium_alloy_ingot>], [<item:allthemodium:allthemodium_ingot>, <item:allthemodium:vibranium_ingot>]);

// UNOBTAINIUM ALLTHEMODIUM ALLOY INGOT
<recipetype:create:mixing>.addRecipe("unobtainium-allthemodium-alloy-ingot", <constant:create:heat_condition:none>, [<item:allthemodium:unobtainium_allthemodium_alloy_ingot>], [<item:allthemodium:unobtainium_ingot>, <item:allthemodium:allthemodium_ingot>]);

// UNOBTAINIUM VIBRANIUM ALLOY INGOT
<recipetype:create:mixing>.addRecipe("unobtainium-vibranium-alloy-ingot", <constant:create:heat_condition:none>, [<item:allthemodium:unobtainium_vibranium_alloy_ingot>], [<item:allthemodium:vibranium_ingot>, <item:allthemodium:unobtainium_ingot>]);

// MillingManager.addRecipe(name as string, outputs as Percentaged<IItemStack>[], input as IIngredient, duration as int)
 
<recipetype:create:milling>.removeByName("create:milling/gravel");
<recipetype:create:milling>.addRecipe("milled", [<item:minecraft:sand>], <item:minecraft:gravel>, 200);        