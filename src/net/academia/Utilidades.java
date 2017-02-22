package net.academia;

public class Utilidades {
	public static boolean validatePhone(String phone){
		return (phone.matches("^(([+]?(\\d{3}))|(([+]?[(](\\d{3})[)])))?[- .]?((2\\d{2}[. -]?\\d{6})|(2\\d{2}[. -]?\\d{3}[. -]?\\d{3})|(9[1236]\\d{7})|(9[1236][. -]?\\d{3}[. -]?\\d{4})|(9[1236][. -]?\\d{4}[. -]?\\d{3})|(9[1236][. -]?\\d{3}[. -]?\\d{2}[. -]?\\d{2}))"));
	}
	
	public static boolean validateEmail(String email){
		return (email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$"));
	}
}
