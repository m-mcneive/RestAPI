package main.RestApi.services;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import main.RestApi.model.Entry;

@Service
public class EntryService {
    
    private HashMap<Integer,Entry> entries;
    

    public EntryService() {
        entries = new HashMap<>();
    }

    public Entry getEntry(int id) {
        if(entries.containsKey(id)) {
            return entries.get(id);
        }
        return null;
    }

    public void add(Entry entry) {
        entries.put(entry.getId(), entry);
        System.out.println("Added new entry");
    }

    public String delete(int id) {
        if(entries.containsKey(id)) {
            entries.remove(id);
            return "Removed entry " + id;
        }

        return "Entry not found";
    }
}
