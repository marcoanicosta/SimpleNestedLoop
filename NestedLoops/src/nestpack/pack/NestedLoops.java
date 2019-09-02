package nestpack.pack;

public class NestedLoops {

    public static void main(String[] args) {

        //Days & time print
        for(int days = 1; days<=3; days++){
            for(int hours = 0; hours<24; hours++){
                for(int minutes = 0; minutes<60; minutes++){
                    System.out.println("Day "+days + ", " + hours + ":" + minutes);
                }
            }
        }

    }
}
