public class RevisedG {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char [] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] correctCounts = new int[answers.length][2];
        for (int i = 0; i < answers.length; i++) {
//            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if(answers[i][j] == keys[j]){
//                    correctCount++;
                    correctCounts[i][0] = i;
                    correctCounts[i][1]++;
                }
            }
//            System.out.println("Student " + i +"'s correct count is " + correctCount);
        }

        sort(correctCounts);

        for (int i = 0; i < correctCounts.length; i++) {
            System.out.println("Student " + correctCounts[i][0] +"'s correct count is " + correctCounts[i][1]);
        }
    }

    public static void sort(int[][] m){
        for (int i = 0; i < m.length; i++) {
            int minCount = m[i][1];
            int minPerson = m[i][0];
            int minIndex = i;
            for (int j = i+1; j < m.length; j++) {
                if(minCount > m[j][1]){
                    minCount = m[j][1];
                    minPerson = m[j][0];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                m[minIndex][1] = m[i][1];
                m[minPerson][0] = m[i][0];
                m[i][1] = minCount;
                m[i][0] = minPerson;
            }
        }
    }
}
