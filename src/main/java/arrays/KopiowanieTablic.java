package arrays;

public class KopiowanieTablic {
    public static void main(String[] args) {

        int[] tablicaPierwsza = {1, 4, 5, 9, 7};

        //kopia
        int[] tablicaDruga = tablicaPierwsza;

        for (int i = 0; i < tablicaDruga.length - 1; i++) {
            System.out.print(tablicaDruga[i] + " ,");
        }
        System.out.print(tablicaDruga[tablicaDruga.length - 1]);
    }
}
