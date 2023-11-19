// 1342 - Number of Steps to Reduce a Number to Zero

public int numberOfSteps(int num) {
    int steps = 0;
    while(num != 0) {
        if((num & 1) != 0) num--;
        else num = num >> 1;
        steps++;
    }
    return steps;
}