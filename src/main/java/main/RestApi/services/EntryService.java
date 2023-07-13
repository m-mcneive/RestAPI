package main.RestApi.services;

import java.util.List;
import org.springframework.stereotype.Service;
import main.RestApi.model.Entry;

@Service
public class EntryService {
    
    List<Entry> entries;

    public Entry getEntry(int id) {
        for(Entry entry: entries) {
            if(entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }
}
