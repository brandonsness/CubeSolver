//I'm so sorry.
public class Cubes 
{
	public static void main(String[] args)
	{

	}
	
/*
 HERE BE DRAGONS
 
    				  /\
    	              ||
    	              ||
    	              ||
    	              ||                                        ~-----~
                      ||                                     /===--  ---~~~
    	              ||                ;'                 /==~- --   -    ---~~~
    	              ||              (/ ('              /=----         ~~_  --(  '
    				  ||             ' / ;'             /=----               \__~
	'               ~==_=~          '('             ~-~~      ~~~~        ~~~--\~'
	\\               (c_\_        .i.             /~--    ~~~--   -~     (     '
	`\               (}| /       / : \           / ~~------~     ~~\   (
	\ '               ||/ \      |===|          /~/             ~~~ \ \(
	``~\              ~~\  )~.~_ >._.< _~-~     |`_          ~~-~     )\
	'-~                 {  /  ) \___/ (   \   |` ` _       ~~         '
	\ -~\                -<__/  -   -  L~ -;   \\    \ _ _/
	`` ~~=\                  {    :    }\ ,\    ||   _ :(
	\  ~~=\__                \ _/ \_ /  )  } _//   ( `|'
	``    , ~\--~=\           \     /  / _/ / '    (   '
	\`    } ~ ~~ -~=\   _~_  / \ / \ )^ ( // :_  / '
	|    ,          _~-'   '~~__-_  / - |/     \ (
	\  ,_--_     _/              \_'---', -~ .   \
	)/      /\ / /\   ,~,         \__ _}     \_  "~_
	,      { ( _ )'} ~ - \_    ~\  (-:-)       "\   ~ 
	/'' ''  )~ \~_ ~\   )->  \ :|    _,       " 
	(\  _/)''} | \~_ ~  /~(   | :)   /          }
	<``  >;,,/  )= \~__ {{{ '  \ =(  ,   ,       ;
	{o_o }_/     |v  '~__  _    )-v|  "  :       ,"
    {/"\_)       {_/'  \~__ ~\_ \\_} '  {        /~\
     ,/!          '_/    '~__ _-~ \_' :  '      ,"  ~ 
   (''`                  /,'~___~    | /     ,"  \ ~' 
   '/, )                 (-)  '~____~";     ,"     , }
   /,')                    / \         /  ,~-"       '~'
  (  ''/                     / ( '       /  /          '~'
  ~ ~  ,, /) ,                 (/( \)      ( -)          /~'
  (  ~~ )`  ~}                   '  \)'     _/ /           ~'
  { |) /`,--.(  }'                    '     (  /          /~'
  (` ~ ( c|~~| `}   )                        '/:\         ,'
  ~ )/``) )) '|),                          (/ | \)                 -sjm
 (` (-~(( `~`'  )                        ' (/ '
    `~'    )'`')                              '
    ` ``
*/
	
	//Algorithm term knowledge
	public static void algTerms()
	{
		cubeEx();
		
		System.out.println("\nOnly one algorithm uses Rw. \nRw means to rotate the 2nd and 3rd collum away.");
		System.out.println("\nR: rotates 3rd collumn away \nR': rotates 3rd collumn towards");
		System.out.println("\nL: rotates 1st collumn towards \nL': rotates 1st collumn away");
		System.out.println("\nF: rotates the front face clockwise \nF': rotates the front face counter-clockwise");
		System.out.println("\nB: rotates the back face counter-clockwise \nB: roates the back face clockwise");
		System.out.println("\nD: rotates bottom row left \nD': rotates bottom row right");
		System.out.println("\nU: rotates top row right \nU': rotates top row left");

		
	}
	
	//example cube
	public static void cubeEx()
	{
		//prints across line of cube
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
	
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}
		
