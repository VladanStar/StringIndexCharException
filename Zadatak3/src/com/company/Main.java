package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
    public Main(){
        returnChar("Hello", 5);
        returnChar(null, 5);
        System.out.println("After the method call");

    }
    public void returnChar(String str, int i) {
        try{
            System.out.printf("Na indeksu %d u tekstu %s nalazi se slovo %c. \n", i, str, str.charAt(i));

        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("StringIndexOutOfBoundsException in method()");
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
        }

    }
}
