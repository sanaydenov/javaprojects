/*package JavaCore.Lesson3;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> box = new ArrayList<>();

    public Box(ArrayList<T> box) {
        this.box = box;
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void setBox(ArrayList<T> box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "box=" + box +
                '}';
    }

    //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество

    public float getWeight(Box<T> box){
        return box.getBox().size()*box.getWeight();
    }


    public void addFruit(T Fruit) {
        box.add(Fruit);
    }

    // Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare()
    public boolean compare(Box<T> box){
    return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }
}
*/
