package Stuff;
public class Player extends Object {
    
    private String name;
    private int age;
    private boolean isHappy;

    private static int playerCount = 0;
        
        public Player(String name, int age, boolean isHappy){
            this.name = name;
            this.age = age;
            this.isHappy = isHappy;
            playerCount ++;
        }
    
        public Player(){
            this("jeff", 99, true);
        }
    
        public String getName(){
            return name;
        }
    
        public int getAge(){
            return age;
        }
    
        public boolean getIsHappy(){
            return isHappy;
        }
    
        public void setName(String name){
            this.name = name;
        }
    
        public void setAge(int age){
            this.age = age;
        }
    
        public void setisHappy(boolean isHappy){
            this.isHappy = isHappy;
        }
    
        public static int getTotalPlayers()
        {
            return playerCount;
        }

        public void thisIsAMethod()
        {
            playerCount += 5;
            System.out.println("thisIsAMethod just added the palyer count by 5");
        }
    
    @Override
    public String toString() {
        return name + " is " + age + " years old and is " + (isHappy? " happy " : " not happy ");
    }
}
