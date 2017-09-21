/*    */ package de.syscy.bannerletters.util.letter;
/*    */ 
/*    */ import org.bukkit.DyeColor;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.BannerMeta;
/*    */ 
/*    */ public class LetterY extends Letter
/*    */ {
/*    */   public LetterY()
/*    */   {
/* 11 */     super(new char[] { 'Y', 'y' });
/*    */   }
/*    */   
/*    */   public ItemStack getBanner(DyeColor foreGroundColor, DyeColor backGroundColor, boolean border) {
/* 15 */     ItemStack banner = getEmptyNamedBanner(getLetters()[0]);
/* 16 */     BannerMeta bannerMeta = (BannerMeta)banner.getItemMeta();
/* 17 */     bannerMeta.setBaseColor(backGroundColor);
/* 18 */     bannerMeta.addPattern(new org.bukkit.block.banner.Pattern(foreGroundColor, org.bukkit.block.banner.PatternType.CROSS));
/* 19 */     bannerMeta.addPattern(new org.bukkit.block.banner.Pattern(backGroundColor, org.bukkit.block.banner.PatternType.HALF_VERTICAL_MIRROR));
/* 20 */     bannerMeta.addPattern(new org.bukkit.block.banner.Pattern(foreGroundColor, org.bukkit.block.banner.PatternType.STRIPE_DOWNLEFT));
/* 21 */     if (border)
/* 22 */       bannerMeta = addBorders(bannerMeta, backGroundColor);
/* 23 */     banner.setItemMeta(bannerMeta);
/* 24 */     return banner;
/*    */   }
/*    */ }

