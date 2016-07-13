package com.mikelduke.java.examples.fileviewer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FileViewer {

	public static void main(String[] args) {
		String fileName = showPicker();
		
		if (fileName == null || fileName.isEmpty()) {
			System.out.println("Invalid file selected");
			return;
		}
		
		viewFile(fileName);
	}
	
	public static void viewFile(String fileName) {
		File file = new File(fileName);
		
		if (file == null || !file.isFile() || !file.canRead()) {
			System.out.println("Error opening file " + fileName);
			return;
		}
		
		try (FileReader reader = new FileReader(file)) {
			System.out.println("Contents of " + fileName);
			int inVal = 0;
			while ((inVal = reader.read()) > -1) {
				System.out.print((char) inVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String showPicker() {
		String fileName = "";
		
		JFileChooser dirPicker;
		dirPicker = new JFileChooser(); 
		dirPicker.setCurrentDirectory(new java.io.File("."));
		dirPicker.setDialogTitle("Select File");
		
		if (dirPicker.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			fileName = dirPicker.getSelectedFile().getAbsolutePath();
		}
		
		return fileName;
	}
}
