// UserOfMazeSolver tests MazeSolver.

public class UserOfMazeSolver {
    
    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        MazeSolver mazeSolver = new MazeSolver( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
     }
}
