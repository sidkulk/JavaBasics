package myClass;

/**
 * A simple Batch processor. Intentionally bad design
 * */

import java.io.File;
import static java.lang.System.out;
import java.util.List;

public class BatchProcessor {
	public void processBatch(String filename) {
		File file = openFile(filename);
		TextParser parser = new TextParser(file);
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
	}

	private void closeFile(File file) {
		out.println("File closed");
	}
	
	private void writeSummary() {
		out.println("A very bad batch summary!");
	}

	private void openFile(File file) {
		out.println("File opened");
		return null;
	}

	private void processRecords(List<?> records) {
		out.println("Processing db calls and queuing requests");
	}
}
