class Sparrow extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying high!");
    }
}