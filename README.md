# FMRadioMazeSolver

## Personnel
Mandy Mai,
Fareeha Tabassum

## Statement of Problem
Returns the Boolean value of the statement “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”.

Navigate a maze from start to finish. 
<details>
   <summary>"Legal"</summary>
   <p>Don’t cross the walls</p>
   <p>Right-angle turns only</p>
   <p>A path cannot go through the same point twice</p>
</details> 

## Recursive Abstraction
When asked to navigate a maze from start to finish, the recursive abstraction can take a legal step and then navigate a maze that starts from the new position to the treasure.

## Base Case

The explorer is in the same position as the treasure, there are no legal moves possible, or there is no treasure that can be reached.

## English or pseudocode description of algorithm

Run if explorer starts in a valid position. **Assumes there is a treasure present.**
    
    check if at treasure:

      if true, print (Solved)

      if false, take a step EAST

                check if step is legal:

                  if true, recurse
   
                  if false, go back a step
                              
                            recurse with a legal direction
        
## Class(es), with fields and methods

<details>
   <summary>Maze</summary>
   <p>Fields</p>
   <p>Methods</p>

<details>
   <summary>UserOfMaze</summary>
   <p>Fields</p>
   <p>Methods</p>

<details>
   <summary>MazeSolver</summary>
   <p>Fields</p>
   <p>Methods</p>

<details>
   <summary>UserOfMazeSolver</summary>
   <p>Fields</p>
   <p>Methods</p>

## Version*n* wish list

* Be able to scan through entire maze first to check for the existence of a treasure.

* Go through all possible paths that can be taken (like NQueens)

## Known Bugs

* Can't backtrack more than 1 step. (misses solutions due to the algorithm prioritizing moving EAST)
