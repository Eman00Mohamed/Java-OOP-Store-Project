public class NotBallTypeException extends Exception {
    public NotBallTypeException(int ballType) {
        super(ballType + " Not a valid soccer ball type, Changing the soccer ball type to training ball\n");
    }
}

