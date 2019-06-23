/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.cloud.hetzner;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLStreamException;

/**
 *
 * @author hax0r
 */
public class status {

    public status() {

    }

    private static final String HETZNER_STATUS = "https://www.hetzner-status.de/en.atom";
    
    private long CloudNodeID(String title){
        String tmp = title.replaceAll("([a-z]|\\(.*\\))", "");
        return Long.parseLong(tmp);
    }

    public List<String> parse() throws XMLStreamException, IOException, IllegalArgumentException, FeedException {
        SyndFeed feed = new SyndFeedInput().build(new XmlReader(new URL(HETZNER_STATUS)));
        List<String> stats = new ArrayList<String>();
        for (SyndEntry sy : feed.getEntries()) {
            if (!sy.getDescription().getValue().contains("<strong>End</strong>")) {
                // Save Results to List
                if (sy.getTitle().contains("cloud node")) {
                    if (!sy.getDescription().getValue().contains("All systems are reachable again")) {
                        if (!sy.getDescription().getValue().contains("The server is back online")) {
                            System.out.println(sy);
                            CloudNodeID(sy.getTitle());
                        }
                    }
                }
            }
        }
        return stats;
    }
}
