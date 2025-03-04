/*    */ package mcheli;
/*    */ 
/*    */ import mcheli.wrapper.W_KeyBinding;
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ 
/*    */ public class MCH_KeyName
/*    */ {
/*    */   private final int value;
/*    */   private final String name;
/*    */   private final String description;
/* 11 */   private static MCH_KeyName[] list = new MCH_KeyName[] { new MCH_KeyName(0, "NONE", ""), new MCH_KeyName(1, "ESCAPE", "Escape"), new MCH_KeyName(2, "1", ""), new MCH_KeyName(3, "2", ""), new MCH_KeyName(4, "3", ""), new MCH_KeyName(5, "4", ""), new MCH_KeyName(6, "5", ""), new MCH_KeyName(7, "6", ""), new MCH_KeyName(8, "7", ""), new MCH_KeyName(9, "8", ""), new MCH_KeyName(10, "9", ""), new MCH_KeyName(11, "0", ""), new MCH_KeyName(12, "MINUS", "-"), new MCH_KeyName(13, "EQUALS", "="), new MCH_KeyName(14, "BACK", "Backspace"), new MCH_KeyName(15, "TAB", "Tab"), new MCH_KeyName(16, "Q", ""), new MCH_KeyName(17, "W", ""), new MCH_KeyName(18, "E", ""), new MCH_KeyName(19, "R", ""), new MCH_KeyName(20, "T", ""), new MCH_KeyName(21, "Y", ""), new MCH_KeyName(22, "U", ""), new MCH_KeyName(23, "I", ""), new MCH_KeyName(24, "O", ""), new MCH_KeyName(25, "P", ""), new MCH_KeyName(26, "LBRACKET", "["), new MCH_KeyName(27, "RBRACKET", "]"), new MCH_KeyName(28, "RETURN", "Enter"), new MCH_KeyName(29, "LCONTROL", "L Control"), new MCH_KeyName(30, "A", ""), new MCH_KeyName(31, "S", ""), new MCH_KeyName(32, "D", ""), new MCH_KeyName(33, "F", ""), new MCH_KeyName(34, "G", ""), new MCH_KeyName(35, "H", ""), new MCH_KeyName(36, "J", ""), new MCH_KeyName(37, "K", ""), new MCH_KeyName(38, "L", ""), new MCH_KeyName(39, "SEMICOLON", " ;"), new MCH_KeyName(40, "APOSTROPHE", "'"), new MCH_KeyName(41, "GRAVE", "`"), new MCH_KeyName(42, "LSHIFT", "L Shift"), new MCH_KeyName(43, "BACKSLASH", "\\"), new MCH_KeyName(44, "Z", ""), new MCH_KeyName(45, "X", ""), new MCH_KeyName(46, "C", ""), new MCH_KeyName(47, "V", ""), new MCH_KeyName(48, "B", ""), new MCH_KeyName(49, "N", ""), new MCH_KeyName(50, "M", ""), new MCH_KeyName(51, "COMMA", ","), new MCH_KeyName(52, "PERIOD", "."), new MCH_KeyName(53, "SLASH", "/"), new MCH_KeyName(54, "RSHIFT", "R Shift"), new MCH_KeyName(55, "MULTIPLY", ""), new MCH_KeyName(56, "LMENU", "L Menu/Alt"), new MCH_KeyName(57, "SPACE", ""), new MCH_KeyName(58, "CAPITAL", "Caps Lock"), new MCH_KeyName(59, "F1", ""), new MCH_KeyName(60, "F2", ""), new MCH_KeyName(61, "F3", ""), new MCH_KeyName(62, "F4", ""), new MCH_KeyName(63, "F5", ""), new MCH_KeyName(64, "F6", ""), new MCH_KeyName(65, "F7", ""), new MCH_KeyName(66, "F8", ""), new MCH_KeyName(67, "F9", ""), new MCH_KeyName(68, "F10", ""), new MCH_KeyName(69, "NUMLOCK", "Number Lock"), new MCH_KeyName(70, "SCROLL", "Scroll Lock"), new MCH_KeyName(71, "NUMPAD7", ""), new MCH_KeyName(72, "NUMPAD8", ""), new MCH_KeyName(73, "NUMPAD9", ""), new MCH_KeyName(74, "SUBTRACT", ""), new MCH_KeyName(75, "NUMPAD4", ""), new MCH_KeyName(76, "NUMPAD5", ""), new MCH_KeyName(77, "NUMPAD6", ""), new MCH_KeyName(78, "ADD", ""), new MCH_KeyName(79, "NUMPAD1", ""), new MCH_KeyName(80, "NUMPAD2", ""), new MCH_KeyName(81, "NUMPAD3", ""), new MCH_KeyName(82, "NUMPAD0", ""), new MCH_KeyName(83, "DECIMAL", ""), new MCH_KeyName(87, "F11", ""), new MCH_KeyName(88, "F12", ""), new MCH_KeyName(100, "F13", ""), new MCH_KeyName(101, "F14", ""), new MCH_KeyName(102, "F15", ""), new MCH_KeyName(112, "KANA", ""), new MCH_KeyName(121, "CONVERT", ""), new MCH_KeyName(123, "NOCONVERT", ""), new MCH_KeyName(125, "YEN", "¥"), new MCH_KeyName(141, "NUMPADEQUALS", ""), new MCH_KeyName(144, "CIRCUMFLEX", "^"), new MCH_KeyName(145, "AT", "@"), new MCH_KeyName(146, "COLON", " :"), new MCH_KeyName(147, "UNDERLINE", "_"), new MCH_KeyName(148, "KANJI", ""), new MCH_KeyName(149, "STOP", ""), new MCH_KeyName(150, "AX", ""), new MCH_KeyName(151, "UNLABLED", ""), new MCH_KeyName(156, "NUMPADENTER", ""), new MCH_KeyName(157, "RCONTROL", "R Control"), new MCH_KeyName(179, "NUMPADCOMMA", ""), new MCH_KeyName(181, "DIVIDE", ""), new MCH_KeyName(183, "SYSRQ", ""), new MCH_KeyName(184, "RMENU", "R Menu/Alt"), new MCH_KeyName(197, "PAUSE", ""), new MCH_KeyName(199, "HOME", ""), new MCH_KeyName(200, "UP", "Up Arrow"), new MCH_KeyName(201, "PRIOR", "Page Up"), new MCH_KeyName(203, "LEFT", "Left Arrow"), new MCH_KeyName(205, "RIGHT", "Right Arrow"), new MCH_KeyName(207, "END", ""), new MCH_KeyName(208, "DOWN", "Down Arrow"), new MCH_KeyName(209, "NEXT", "Page Down"), new MCH_KeyName(210, "INSERT", ""), new MCH_KeyName(211, "DELETE", ""), new MCH_KeyName(219, "LMETA", "LWIN [3]"), new MCH_KeyName(220, "RMETA", "RWIN [3]"), new MCH_KeyName(221, "APPS", ""), new MCH_KeyName(222, "POWER", ""), new MCH_KeyName(223, "SLEEP", ""), new MCH_KeyName(-100, "BUTTON0", "Left Click"), new MCH_KeyName(-99, "BUTTON1", "Right Click"), new MCH_KeyName(-98, "BUTTON2", "Middle Click"), new MCH_KeyName(-97, "BUTTON3", ""), new MCH_KeyName(-96, "BUTTON4", ""), new MCH_KeyName(-95, "BUTTON5", ""), new MCH_KeyName(-94, "BUTTON6", ""), new MCH_KeyName(-93, "BUTTON7", ""), new MCH_KeyName(-92, "BUTTON8", ""), new MCH_KeyName(-91, "BUTTON9", ""), new MCH_KeyName(-90, "BUTTON10", ""), new MCH_KeyName(-89, "BUTTON11", ""), new MCH_KeyName(-88, "BUTTON12", ""), new MCH_KeyName(-87, "BUTTON13", ""), new MCH_KeyName(-86, "BUTTON14", ""), new MCH_KeyName(-85, "BUTTON15", "") };
/*    */ 
/*    */   
/*    */   private MCH_KeyName(int v, String n, String d) {
/* 15 */     this.value = v;
/* 16 */     this.name = n.toUpperCase();
/* 17 */     this.description = d;
/*    */   }
/*    */   
/*    */   public static int getValue(String name) {
/* 21 */     String n = name.toUpperCase();
/* 22 */     MCH_KeyName[] arr$ = list;
/* 23 */     int len$ = arr$.length;
/*    */     
/* 25 */     for (int i$ = 0; i$ < len$; i$++) {
/* 26 */       MCH_KeyName key = arr$[i$];
/* 27 */       if (key.name.compareTo(n) == 0) {
/* 28 */         return key.value;
/*    */       }
/*    */     } 
/*    */     
/* 32 */     return 0;
/*    */   }
/*    */   
/*    */   public static String getName(int value) {
/* 36 */     MCH_KeyName[] arr$ = list;
/* 37 */     int len$ = arr$.length;
/*    */     
/* 39 */     for (int i$ = 0; i$ < len$; i$++) {
/* 40 */       MCH_KeyName key = arr$[i$];
/* 41 */       if (key.value == value) {
/* 42 */         return key.name;
/*    */       }
/*    */     } 
/*    */     
/* 46 */     return "";
/*    */   }
/*    */   
/*    */   public static String getDescription(int value) {
/* 50 */     MCH_KeyName[] arr$ = list;
/* 51 */     int len$ = arr$.length;
/*    */     
/* 53 */     for (int i$ = 0; i$ < len$; i$++) {
/* 54 */       MCH_KeyName key = arr$[i$];
/* 55 */       if (key.value == value) {
/* 56 */         return key.description;
/*    */       }
/*    */     } 
/*    */     
/* 60 */     return "";
/*    */   }
/*    */   
/*    */   public static String getDescOrName(int value) {
/* 64 */     MCH_KeyName[] arr$ = list;
/* 65 */     int len$ = arr$.length;
/*    */     
/* 67 */     for (int i$ = 0; i$ < len$; i$++) {
/* 68 */       MCH_KeyName key = arr$[i$];
/* 69 */       if (key.value == value) {
/* 70 */         return key.description.isEmpty() ? key.name : key.description;
/*    */       }
/*    */     } 
/*    */     
/* 74 */     return "";
/*    */   }
/*    */   
/*    */   public static String getDescOrName(KeyBinding key) {
/* 78 */     return getDescOrName(W_KeyBinding.getKeyCode(key));
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Documents\Downloads\BC Remake 3.0.0 SW Community\mods\mcheli\!\mcheli\MCH_KeyName.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */