// Write a Java program to create a base class Sports with a method called play(). Create
// three subclasses: Football, Basketball, and Rugby. Override the play() method in each
// subclass to play a specific statement for each sport.

class Sports {
    public void play() {
				System.out.println("Playing");
		}
}

class BasketBall extends Sports {
    public void play() {
        System.out.println("BasketBall");
    }
}

class Rugby extends Sports {
    public void play() {
        System.out.println("Rugby");
    }
}

class Football extends Sports {
    public void play() {
        System.out.println("Football");
    }
}

public class Sport {
    public static void main(String args[]) {
        Football ob = new Football();
        ob.play();
				Rugby ob = new Rugby();
				ob.play();
    }
}