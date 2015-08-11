/* Enzo Galbo
 * 5/20/2015
 * Creates DNA object containing String DNAName, defines methods for
 * counting a specific nucleotide and numbers of all 4 in a map.
 */
package dna;

import java.util.HashMap;
import java.util.Map;

public class DNA {

    public String DNAName;

    public DNA() {
        DNAName = "";
    }

    public DNA(String myDNA) {
        DNAName = myDNA;
    }

    public static void main(String[] args) {
        DNA myDNA = new DNA("AAAACCTTTGg");
        int cNum = myDNA.count('G');
        System.out.println(cNum);
        Map DNAMap = myDNA.nucleotideCounts();
        System.out.println(DNAMap);
    }

    public int count(char c) {
        int count = 0;
        char[] nameAsCharArray;
        nameAsCharArray = DNAName.toCharArray();
        for (int i = 0; i < nameAsCharArray.length; i++) {
            char tempChar = Character.toUpperCase(nameAsCharArray[i]);
            if (tempChar == Character.toUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    public Map nucleotideCounts() {
        Map DNAMap = new HashMap();

        int aCount = 0;
        int cCount = 0;
        int tCount = 0;
        int gCount = 0;
        char[] nameAsCharArray;
        nameAsCharArray = DNAName.toCharArray();

        for (int i = 0; i < nameAsCharArray.length; i++) {
            char tempChar = Character.toUpperCase(nameAsCharArray[i]);
            if (tempChar == 'A') {
                aCount++;
            }
        }
        for (int i = 0; i < nameAsCharArray.length; i++) {
            char tempChar = Character.toUpperCase(nameAsCharArray[i]);
            if (tempChar == 'C') {
                cCount++;
            }
        }
        for (int i = 0; i < nameAsCharArray.length; i++) {
            char tempChar = Character.toUpperCase(nameAsCharArray[i]);
            if (tempChar == 'T') {
                tCount++;
            }
        }
        for (int i = 0; i < nameAsCharArray.length; i++) {
            char tempChar = Character.toUpperCase(nameAsCharArray[i]);
            if (tempChar == 'G') {
                gCount++;
            }
        }

        DNAMap.put('A', aCount);
        DNAMap.put('C', cCount);
        DNAMap.put('T', tCount);
        DNAMap.put('G', gCount);

        return DNAMap;
    }
}