package ch.zhaw.iwi.devops.primeNumber;

public class PrimeChecker {
    public boolean checker(int i) {
        boolean isPrime = true;
        
        for (int j = 2; j<= i/2; j++) {
            if ((i % j) == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
        }
    }



// public class PrimeChecker {
//     public boolean checker(int i) {
//         boolean isPrime = true;
        
//         if(i <= 1) 
//         {
//             isPrime = false;
//             return isPrime;
//         }
//         else {
//             for (int j = 2; j<= i/2; j++) {
//                 if ((i % j) == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         return isPrime;
//         }
//     }
// }

