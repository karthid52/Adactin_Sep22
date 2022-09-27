package com.sdp;

public class FileReaderManager {

	public ConfigurationReader getInstanceCR() throws Throwable {

		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}
	
	public static FileReaderManager getInstanceFRM() {
		FileReaderManager frm=new FileReaderManager();
		return frm;
	}
	private FileReaderManager() {
	
	}
}
