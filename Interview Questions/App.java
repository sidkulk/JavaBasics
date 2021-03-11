package myClass;

import myClass.BatchProcessor;
import java.io.File;
import java.util.List;
import static java.lang.System.out;

public class App {
	public static void main(String[] args) {
		BatchProcessor bprocess = new BatchProcessor();
		bprocess.processBatch(args[0]);
		System.out.println("Done..");
	}
}

class Record {

}

class BatchProcessor {
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

        private File openFile(String filename) {
                out.println("File opened");
                return null;
        }

        private void processRecords(List<?> records) {
                out.println("Processing db calls and queuing requests");
        }
}

class TextParser {
        public TextParser(File file) {
                System.out.println("Creating TEXT parser");
        }

        public List<Record> parse() {
                System.out.println("Parsing TEXT and creating reocrd list");
                return null;
        }
}

class TestClass {
    private int testVar;
    private String testString;

    TestClass {
        
    }
}

