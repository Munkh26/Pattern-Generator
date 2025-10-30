// Class author: Munkhsoyombo Munkhbat
// Date created: 10/29/2025
// General description: 

public class pattern {
    //Pre-condition: Call the method stars by putting an integer for the rows you want.
    //Post-condition: It prints one star "*" and adds two more stars "**" as it goes down the rows.
    public static void stars(int rows) {
        int i = 0;
        String output = "*";
        while (i < rows) {
            System.out.println(output);
            output += "**";
            i++;
        }
    }
    //Pre-condition: Call the method triangle by putting an integer for the rows you want.
    //Pos-condition: It will print starting from "1" then depending on the row, all the numbers will change into the row number. Also, it will add one number, that is same as the row number. 
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
    //Pre-condition: Call the method odd and enter an odd integer in it (so it gives odd outputs).
    //Pos-condition: It will print from the number you entered and repeat iteslf that many times. Goes down by 2 each time, so only odd numbers will show.
    public static void odds(int start) {
        String output = "";
        for (int i = start; i > 0; i -=2) {
            for (int count = 0; count < i; count++) {
                output += i;
            }
            System.out.println(output);
            output = "";
        }
    }
    //Pre-condition:
    //Pos-condition:
    public static void eo(int maxE) {
        String output = "O";
        String output2 = "EE";
        for (int i = 0; i < maxE; i++) {
            if (i % 2 == 0) {
                System.out.println(output);
                output += "OO";
            } 
            else {
                System.out.println(output2);
                output2 += "EE";
            }
        }
    }

    //Run tests
    public static void main(String[] args) {
        stars(7);   
        triangle(9);
        odds(9);
        eo(6);
    }
}
