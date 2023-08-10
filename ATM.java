import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		Account2 optionMenu = new Account2();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
}
