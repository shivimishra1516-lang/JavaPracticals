interface AnswerBox {

    void evaluateAnswer();
}

class MCQBox implements AnswerBox {

    public void evaluateAnswer() {
        System.out.println("MCQ answer is correct");
    }
}

class CodingBox implements AnswerBox {

    public void evaluateAnswer() {
        System.out.println("Coding answer is correct");
    }
}

class DescriptiveBox implements AnswerBox {

    public void evaluateAnswer() {
        System.out.println("Descriptive answer is evaluated");
    }
}

public class Practical15 {

    public static void main(String[] args) {

        AnswerBox q;

        q = new MCQBox();
        q.evaluateAnswer();

        q = new CodingBox();
        q.evaluateAnswer();

        q = new DescriptiveBox();
        q.evaluateAnswer();
    }
}