package com.gentleware.poseidon.generation;

import java.io.File;
import java.io.IOException;

import com.gentleware.poseidon.util.Files;

public class GeneratedCodeCopyUtil {	
	private static File destinationFolder;
	private static File sourceFolder;
	
	public static void main(String[] args) {
		String sourceFolderPath = args[0];
		String destinationFolderPath = args[1];
		sourceFolder = new File(sourceFolderPath);
		destinationFolder = new File(destinationFolderPath);
		boolean sourceFolderExists = sourceFolder.exists() && sourceFolder.isDirectory();
		if (sourceFolderExists){
			copyFilesRecursively(sourceFolder);
		}		
	}
	
	private static void copyFilesRecursively(File sourceFolder){
		File[] files = sourceFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			File currentFile = files[i];
			if (currentFile.isDirectory()){
				copyFilesRecursively(currentFile);
			}
			else{
				copyFileIfNecessary(currentFile);
			}
		}		
	}
	
	private static boolean copyFileIfNecessary(File fileToCopy){
		String path = fileToCopy.getAbsolutePath();
		String sourceFolderAbsolutePath = sourceFolder.getAbsolutePath();
		path = path.substring(path.indexOf(sourceFolderAbsolutePath) + sourceFolderAbsolutePath.length() + 1);
		File destinationFile = new File(destinationFolder.getAbsolutePath() + File.separator + path);
		boolean destinationExists = destinationFile.exists();
		if (!destinationExists){
			try {
				Files.copyFileContent(fileToCopy, destinationFile);
				if (destinationFile.exists()){
					System.out.println("Copied file " + fileToCopy.getCanonicalPath() + " to file " + destinationFile.getCanonicalPath());
				}
				else {
					System.out.println("An error occurred while copying file " + fileToCopy.getCanonicalPath() + " to file " + destinationFile.getCanonicalPath());					
				}
			} catch (IOException e) {
				System.out.println("An error occurred while copying file " + fileToCopy.getAbsolutePath() + " to file " + destinationFile.getAbsolutePath());				
			}
		}
		return false;
	}

}
