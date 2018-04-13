// MazeSolver is used to find and display, step-by-step, the solution to a maze.

public class MazeSolver {
    private Maze solution;
    private static Displayer displayer;
    private static int step;

    public MazeSolver( String sourceFilename
		       , int explorerRank, int explorerFile
		       ) throws java.io.FileNotFoundException {
	solution = new Maze( sourceFilename, explorerRank, explorerFile);
	if( solution.explorerIsOnA() == Maze.WALL) {
	    System.out.println( solution + System.lineSeparator() +
				"Starting from invalid position. No solutions."
				+ System.lineSeparator());
	// }else if( hasTreasure( solution) == false) {
	//     System.out.println( solution + System.lineSeparator() +
	// 			"Maze doesn't contain a treasure. No solutions."
	// 			+ System.lineSeparator());
	}else if( solution.explorerIsOnA() == Maze.TREASURE) {
	    System.out.println( solution + System.lineSeparator()
				+ "Solved." + System.lineSeparator());
	}else{
	    System.out.println( solution + System.lineSeparator());
	    solve( solution);
	}
    }

    private void solve( Maze maze) {
	Maze undo = new Maze( maze);
	int direction = 1;

	if( maze.explorerIsOnA() != Maze.TREASURE) {
	    maze.dropA( Maze.WALL);
	    maze.go( direction);
	    while( maze.explorerIsOnA() == Maze.WALL) {
		maze = new Maze( undo);
		maze.go( direction * 2);
		direction *= 2;
		if( direction == 16) {
		    System.out.println( System.lineSeparator() +
				        "No legal moves left. No solutions."
					+ System.lineSeparator());
		    break;
		}
	    }
	    if( direction <= 8) {
		display( maze);
		if( maze.explorerIsOnA() == Maze.TREASURE) {
		    System.out.println( maze + "step " + step++
					+ System.lineSeparator()
					+ System.lineSeparator() + "Solved.");
		}else{
		    maze.dropA( Maze.WALL);
		    solve( maze);
		}
	    }
	}
    }

    private static void display( Maze m) {
	displayer = new Displayer( 18);
        if( m.explorerIsOnA() != Maze.TREASURE) {
	    displayer.atTopOfWindow( m + "step " + step++);
	}
    }
	
    // private boolean hasTreasure( Maze maze) {
	// if( ) {
		// return true;
	// }else{
		// return false;
	// }
    // }
}

// for( int direction = 1; direction <= 8; direction*2) {
// }
