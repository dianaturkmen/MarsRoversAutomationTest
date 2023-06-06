Feature: Mars Rovers Navigation
  As a NASA engineer I want to control the navigation of Mars rovers
      #Background:     Given the plateau size is 5x5

  Scenario: Rover direction facing and positioning initialisation
      Given the plateau size is 5x5
      When  a rover is positioned at Coordinates 4 , 3  facing North as 1
      Then the rover's position should be 4 , 3 facing North as 1

@rover
     Scenario: Moving the rover x and y position and location
      Given the plateau size is 5x5
      And a rover is positioned at Coordinates 1 , 1 facing East as 2
      When the rover recieves the command "M"
      Then the rover's position should be 2 , 1 facing East as 2

  @rover
     Scenario: Moving the rover x and y position and location
     Given the plateau size is 5x5
      And a rover is positioned at Coordinates 1 , 2  facing North as 1
      When the rover recieves the command "LMLMLMLMM"
      Then the rover's position should be 1 , 3 facing North as 1
