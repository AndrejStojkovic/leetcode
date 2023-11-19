// 1342 - Number of Steps to Reduce a Number to Zero

int numberOfSteps(int num) {
    int steps = 0;
    while(num) {
        if(num & 1) num--;
        else num = num >> 1;
        steps++;
    }
    return steps;
}