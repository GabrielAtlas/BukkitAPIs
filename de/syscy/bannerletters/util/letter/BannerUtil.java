package de.syscy.bannerletters.util.letter;

import org.bukkit.DyeColor;
import org.bukkit.inventory.ItemStack;

public class BannerUtil
{

	public static ItemStack getBanner(String name){
		String s = name.substring(0, 1).toLowerCase();
		switch (s){
		case "a":
			return new LetterA().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "b":
			return new LetterB().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "c":
			return new LetterC().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "d":
			return new LetterD().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "e":
			return new LetterE().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "f":
			return new LetterF().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "g":
			return new LetterG().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "h":
			return new LetterH().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "i":
			return new LetterI().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "j":
			return new LetterJ().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "k":
			return new LetterK().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "l":
			return new LetterL().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "m":
			return new LetterM().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "n":
			return new LetterN().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "o":
			return new LetterO().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "p":
			return new LetterP().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "q":
			return new LetterQ().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "r":
			return new LetterR().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "s":
			return new LetterS().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "t":
			return new LetterT().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "u":
			return new LetterU().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "v":
			return new LetterV().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "w":
			return new LetterW().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "x":
			return new LetterX().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "y":
			return new LetterY().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		case "z":
			return new LetterZ().getBanner(DyeColor.BLACK, DyeColor.WHITE, true);
		}
		return null;
	}
	
}
