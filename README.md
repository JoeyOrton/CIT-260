# CIT-260
BYU-I CIT-260
The Terminal Cycle

  Description: 
The design for our game will be a linear game with little to no deviation off the main path, yet involve randomization to allow for
variety. Our hope is to create a relativity short but addicting game that will invite the player to continue exploring the game’s maps.
The beginning our of game will prompt the user by choosing a character, one of three classes. This choice will determine their gear, or
magic. After making their choice they find themselves trapped in a system of underground tunnels and caves with their goal being to find
the path that leads them to the outside world. As the character moves through the tunnels you must fight monsters, collect items and
avoid traps to succeed in their escape.
The player must choose their path carefully as the cave is filling with water behind them, preventing them from moving backward. At the
main fork there will be a choice between three unique paths, each leading to a different outside world, each with a different theme.
Each theme will hold unique events that can only occur while on that specific path. At the end of each unique path there will be three
other paths.
The user has a 33% chance of being killed outright upon selection of one of the final paths. Each path has something new and different,
but not all paths lead to success. The player must use their weapons well and stay mindful of their environment and inventory if they
are to survive. At the end they will then face a mega boss (final event) which they must pass if they wish to escape the world
victorious.

  End user stories:
Game start splash screen
Start menu(new game, continue game)
Help/How to play
Options menu (music/speed/etc.)
Character Selection/Creation
Save Selection
Default game menu
Check player stats
Check player inventory
See map/progress
Movement
Environmental interaction
Combat
Attack
Defend
Item
Run away
Chat with NPC
Event log (plain text explanation of current event)
Save the game(Auto save will occur after each major choice)
Quick restart(return to last save from death) (second-chance scenario)
Full restart(occurs after total death)(NewGame+ scenario)

  Description of user end stories:
**NOTE: The layouts presented here are just a general idea. The actual menus will look similar, but slightly different as Terminal has
a different layout than Word**

This menu will prompt the user for their name. The name will be saved and/or load the file with the player’s name (which contains their
characters). If nothing is entered, a prompt will tell the user they need to enter a name.

To fit the size of the terminal the above splash screen text could be stacked, like so:
TERMINAL 
CYCLE

  Start menu:
Appears after splash screen and runs until the user makes a choice. Looks like this:

Start menu:
|----------------------------------------------------------|
|   Continue:              			           |
|   N - New Game		 		           |
|   L - Load Saved Game		           		   |
|   O - Options		           			   |
|   H - How to Play		           		   |
|   E - Exit                                  		   |
|----------------------------------------------------------|
>
Once the user chooses an option this will disappear to be replaced by the option they choose. If they enter an incorrect option the menu
will simply refresh.

Load saved game menu:
|----------------------------------------------------------|
|   Continue:              			           |
|   1 - (name of character) save file 1		           |
|   2 - (name of character) save file 2		           |
|   3 - (name of character) save file 3		           |
|   4 - (name of character) save file 4		           |
| ESC - back to main menu                                  |
|----------------------------------------------------------|
>
After choosing an option the game will read that file and load the saved game from the save point associated with the file.
this is a sorted list.
(given a value when created. 1st to last)
If they enter an incorrect option the menu will simply refresh.

  How to play:
This will open when the user chooses H from the start menu. It will tell the player how to play the game. It will not include the story,
that will appear after the user chooses a character at the beginning of a new game.

How to Play
|--------------------------------------------------------|
|   			How to play			 |
|		This is a text based RPG game.	         |
| A menu and description will appear whenever	         |
| there is a choice to make. To choose an option	 |
| type the corresponding letter and hit enter.		 |
| Some menus will ask for something different,	         |
| such as a name. Simply enter your response 	         |
| and hit enter.					 |
---------------------------------------------------------|
| Throughout this game you will fight monsters,	         |
|collect items, navigate traps, and explore the tunnels. |
| To win you must kill the final boss. 			 |
| Don’t worry if you don’t win on your first try!	 |
| The game is built for multiple tries. Each time you die|
| you will be able to restart with your character and    |
| explore more of the cave.				 |
|							 |
| Each new life is a new adventure!			 |
|--------------------------------------------------------|
| C - Combat help					 |
| B - Main menu 					 |
| I - Inventory help					 |
| Esc - Back to Start menu				 |
|--------------------------------------------------------|
>
When the user enters an invalid response, the menu will just refresh.

  Options Menu:
Appears when chosen either in-game or from the main menu. Players will be able to toggle on or off the music, change how many steps they
take per move, and exit to the main menu. If an invalid option is selected, the menu will simply refresh until a valid option is chosen.

Options menu
|--------------------------------------------------------|
|   		Options			                 |
|  M - Toggle music (On/Off) 			         |
|  X - Toggle commands list on/off		         |
|  E - Exit 					         |
|--------------------------------------------------------|
>
if command list is toggled off, letter commands and descriptions will not be displayed in the default game menu.

  Character Selection/New Game:
Appears when players choose to start a new game. They are given the benefits of each character and then choose their character and name.
Once complete the game will begin.

