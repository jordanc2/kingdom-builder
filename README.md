## Creating the Castle Class

Create a new Java file named `Castle`.

#### Class Fields

This class will contain several properties. It is up to you to
determine the correct type. Use a `float` if the value should be
able to contain decimal values, use an `int` if not.

- name: name of the castle
- population: population of the castle
- zipcode: zipcode of the region
- area: square footage
- landmark: name of a landmark if any
- isCapitol: true or false
- latitude: used for horizontal positioning
- longitude: used for vertical positioning

#### Constructor

The constructor should take in enough data to populate each field

#### Getters and Setters

Each field should be marked private. In order to access these fields
we provide public read and write methods.

Since we are using an IDE, we can generate these methods automatically.

- Right click in the text editor 
- Select Generate > Getters and Setters
- Check every field in the pop-up window
- Press Create

## Creating instances

Inside of the Main class, we create two instance variables,
`castle1` and `castle2`.

In the `setup()` method, initialize these two variables with 
unique data for each castle.

## Finish the `drawCity(Castle)` method

This method takes in a `Castle` type Object, and uses the getters
to draw and position the castle to the screen.

#### First lets compute the width of the castle

We'll assume each castle to have a square base. Create a variable
to hold the result of calling the `sqrt()` method on the castle's
area.

#### Using the Image Method

Call Processing's `image()` method to draw an image of a castle
at the location of the castle object in question.

The syntax for Processing's image method is as follows:

`image(imageVariable, x, y, width, height)`

The images have been preloaded for you to use. We'll use the
image data stored in the `castleImage` variable.

#### Draw the Captiol Star

Use `image()` again to draw a `starImage` at the top right of
the Castle if it is the Capitol

A good size for the star image is 15 x 15px.

#### Draw the Castle Info

Use this if-statement to only display the Castle's information
when the user places the mouse near the Castle.

```java
if (dist(castle.getLatitude(), castle.getLongitude(), mouseX, mouseY) < w/2) {
    textSize(14);
    fill(0);

    //text commands go here...
}
```

Processing's text method header looks like the following:

```java
//draw text centerd at (x, y)
text(String text, float x, float y);
```

Use several text commands to display at least

- name
- population
- landmark

#### Calling the `drawCastle` Method

In the `draw()` method of the `Main` class, make a call to the
`drawCastle()` method and pass in a castle.

Do this for all of your castles and then run your program to
make sure they appear on the map, and that they display info
when the mouse is brought near.

## A Completed Project Will:

Display at least 3 different castles, at least one of which being
the capitol and displaying a star.

Also, each Castle should display information when hovered over with
the mouse.