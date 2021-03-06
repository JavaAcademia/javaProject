package net.academia;

public class Utilities {
	
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	//validar tamanho dos varchar
	public static boolean validateSize(int limite, String texto){
		return (texto.length() <= limite);
	}
	
	//validar num telemovel
	public static boolean validatePhone(String phone){
		phone = phone.replace(" ", "");
		return (phone.matches("^(([+]?(\\d{3}))|(([+]?[(](\\d{3})[)])))?[- .]?((\\d\\d{2}[. -]?\\d{6})|(\\d\\d{2}[. -]?\\d{3}[. -]?\\d{3})|(9[1236]\\d{7})|(9[1236][. -]?\\d{3}[. -]?\\d{4})|(9[1236][. -]?\\d{4}[. -]?\\d{3})|(9[1236][. -]?\\d{3}[. -]?\\d{2}[. -]?\\d{2}))"));
	}
	
	//valid mail
	public static boolean validateEmail(String email){
		return (email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$"));
	}
	
	//valid cod postal
	public static boolean validateCodePostal(String codePostal){
		return (codePostal.matches("\\d*(([\\-])?\\d*)?"));
	}
	
	
}
