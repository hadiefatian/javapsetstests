# Luggage Madness
This week we are going to build an airport. From the perspective of a piece of luggage. Saaay what? Let's go:

## How it works
As a traveller I want to track where my suitcase goes, after it leaves the band. This is what our process looks like:
1. Drop Off.
2. Keep it in the Storage area. Here it is stored as "this luggage waits here to go to this plane. 
3. When the plane has arrived, we move it to the plane with a transport cart. 
3. Once it is on the plane, it is in the cargo area, below the passenger area. It stays there during the flight duration.
4. Once landed, it is taken by a cart to the arrival's hall. 
5. There is will be put on the [Luggage Claiming Band](https://youtu.be/EiVPQp1Q_Zs)

The question behind all this is, when will the luggage arrive?
## Pay Attention to:
* When did it arrive?
* What happens when we move between time zones? Is there an easy way to take care of this?
* What time is it now, what time do I actually fly?
* How long is the flight duration? This must be dynamic as well.
* This process above, may be it looks like something you already know? A stream of time for example?

Most of this information is already in your pset. You just have to implement the stages. 
Your luggage should know how long it waited. Hmmm, sounds familiar. 
## Where to start:
_Take a look at the code._ 
1. Take a look at the luggage file. This is the input with the people, destination and some certain time. At the top you can see the different files. 
2. Dropoff time, Departure Time (Plane takeoff), Flight Duration, 
3. What happens if someone arrives too late? 
4. Now take a look at the parser that's already there. There are some comments that explain how it works as well. 
5. And compare it to the main file of pset4. 
6. Look out for the TODO:'s, they explain what you still need to do. 
7. Check out the Airport Class next, it's explained in the TODO what to do and how everything works. 
8. There are already some classes in the airport file. These are prepared for you so you know what elements to start with. 
9. And now check out the luggage Class and all the information that has been prepared already. Because of clean code, it should be understandable, but please ask in case you're unsure. Some of it is already present in the input file, some of it we still need to fill.

## What to do:
Answer the following questions:
* Who arrived to the airport too late?
* Generate the following output:

```test output```

## Extra Questions:

* There will be two rooms, one for backpacks and one for bigger luggage. Implement this.
* Understand how the Automatic Unit Tests work (J Unit) - Like Check50. 

