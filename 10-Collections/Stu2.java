public  class Stu2 implements Comparable<Stu2>{
    public String name;
    public int age;
    public int weight;

    public Stu2(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Stu2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    //Called for current object
    //We will define sorting criteria here
    public int compareTo(Stu2 that) {
        /// Sort on age
        return this.age-that.age;
    }
}
