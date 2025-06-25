package nine;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] nums = new int [3]; // 0 1 2
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        System.out.println("1st Element: "+nums[0]);
        System.out.println("1st Element: "+nums[1]);
        System.out.println("1st Element: "+nums[2]);

        int [] marks = {90,80,95,85,80,90,89,78,90,90,90};

        int totalMarks=0;
        int avgMarks=0;

        // using for with dynamic
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
            // total score
            totalMarks+= marks[i]; // 0+90 --> 90+80 --> 170+95 ....... 
            // avgMarks = totalMarks/marks[i];
        }
        avgMarks = totalMarks/marks.length;
        System.out.println("Average Score: "+avgMarks);
        System.out.println("Total Marks: "+totalMarks);

    }
}
