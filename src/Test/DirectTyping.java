package Test;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class DirectTyping {
	static File file = new File("C:\\Users\\Leeyongwon\\Desktop\\test.txt");
	public static void inputString(String[] args) {
		try {
			if(file.exists())
				Desktop.getDesktop().edit(file);
			else {
				file.createNewFile();
				Desktop.getDesktop().edit(file);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
