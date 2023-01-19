package strings;

public class MakeString {
    public static void main(String[] args) {
        char c[] = {'J', 'a', 'v', 'a'};

        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}


class getCharsDemo {
    public static void main(String[] args) {
        String s = "Это демонстрация метода getChars().";
        int start = 4;
        int end = 8;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println("str: " + buf);
    }
}


class equalsDemo {
    public static void main(String[] args) {
        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = "Hello";
        String s4 = "ПРИВЕТ";
    }
}


class SortString {
    static String arr[] = {
            "Now", "add", "lime", "fpr", "ghf"
    };

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] .compareTo(arr[j]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}


class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "ALpha", "Beta", "Gamma");
        System.out.println(result);
    }
}
