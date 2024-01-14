package langpackage;

import java.io.IOException;

public class MyRuntime {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		try {
			int u = rt.availableProcessors();
			System.out.println(u);
			long totalMemory = rt.totalMemory();
			System.out.println(totalMemory);
			System.out.println("freeMemory:"+rt.freeMemory());
			System.out.println("Max memory"+rt.maxMemory());
			//rt.exec("notepad");
			//rt.exec("mspaint");
			rt.exec("calc");
			//rt.exec("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
