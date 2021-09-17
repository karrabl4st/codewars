public class Main {
    public static void main(String[] args) {

        String str = "Nice day out, huh?";
        str = str.replaceAll("[,!?.]+", "");
        System.out.println(PigLatin.pigIt("Pig latin is cool!"));
        for (String seg : str.split(" ")) {
            System.out.println(seg);
        }

    }
    
}
