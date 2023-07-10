package works;

class BoxApple<T extends Apple> extends Box<T> {
    @Override
    public void moveTo(Box<T> otherBox) {
        if (otherBox instanceof BoxApple<?>) {
            super.moveTo(otherBox);
        }
    }
}