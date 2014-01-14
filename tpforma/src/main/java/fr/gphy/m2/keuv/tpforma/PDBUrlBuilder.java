/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gphy.m2.keuv.tpforma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author
 * MiniMax
 */
public class PDBUrlBuilder {
    public static URL getFirstPdbUrl(String uniprotId) throws IOException {
        // TODO: g√©rer le proxy
        URL url = new URL("http://www.uniprot.org/uniprot/" + uniprotId + ".txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        // TODO: lire le fichier
        String line;
        while ((line = in.readLine()) != null) {
        if (line.matches("^DR\\s+PDB;.+$")) { in.close();
        return new URL("http://www.ebi.ac.uk/pdbe/entry­files/pdb" + line.substring(10, 14).toLowerCase() + ".ent");
        }
        }
        in.close();
        return null;
    }
    
}
