package Logic;
public class Randomiser {
    public static int getRandomInteger(int max){
        return getRandomInteger(1 ,max);
    }
    public static int getRandomInteger(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
