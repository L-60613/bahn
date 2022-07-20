package com.example.bahn;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Component
public class BstProvider{
    private final String filepath = "src/main/resources/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv";
    private final Map<String, Bst> bstMap;

    public BstProvider() {

        bstMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))){

            String line;
            line = br.readLine();       //1. Zeile auslesen (Spaltennamen)
            System.out.println(line);   //1. Zeile zur Kontrolle ausgeben

            //die restlichen Zeilen werden in while-Schleife verarbeitet:

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                Bst bst = new Bst(
                        values[0], values[1], values[2], values[3],
                        values[4], values[5], values[6], values[7],
                        values[8], values[9], values[10], values[11]
                );

                //neuer Eintrag in HashMap bstMap:
                //Werte in 2. Tabellenspalte ("RL100-Code") werden als key verwendet
                bstMap.put(values[1], bst);

            }
        }

        catch(IOException e) {
            System.out.println("Fehler beim Lesen: " + e.getMessage());
            System.out.println("Das Programm wird abgebrochen.");
            System.exit(-1);
        }
    }

    public Bst findByCode (String code){
        return bstMap.get(code);
    }
}
