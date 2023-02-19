import java.util.Random;

public class MagicBox <T>{
    private int maxCount;
    protected T[] items;
    public MagicBox(int maxCount) {
        this.maxCount = maxCount;
        this.items = (T[]) new Object[maxCount];
    }
    public boolean add(T item){
        for(int i = 0; i < items.length; i++){
            if(items[i] == null){
                items[i] = item;
                System.out.println(items[i]);
                return true;
            }
        }
        return false;
    }
    public T pick(){
        int count = 0;
        for (T item : items) {
            if(item == null){
                count ++;
            }
        }
        if(count != 0){
            throw new RuntimeException("Коробка не полна, осталось : " + count + " пустых ячеек.");
        }else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }

}
