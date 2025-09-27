package sprint1;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(String[] movies, String target){
        for(int i = 0; i < movies.length; i++){
            if(movies[i].equalsIgnoreCase(target)){
                return i; // found at index i
            }
        }
        return -1; // not found
    }

    public static void main(String[] args){
        String[]  movies = {"Inception", "Interstellar", "Avatar", "Taitanic"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter movie name to Search ");
        String search = scanner.nextLine();

        int index = linearSearch(movies, search);
        System.out.println(index >= 0 ? "Found at index " + index : "movies not found");
    }
}
