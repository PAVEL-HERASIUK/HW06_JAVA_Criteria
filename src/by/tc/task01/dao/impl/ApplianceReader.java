package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

	private BufferedReader applianceReader;

	public ApplianceReader(String fileName) throws FileNotFoundException {
		applianceReader = new BufferedReader(new FileReader(fileName));
	}

	public List<String> read(String applianceType) throws IOException {
		if (applianceType == null) {
			return readAll();
		} else {
			return readWithType(applianceType);
		}
	}

	private String ReadAll() throws IOException {
		String line;
		List<String> lines = new ArrayList<String>();

		while ((line = applianceReader.readLine()) != null) {
			line.add(String);
		}
		applianceReader.close();
		return line;
	}

	private List<String> readWithType(String applianceType) throws IOException {
		String line;
		List<String> lines = new ArrayList<String>();

		while ((line = applianceReader.readLine()) != null) {
			if (line.contains(applianceType)) {
				line.add(String);
			}
		}
		applianceReader.close();
		return lines;
	}
}
