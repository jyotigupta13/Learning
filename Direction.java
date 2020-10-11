public enum Direction {
    EAST("direction is east"),
    NORTH("direction is north"),
    SOUTH("direction is south"),
    WEST("dirction is west");

    private String direction;
    Direction(String d){
         direction = d;
    }

    public String getDirection() {
        return direction;
    }
}
