package org.helper;

public class File_Read {

	private File_Read() {
		// restrict to create object on other class
	}
	
	public Property_file getInstance() throws Throwable {
		Property_file pro = new Property_file();
		return pro;
	}
	
	public static File_Read getFile() {
		File_Read file = new File_Read();
		return file;
	}
}
