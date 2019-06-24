package adelina;

public class Main {
    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main (String[]args){
            final int min = 0;
            final int max = 107;
            final int rnd = rnd(min, max);

            System.out.println("generateRandomAge: " + rnd);

        }



    }
