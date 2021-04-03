package ch.zhaw.iwi.devops.MathResultChecker;

public class MathResult {
    
    public boolean resultCheck(int factor1, int factor2){
        int result = factor1 * factor2;
        if (result == 150) {
            return true;
        } else {
            return false;
        }
    }
}