Character Selection
|----------------------------------------------------------|
|   	Choose your warrior		                   |
|  S - Swordsman 				           |
|Built for offence, and equipped with a sword, this choice |
| focuses on attack.                                       |
|Attack: +10 Defence: 0		                           |
|  B - Shield bearer				           |
|The shield you wield is well suited to both protection    |
| and smashing                                             |
|Attack: 0 Defence: +10		                           |
|  D - Dual Daggers				           |
|With these two blades you are ready to defend yourself as |
| well as attack                                           |
|Attack: +5 Defence +5		                           |
|----------------------------------------------------------|
>

Character Naming
|----------------------------------------------------------|
|   Type your character name below	                   |
|----------------------------------------------------------|
>

The menu will display a list containing each character and their attributes
this is a sorted list.
(alphabetical)
More character types and starting equipment will be available depending on the player’s 

  Default Game menu:
This is the layout of the menu that will appear as the player moves through the map. There will be three sections of this. first, the
Ascii art environment, beneath that, a description of their location and lastly, a menu of choices. They will be able to check their
stats, inventory, map and examine surroundings. When an event is triggered, a new menu corresponding to that event will appear. Ie: If
you are attacked the combat menu will appear.

Sample Scene Description
|-------------------------------------------------------------------|
|The forest of Sages					            |
|								    |
| A gentle breeze flows from the forest. The tall evergreens invite |
| you to enter. The air smells fresh and clean. You can hear birds  |
| singing in the higher branches. The leaf covered path continues.  |
|-------------------------------------------------------------------|
| F - Move forward			| S - Player stats  	    |	
| E - Examine surroundings	  	| I - Inventory		    |
| M - Open map			        | O - Options		    |
|-------------------------------------------------------------------|

  Check player inventory:
This will be a list sorted alphabetically by each item name.

Inventory Screen
|--------------------------------------|
|	Inventory      		       |
| 	Jeweled Shield	+25 Defense    |
|	Large Sword	+25 Attack     |
|	Potion		+25 Health     |
|--------------------------------------|
>
This is a sorted list
(Alphabetical)

  See map:
The see map functionality will include the ability to refresh the screen and show a current map including where the player is and which
rooms have been completed, as well as how much remains on their chosen path. Given the default size of a terminal window, as well as
custom window sizes end users may have set, we will have to either restrict the size or grab the size using something like export
COLUMNS LINES as found in BASH on Linux. To simplify this issue, we could force the end user to expand their terminal to a minimum
column size before the game beings. The “See map” or “Open map” action will be engaged by pressing “M” when the user is presented with
the option on screen.

  Movement:
Movement will be represented graphically under the “See map” functionality. The user can press the “M” key when it is available to
advance forward. The only time  the user will be presented with an option other than to move forward, will be when they encounter a fork
in the road. When they encounter the fork they will be presented with three paths and will be required to choose one to continue. A
forked path decision will occur twice within the game.

  Chances of Encounter:
The chance of an encounter happening in each step of the map will be determined randomly, each step increasing the chances of an
encounter, with a guarantee of an encounter on the 5th step. This counter will restart after an encounter.

Encounter if Chance >= 10
Chance = (random number between 1 and 10) x (number of steps since last encounter)^.661

  Environmental interaction:
A selection will be given to the player of what to do while trying to interact with their surroundings, depending on what actions will
be available to them. More actions are available to them depending on the player’s lvl and other modifiers:
Option 1 available if skill lvl >= 1
Option 2 if skill lvl >= 3
Option 3 if skill lvl  >= 5 …… etc.

Skill Lvl = (Character lvl + positive modifier (potion or effect) - inhibitor (curse)) x (1 + (current score x .01))
									
  Combat:
Will Show an action scene between the player and their opponent and present the player one opportunity to perform an action at a time,
with the opponent doing the same thing between each of the player’s choices. They will be able to choose between blocking, attacking or
using an item from their inventory. Damage will be calculated prior to application, based on several variables.
Damage=
random number (between base damage and max damage) x character’s lvl modifier / (opponent’s resistance or Armor Value) + additional modifier (potion) - block value (0,if not blocking)

  Chat with NPC:
No dialogue options will be presented except Yes or No, when presented a choice. Otherwise, only text will be presented the player with
the speaker’s name heading each statement.
i.e.
Stranger: “Here, take this. It’s not safe to travel without a weapon.”

  Quick restart:
The player will re-spawn at the first step after the last fork they met. This location will be called from a variable that updates after
each choice at a fork. This event will only occur upon the player's death while carrying a particular item, at which time the item will
be removed from their inventory. The rest of their inventory will remain the same and the player’s status will return to whole (full
health).
When this is triggered the program will search the save file with the current player's name, pull the correct save file, and run it.

  Full restart:
A full restart on any character will prompt the game to create an entirely new randomized world for the player to explore. The player
will keep their entire inventory, but not know what to expect as they continue on a path that seems all too familiar. Levels of
difficulty will be added each iteration if possible. The player’s status will return to whole (full health).
