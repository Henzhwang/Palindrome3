/*
 * @Henry Huang
 * Palindrome3.java
 * Feb 21,2019
 * This program is designed to determine if the phrase input by the user is a palindrome or not.

 */
package palindrome3;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new string and aske user for an input
        String word = JOptionPane.showInputDialog("Words that are the same forwards"
                + "and backward are called palindromes." + "\nThis program determines "
                + "if a phrase is a palindrome." + "\n\nEnter a phrase(do not include a punctuation"
                + "mark):");
        
        //create new string for the reverse of the input
        String backward = "";
        
        //reverse the input from user
        for(int position = word.length() - 1; position >= 0; position --)
        {
            backward += word.charAt(position);
        }
        
        //System.out.println(backward);
        
        //Determine if the input from user is a palindrome or not and display the result
        //to the user
        if (word.equalsIgnoreCase(backward))
        {
            JOptionPane.showMessageDialog(null,word + " in reverse is " + backward
            + ".\n" + word + " is a palindrome.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,word + " in reverse is " + backward +
                    ".\n" + word + " is not a palindrome.");
        }
        
    }
    
}
