package exceptiondemo;

public class GF {
    private String name;
    private int age;

    public GF() {
    }

    public GF(String name, int age) {
        this.name = name;
        this.age = age;
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
        if(name.length()<3||name.length()>10){
            throw new NameFormatException(name+"格式错误:长度应为3-10");
        }
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
        if(age<18||age>40){
            throw new AgeOutOfBoundsException(age+"超出了范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GF{name = " + name + ", age = " + age + "}";
    }
}
