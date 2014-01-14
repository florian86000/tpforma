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
        // TODO: gérer le proxy
        System.setProperty("http.proxyHost","cache.univpoitiers.fr");
        System.setProperty("http.proxyPort", "3128");
        URL url = new URL("http://www.uniprot.org/uniprot/" + uniprotId + ".txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        // TODO: lire le fichier
        return null;
    }
    
}
