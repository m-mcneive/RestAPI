package main.RestAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import main.RestApi.model.Entry;
import main.RestApi.services.EntryService;

@SpringBootTest
class RestApiApplicationTests {
	
	@Autowired
    private EntryService entryService;

	private Entry[] entries = {
		new Entry(1, "Groceries", 22.5),
		new Entry(2, "Target", 50.75),
		new Entry(3, "Chipotle", 10.56),
		new Entry(4, "Amazon", 48.63),
	};

	
	void loadEntries() {
		for(Entry e: entries) {
			entryService.add(e);
		}
	}

	@Test
	void testEntries() {
		loadEntries();

		assertEquals("Groceries", entryService.getEntry(1).getName());
		assertEquals(22.5, entryService.getEntry(1).getPrice());
		assertEquals("Target", entryService.getEntry(2).getName());
		assertEquals(50.75, entryService.getEntry(2).getPrice());
		assertEquals("Chipotle", entryService.getEntry(3).getName());
		assertEquals(10.56, entryService.getEntry(3).getPrice());
		assertEquals("Amazon", entryService.getEntry(4).getName());
		assertEquals(48.63, entryService.getEntry(4).getPrice());
	}

	@Test
	void testTotal() {
		loadEntries();
		double total = 0.0;
		for(Entry e: entries) {
			total += e.getPrice();
		}

		assertEquals(total, entryService.getTotalPrice());
	}

	@Test
	void testDelete() {
		loadEntries();
		assertEquals("Amazon", entryService.getEntry(4).getName());
		assertEquals(48.63, entryService.getEntry(4).getPrice());
		
		entryService.delete(4);
		assertEquals(null, entryService.getEntry(4));
	}

	

}
