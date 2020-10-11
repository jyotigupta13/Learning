public class UsingDirection {
    public static void main(String[] args){
        for(Direction direction : Direction.values())
            System.out.println(direction + " : " + direction.getDirection());
    }
}
