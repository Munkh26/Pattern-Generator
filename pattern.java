// Class author: Munkhsoyombo Munkhbat
// Date created: 10/29/2025
// General description: User will input intgers into the methods and it will print what the method will do according to the inputted intger.

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
    //Post-condition: It will print starting from "1" then depending on the row, all the numbers will change into the row number. Also, it will add one number, that is same as the row number. 
    public static void triangle(int rows) {
        System.out.println("");
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
    //Post-condition: It will print from the number you entered and repeat iteslf that many times. Goes down by 2 each time, so only odd numbers will show.
    public static void odds(int start) {
        System.out.println("");
        String output = "";
        for (int i = start; i > 0; i -=2) {
            for (int count = 0; count < i; count++) {
                output += i;
            }
            System.out.println(output);
            output = "";
        }
    }
    //Pre-condition: Put an integer in the eo method for the max E you want to print.
    //Post-condition: It will print the max E, starting from one "O" or "E" depending on if it is even or odd number the user inputted. It will increase each letter by two like, increase by "EE" or "OO". So when it prints, it will go back and forth until it reahes maxE, then it goes backwards.
    public static void eo(int maxE) {
        System.out.println("");
        String output = "O";
        String output2 = "EE";
        if (maxE % 2 == 1) {
            output = "E";
            output2 = "OO";
        }
        for (int i = 0; i < maxE; i++) {
            if (maxE % 2 == 0) {
                if (i % 2 == 0) {
                    System.out.println(output);
                    output += "OO";
                } 
                else {
                    System.out.println(output2);
                    output2 += "EE";
                }
            }
            else {
                if (i % 2 == 0) {
                    System.out.println(output);
                    output += "EE";
                } 
                else {
                    System.out.println(output2);
                    output2 += "OO";
                }
            }
        }
        int fullLength = output.length(); 
        int fullLength2 = output2.length();
        for (int i = 0; i < maxE; i++) {
            if (maxE % 2 == 0) {
                if (i % 2 == 0) {
                    output = output.substring(0, fullLength - i - 2);
                    System.out.println(output);
                }
                else {
                    output2 = output2.substring(0, fullLength2 - (i + 1) - 2);
                    System.out.println(output2);
                }
            }
            else {
                if (i % 2 == 1) {
                    output = output.substring(0, fullLength - (i + 1) - 2);
                    System.out.println(output);
                }
                else {
                    output2 = output2.substring(0, fullLength2 - i - 2);
                    System.out.println(output2);
                }
            }
        }
    }

    //Pre-condition: Put a integer in the pyramid method.
    //Post-condition: It will print start printing from "1" and amount of "1" that will be printed is depended on user input. It will add a space in front each line as it goes downward until it reaches only one user inputted integer.
    public static void pyramid(int rows) {
        int num = rows * 2 - 1;
        String output = "";
        for (int i = 0; i < rows; i++) {
            for (int tempCount = 0; tempCount < i; tempCount++) {
                output += " ";
            }
            for (int count = 0; count < (num - i * 2); count++) {
                int num2 = i + 1;
                output += num2;
            }
            System.out.println(output);
            output = "";
        }
    }

    //Run tests
    public static void main(String[] args) {
        stars(7);   
        triangle(9);
        odds(9);
        eo(6);
        pyramid(5);
    }
}