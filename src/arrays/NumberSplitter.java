package arrays;

public class NumberSplitter {

public int addDigits(int num){
    int tens = num/10;
    int unit = num%10;
    return tens + unit;
}

}
