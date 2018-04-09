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
When asked to navigate a maze from start to finish, the recursive abstraction can navigate a maze that is one step shorter from start to finish.

## Base Case

The explorer is at the same position as the treasure or there are no legal moves.

## English or pseudocode description of algorithm
If at the treasure, 
return true.

check if **legal**

* if true, take another step
   
* if false, go back a step

take a step, recurse again.

## Class(es), with fields and methods

## Version*n* wish list
