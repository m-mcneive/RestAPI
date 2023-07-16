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

    public String add(Entry entry) {
        Entry prev = entries.put(entry.getId(), entry);
        if(prev == null) {
            return "Entry added";
        }
        return String.format("Replaced previous entry at %s for %s", prev.getName(), prev.getPrice());
    }

    public String delete(int id) {
        if(entries.containsKey(id)) {
            entries.remove(id);
            return "Removed entry " + id;
        }

        return "Entry not found";
    }
}
