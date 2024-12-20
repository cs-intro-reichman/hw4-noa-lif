
public class KeywordsDetector {

    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market", //transform
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies", //leverage
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry", //distrupt
            "The team showed great Synergy in the last project", //synergy
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",//paradigm
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int numberOfSentences = sentences.length;
        String[] lowerSentences = new String[numberOfSentences];
        boolean[] index = new boolean[sentences.length];
        for (int i = 0; i < numberOfSentences; i++) {
            lowerSentences[i] = sentences[i].toLowerCase();
        }
        for (int i = 0; i < keywords.length; i++) {
            keywords[i] = keywords[i].toLowerCase();
        }
        for (int i = 0; i < numberOfSentences; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (MyString.contains(lowerSentences[i], keywords[j])) {
                    index[i] = true;
                }
            }
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] == true) {
                System.out.println(sentences[i]);
            }
        }
    }
}
