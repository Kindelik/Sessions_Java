//package Seminar6.Work2Classes;
//
//import java.util.Objects;
//
//public class Cat2 extends Cat{
//    public float weight;
//
//    public int rating;
//
//    public float getWeight() {
//        return weight;
//    }
//
//    public void setWeight(float weight) {
//        this.weight = weight;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat2{" +
//                "weight=" + weight +
//                ", rating=" + rating +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", breed='" + breed + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Cat2 cat2 = (Cat2) o;
//        return Float.compare(cat2.weight, weight) == 0 && rating == cat2.rating;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), weight, rating);
//    }
//}
