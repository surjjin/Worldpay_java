package shape;

class UseShape{
    public static void main(String[] args) {
        if(args[0].equals("square"))
            System.out.println(Square.area(Integer.parseInt(args[1])));
        else     
        System.out.println(Circle.area(Integer.parseInt(args[1])));
    }
}