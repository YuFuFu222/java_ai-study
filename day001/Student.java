public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //按年龄排,一样就姓名的字母排,同年龄同姓名为同一人
        //this
        //o
        //返回值:
        //负数:当前添加元素是小的,存左边
        //正数:当前添加元素是大的,存右边
        //0:存在,舍弃
        int i = this.getAge() - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
