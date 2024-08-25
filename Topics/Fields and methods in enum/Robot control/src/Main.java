class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        int destX = toX - x;
        if (destX > 0) {
            turnToDirection(robot, Direction.RIGHT);
        } else if (destX < 0) {
            turnToDirection(robot, Direction.LEFT);
        }
        moveForward(robot, Math.abs(destX));

        int destY = toY - y;
        if (destY > 0) {
            turnToDirection(robot, Direction.UP);
        } else if (destY < 0) {
            turnToDirection(robot, Direction.DOWN);
        }
        moveForward(robot, Math.abs(destY));

    }

    public static void moveForward(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            forward(robot);
        }
    }

    public static void turnToDirection(Robot robot, Direction direction) {
        while (direction != robot.getDirection()) {
            turnLeft(robot);
        }
    }

    public static void forward(Robot robot) {
        System.out.println("robot.stepForward()");
        robot.stepForward();
    }

    public static void turnLeft(Robot robot) {
        System.out.println("robot.turnLeft()");
        robot.turnLeft();
    }

    public static void turnRight(Robot robot) {
        System.out.println("robot.turnRight()");
        robot.turnRight();
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 3, 0);
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