		//prints numbers on row
		System.out.printf("\n%2c%5d%5c%5d%5c%5d%5c\n", line, 1, line, 2, line, 3, line  );
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
	
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}
		
		//prints numbers on row
		System.out.printf("\n%2c%5d%5c%5d%5c%5d%5c\n", line, 1, line, 2, line, 3, line  );
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}

		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}
		
		//prints numbers on row
		System.out.printf("\n%2c%5d%5c%5d%5c%5d%5c\n", line, 1, line, 2, line, 3, line  );
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}

		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
	}
		
	//white cross cube
	public static void cubeOne()
	{
		//adds blue char at top of cube
		System.out.printf("\n%17c\n", 'b');
		
		//prints across line of cube
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
	
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}
		
		//this is spaghetti that prints out the verticals with a white char in middle
		char wh ='w';
		System.out.printf("\n%2c%10c%5c%5c%10c\n", line, line, wh, line, line );
		
		//blank vertical
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		} System.out.println();
		
		//across lines
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		} System.out.println();
		
		//prints the middle line of mid cube
		System.out.printf("%1c%c%5c%5c%5c%5c%5c%5c%c\n", 'o', line, wh, line, wh, line, wh, line, 'r' );
		
		//blank vertical
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		} System.out.println();
		
		//across lines
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		} System.out.println();
		
		//mid line for bottom
		System.out.printf("%2c%10c%5c%5c%10c\n", line, line, wh, line, line );

		//blank vertical
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		} System.out.println();
				
		//across lines
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();		
		
		System.out.printf("%17c\n", 'g');
		
	}
	
	//cube for solving top corners
	public static void cubeTwo()
	{
		
		System.out.println("The white cross is facing up and the blue side is facing forward\n");
		
		//adds white char at top of cube
		System.out.printf("\n%17c\n", 'w');
				
		//prints across line of cube
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)
		{
			System.out.printf("%10c", line);
		}
		
		//Prints verticals for top mid
		System.out.printf("\n%2c%10c%5c%5c%10c\n", line, line, 'b', line, line );
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
				
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();		
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
				
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();		
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//corner piece
		System.out.printf("\n%c%c%5c%5c%10c%10c\n", 'r', line, 'w', line, line, line );
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//prints corner bottom blue
		System.out.printf("%7c", 'b');
		
	
	}
	
	//cube for right mid
	public static void cubeThree()
	{
		System.out.println("\nFor this example orange is the front facing color, green on left, blue on right");
		
		//prints top blue char
		System.out.printf("\n%17c\n", 'b');
		
		//prints across line of cube
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//top mid orange
		System.out.printf("\n%2c%10c%5c%5c%10c", line, line, 'o', line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//mid orange 
		System.out.printf("\n%2c%5c%5c%5c%5c%5c%5c", line, 'o', line, 'o', line, 'o', line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		// bottom row
		System.out.printf("\n%1c%c%5c%5c%5c%5c%5c%5c%c", 'g', line, 'o', line, 'o', line, 'o', line, 'b');
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		System.out.println("\nThis algorthim moves the orange piece on the mid top row to the right middle collumn" );
		System.out.println("U R U' R' U' F' U F");
		System.out.println("This algorithm can be used to bring a piece in the middle right column to the top layer");
		
		
		
	}
	
	//cube for left mid
	public static void cubeFour()
	{
		
		System.out.println("\nFor this example orange is the front facing color, green on left, blue on right");
		
		//prints top green char
		System.out.printf("\n%17c\n", 'g');
		
		//prints across line of cube
		System.out.print("  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//top mid orange
		System.out.printf("\n%2c%10c%5c%5c%10c", line, line, 'o', line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//middle orange
		System.out.printf("\n%2c%5c%5c%5c%5c%5c%5c", line, 'o', line, 'o', line, 'o', line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//bottom row
		System.out.printf("\n%1c%c%5c%5c%5c%5c%5c%5c%c", 'g', line, 'o', line, 'o', line, 'o', line, 'b');
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		
		System.out.println("\nThis algorthim moves the orange piece on the mid top row to the left middle collumn");
		System.out.println("U' L' U L U F U' F'");
		System.out.println("This algorithm can be used to bring a piece in the middle left column to the top layer" );
		
		
		
	}
	
	//OLL cube 1
	public static void cubeFive()
	{
		System.out.println("\nThis is a view looking down at the top of the cube with the bottom facing towards you.");
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		char ye = 'y';
		//top row full yellow
		System.out.printf("\n%2c%5c%5c%5c%5c%5c%5c", line, ye, line, ye, line, ye, line );
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//top row full yellow
		System.out.printf("\n%2c%5c%5c%5c%5c%5c%5c", line, ye, line, ye, line, ye, line );
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//botom row
		System.out.printf("\n%2c%10c%5c%5c%10c", line, line, ye, line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();

		System.out.printf("%7c%20c", ye, ye);
		
		
		System.out.println("\n\nThe algorithm for this layer is: \n   R2 D R' U2' R D' R' U2' R'");

	}
	
	//OLL cube 2
	public static void cubeSix()
	{
		System.out.println("\nThis is a view looking down at the top of the cube with the bottom facing towards you.");
		
		char ye = 'y';
		//top corner
		System.out.printf("%7c", ye);
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//print top mid row
		System.out.printf("\n%2c%10c%5c%5c%5c%5c", line, line, ye, line, ye, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
	
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//full yellow row
		System.out.printf("\n%2c", line);
		for (int ir = 1; ir<=3; ir++)
		{
			System.out.printf("%5c%5c", ye, line);
		}
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//print top mid row
		System.out.printf("\n%2c%10c%5c%5c%5c%5c", line, line, ye, line, ye, line);

		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//bottom corner
		System.out.printf("%7c", ye);
		
		System.out.printf("\n\nThe algorithm for this layer is: \n   Rw U R' U' L' U R U'");

	}	

	//OLL cube 3
	public static void cubeSeven()
	{
		System.out.println("\nThis is a view looking down at the top of the cube with the bottom facing towards you.");
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		char ye = 'y';
		//top row
		System.out.printf("\n%2c%5c%5c%5c%5c%10c%c", line, ye, line, ye, line, line, ye);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();

		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//full yellow row
		System.out.printf("\n%2c", line);
		for (int ir = 1; ir<=3; ir++)
		{
			System.out.printf("%5c%5c", ye, line);
		}

		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();

		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//print top mid row
		System.out.printf("\n%2c%10c%5c%5c%5c%5c", line, line, ye, line, ye, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		System.out.printf("%7c", ye);
		
		
		System.out.println("\n\nThe algorithm for this layer is: \n    R U2' R D R' U2' R D' R2");
	}
	
	//OLL cube 4
	public static void cubeEight()
	{
		System.out.println("\nThis is a view looking down at the top of the cube with the bottom facing towards you.");
		
		char ye ='y';
		System.out.printf("%7c", ye);
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line ='|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//top mid row
		System.out.printf("\n%2c%10c%5c%5c%10c%c", line, line, ye, line, line, ye);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//full yellow row
		System.out.printf("\n%2c", line);
		for (int ir = 1; ir<=3; ir++)
		{
			System.out.printf("%5c%5c", ye, line);
		}

		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//bottom row
		System.out.printf("\n%2c%5c%5c%5c%5c%10c", line, ye, line, ye, line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();

		System.out.printf("%27c", ye);

		System.out.println("\n\nThe algorithm for this layer is: \n       R U R' U R U2' R'");

		
	}
	
	//OLL cube 5
	public static void cubeNine()
	{
		System.out.println("\nThis is a view looking down at the top of the cube with the bottom facing towards you.");
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		char ye = 'y';
		//top row
		System.out.printf("\n%c%1c%10c%5c%5c%5c%5c", ye, line, line, ye, line, ye, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();

		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//full yellow row
		System.out.printf("\n%2c", line);
		for (int ir = 1; ir<=3; ir++)
		{
			System.out.printf("%5c%5c", ye, line);
		}

		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//bottom row
		System.out.printf("\n%2c%10c%5c%5c%10c%c", line, line, ye, line, line, ye);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		System.out.printf("%7c", ye);
		
		System.out.println("\n\nThe algorithm for this layer is: \n       R U2' R' U' R U' R'");
		
	}
	
	//OLL cube 6
	public static void cubeTen()
	{
		System.out.println("\nThis is a view looking down at the top of the cube with the bottom facing towards you.");
		
		char ye = 'y';
		System.out.printf("%27c", ye);
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//top row
		System.out.printf("\n%c%1c%10c%5c%5c%10c", ye, line, line, ye, line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//full yellow row
		System.out.printf("\n%2c", line);
		for (int ir = 1; ir<=3; ir++)
		{
			System.out.printf("%5c%5c", ye, line);
		}
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//bottom row
		System.out.printf("\n%c%1c%10c%5c%5c%10c", ye, line, line, ye, line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		System.out.printf("%27c", ye);
		
		System.out.println("\n\nThe algorithm for this layer is: \n   R U2' R2 U' R2 U' R2 U2' R");
		
	}
	
	//OLL cube 7
	public static void cubeEleven()
	{
		System.out.println("\nThis is a view looking down at the top of the cube with the bottom facing towards you.");
		
		char ye = 'y';
		System.out.printf("%7c%20c", ye, ye);
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		char line = '|';
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//top row
		System.out.printf("\n%2c%10c%5c%5c%10c",  line, line, ye, line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//full yellow row
		System.out.printf("\n%2c", line);
		for (int ir = 1; ir<=3; ir++)
		{
			System.out.printf("%5c%5c", ye, line);
		}
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}

		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		//blank vertical cube lines
		System.out.printf("%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//bottom row
		System.out.printf("\n%2c%10c%5c%5c%10c",  line, line, ye, line, line);
		
		//blank vertical cube lines
		System.out.printf("\n%2c", line);
		for (int ir =1; ir<=3; ir++)			
		{
			System.out.printf("%10c", line);
		}
		
		//prints across line of cube
		System.out.print("\n  ");
		for (int ir = 0; ir <= 28; ir++)
		{
			System.out.printf("%c", '-');
		} System.out.println();
		
		System.out.printf("%7c%20c", ye, ye);
		
		System.out.println("\n\nThe algorithm for this layer is: \n  R U2' R' U' R U R' U' R U' R'");
		
	}
	
}//end of class
