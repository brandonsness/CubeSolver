import java.util.Scanner;
public class CubeSolver 
{

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Do you know how to tell what the algorithms mean by R and R'? Enter y/n");
		
		//logic to ask for algorithm term knowledge
		String yon = console.next();
		while(!yon.equals("y") && !yon.equals("n"))
		{
			System.out.println("\nPlease input y for yes or n for no.");
			yon = console.next();
		}
		
		if (yon.equals("n"))
				{
					Cubes.algTerms();
				}
		
		while (!yon.equals("y"))
		{
			System.out.println("\nEnter y when ready to continue");
			yon = console.next();
		}
		
		//Step 1 white cross
		System.out.println("\nStep 1: Solve the top cross.\n");
		System.out.println("To do this make a cross pattern on the top.");
		System.out.println("Usually you would use the white layer, it should look like this.");
		
		Cubes.cubeOne();
		
		//logic to pause if someone hasn't figured it out yet.
		System.out.println("\n\nHave you gotten it so far? Enter y/n");
	    yon = console.next();
		while(!yon.equals("y") && !yon.equals("n"))
		{
			System.out.println("\nPlease input y for yes or n for no.");
			yon = console.next();
		}
		
		
		while (!yon.equals("y"))
		{
			System.out.println("\nInput y when you have gotten the cross");
			yon = console.next();
		}
			
		//Step 2 solve the first layer
		System.out.println("\nStep 2. Solve the first layer");
		System.out.println("Look at the colors on the sides of the cross and the corner peices");
		System.out.println("You're going to match the corner to its corner on the top");
		System.out.println("For example,");
		
		Cubes.cubeTwo();
		
		System.out.println("\n\nUse the algorithm: D' L D L");
		System.out.println("You can use this method on any corner for the top layer");
		
		//logic to pause if someone hasn't figured it out yet.
		System.out.println("\n\nHave you gotten it so far? Enter y/n");
	    yon = console.next();
		while(!yon.equals("y") && !yon.equals("n"))
		{
			System.out.println("\nPlease input y for yes or n for no.");
			yon = console.next();
		}
		
		
		while (!yon.equals("y"))
		{
			System.out.println("\nInput y when you have gotten the the top layer solved");
			yon = console.next();
		}
		
		//Step three, solve middle layer
		System.out.println("Step 3. Solve the middle layer.");
		System.out.println("Flip the cube over where the solved top layer is on the bottom");
		System.out.println("Rotate this layer until the middle is the bottom row is the same color as the middle of the middle layer");
		System.out.println("There are two main algorithms for this part");
		System.out.println("We use these to get middle corners from the top layer mid to their repsective corners.");
		
		Cubes.cubeThree();
		Cubes.cubeFour();
		
		//logic to pause if someone hasn't figured it out yet.
		System.out.println("\n\nHave you gotten it so far? Enter y/n");
	    yon = console.next();
		while(!yon.equals("y") && !yon.equals("n"))
		{
			System.out.println("\nPlease input y for yes or n for no.");
			yon = console.next();
		}
		
		
		while (!yon.equals("y"))
		{
			System.out.println("\nInput y when you have gotten the the middle layer solved");
			yon = console.next();
		}
		
		//solve the top face
		System.out.println("\nStep 4. Solving the top face");
		System.out.println("There are a couple of ways the cube could be at this point");
		System.out.println("We are now looking at the top of the cube, if you solved the white layer first, then it is the yellow side.");
		System.out.println("Regardless of what it looks like you can use this algorithm to solve to 1 of 7 top layers");
		System.out.println("F R U R' U' F'");
		
		
		Cubes.cubeFive();
		Cubes.cubeSix();
		Cubes.cubeSeven();
		Cubes.cubeEight();
		Cubes.cubeNine();
		Cubes.cubeTen();
		Cubes.cubeEleven();
		
		//logic to pause if someone hasn't figured it out yet.
				System.out.println("\n\nHave you gotten it so far? Enter y/n");
			    yon = console.next();
				while(!yon.equals("y") && !yon.equals("n"))
				{
					System.out.println("\nPlease input y for yes or n for no.");
					yon = console.next();
				}
				
				
				while (!yon.equals("y"))
				{
					System.out.println("\nInput y when you have gotten the the top face solved");
					yon = console.next();
				}
				
				//finishing the last layer
				System.out.println("Step 5 Finishing the last layer");
				System.out.println("There are three cases at this last step");
				Cubes.cubeEx();
				System.out.println("The first case is that the top row is already solved! Congrats you finished.");
				System.out.println("The second case is that the 1 and 3 on the top row are the same color with a different color in 2");
				System.out.println("For this case, check how many sides are like this.");
				System.out.println("If all sides are this way or only one side is do this algorithm:");
				System.out.println("R F R B2' R F' R' B2' R2");
				
				System.out.println("\nYou can also use this algorithm for the third case which is no sides matching.");
				System.out.println("Using this algorithm gets you to where one side is solved and the other three have the matching 1 and 3.");
				System.out.println("When you get to this point use the last algorithm until solved");
				System.out.println("R2 U R U R' U' R' U' R' U R'");
				
				System.out.println("\nCongratulations! You've now, hopefully, solved a rubiks cube. Feel free to use this program again if you can't remember the algorithms.");
				
	console.close();
	}//end of main
	
}//end of class
