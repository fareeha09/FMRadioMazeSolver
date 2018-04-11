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
    check if there is a tresure:
    
        if true, check if at treasure:

            if true, return true

            if false, take a step

                      check if step is legal:

                          if true, recurse/repeat
   
                          if false, go back a step
                              
                                    recurse/repeat
            
        if false, return false
        
## Class(es), with fields and methods

## Version*n* wish list
