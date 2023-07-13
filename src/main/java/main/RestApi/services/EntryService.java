package main.RestApi.services;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import main.RestApi.model.Entry;

@Service
public class EntryService {
    
    private HashMap<Integer,Entry> entries;
    private Integer id = 1;
    

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
        entries.put(id, entry);
        id++;
    }
}
