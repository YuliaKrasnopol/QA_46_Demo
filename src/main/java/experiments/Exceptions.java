package experiments;

public class Exceptions {
    public static void main(String[] args) {
        String[] strArray={"str1","str2","str3"};
        System.out.println("------");
        pause();
        System.out.println("yes");
        uncheckedException(strArray);
    }

    private static void uncheckedException(String[] strArray){
        try{for (int i = 0; i < 4; i++) {
            System.out.println(strArray[i]);

        }
        } catch(Exception e){
            e.getStackTrace();
            System.out.println("Created Exception");
            throw new RuntimeException(e);
        }
        System.out.println("program works");
    }
    private static void pause(){
        try {
            checkedException();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkedException() throws InterruptedException {
        Thread.sleep(3000);

    }

}
