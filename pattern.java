// Class author: Munkhsoyombo Munkhbat
// Date created: 10/29/2025
// General description: 

public class pattern {
    public static void main(String[] args) {
        stars(7);   
        triangle(9);
    }

    //Pre-condition: call the method stars by putting a number for the rows.
    //Post-condition: prints one star "*" and adds two more stars "**" as it goes down the rows.
    public static void stars(int rows) {
        int i = 0;
        String output = "*";
        while (i < rows) {
            System.out.println(output);
            output += "**";
            i++;
        }
    }

    //Pre-condition: call the method triangle by putting number of rows in it.
    //Pos-condition: it will print starting from "1" then depending on the row, all the numbers will change into the row number. Also, it will add one number, that is same as the row number. 
    public static void triangle(int rows) {
        int i = 1;
        String output = "1";
        while (i <= rows) {
            output = output.replaceAll(output.substring(0, 1), "" + i);
            System.out.println(output);
            output += output.substring(0, 1);
            i++;
        }
    }

    public static void odds(int start) {

    }
}
