/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 1. Your predicted output - done with main, message1, message2, done with message 2


public class Tricky {public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }

 }

// 3. Were you correct? Explain any differences - NO, I thought the "done with main" would be first and there is an extra "this is message1
// I understand this now ! I tried to complete this project before fully reading the chapter.


