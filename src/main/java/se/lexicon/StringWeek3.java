package se.lexicon;

/**
 * Hello world!
 */
public class StringWeek3 {
    public static void main(String[] args) {
        ex8();

    }

    // 1. What is the length of the String: "Java" ? Answer: 4
    public static void ex1() {

        String test = "Java";
        System.out.println(test.length());


    }

    // 1. What char is at index position 6 in the following String: Answer: X
    public static void exercise1() {

        String test = "Long example sentence";
        System.out.println(test.charAt(6));


    }

    // 2. What is the index position of 'o' in the following String:
    //"Even longer example sentence" ?: Answer: Index [6]
    public static void ex2() {
        String string = "Even longer example sentence";
        int index1 = string.indexOf('o');
        System.out.println(index1);

    }

    // 3. Given the following String: "Ok this is not as long!"
    //create a substring of only "not as long" (excluding the
    //exclamation point) and print it out.
    public static void ex3() {
        String string = "Ok this is not as long!";
        System.out.println(string.substring(11, 22));


    }

    // 4. Convert the following String: "CAPS EQUALS SCREAMING" to
    //lowercase and print it out. Then convert it back to
    //uppercase and print it out again.
    public static void ex4() {

        String statement = "CAPS EQUALS SCREAMING";
        System.out.println(statement.toLowerCase());
        System.out.println(statement.toUpperCase());


    }

    // 5. Correct the following String: "Java is the worst
    //programming language!" by replacing the (obviously
    //incorrect) word "worst" with the word "best". Then print
    //out the sentence.
    public static void ex5() {
        String opinions = "Java is the worst programming language!";
        System.out.println(opinions.replace("worst", "best"));

    }

    // 6. What is the output of the following String:
    //"\tJ\ta\tv\ta\t" after you trim it? Answer: J A V A
    public static void ex6() {
        String letters = "\tJ\ta\tv\ta\t";
        System.out.println(letters.trim());


    }

    // 7. Parse the following int: 20 to a String and add a 20 to the
    //end of the String. Printing it out should return: "2020".
    public static void ex7() {
        int number = 20;

        String str = Integer.toString(number) + "20";
        System.out.println(str);

    }

    // 8. Oil and water don't go well together. Given the String:
    //"Oil and Water", split them up into the words "Oil","Water"
    //and store them in a String array.
    public static void ex8() {
        String words= "Oil and water";
        String[]strArray= null;
        strArray =words.split(" ");
        for( int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }


    }

    // 9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
    //into an array. Print out all names separately.
    public static void ex9() {
        String names = ("Carl,Susie,Fredrick,Bob,Erik");
        String[] strArray = null;
        strArray = names.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }


    }


    // 10. Convert the following String: "ThisShouldBeConverted" to
    //a char array. Iterate through the char array and print out
    //each element.
    public static void ex10() {
        String sentence = "ThisShouldBeConverted";
        System.out.println(sentence.toCharArray());
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(i);
        }


    }

    // 11. Convert the following char[]: {'J','a','v','a'} to a
    //String and print it out.
    public static void ex11() {
        char[] letters = {'J', 'a', 'v', 'a'};
        String string = new String(letters);

        System.out.println(string);


    }
}
