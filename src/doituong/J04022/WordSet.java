package doituong.J04022;

import java.util.*;

public class WordSet {
    private String strings;

    public WordSet(String strings) {
        this.strings = strings;
    }

    public WordSet union(WordSet set) {
        String[] s1 = this.strings.toLowerCase(Locale.ROOT).split(" ");
        String[] s2 = set.getStrings().toLowerCase(Locale.ROOT).split(" ");
        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(s2));
        set1.addAll(Arrays.asList(s1));
        TreeSet<String> treeSet = new TreeSet<>(set1);
        return new WordSet(treeSet.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
        );

    }

    public WordSet intersection(WordSet set) {
        String[] s1 = this.strings.toLowerCase(Locale.ROOT).split(" ");
        String[] s2 = set.getStrings().toLowerCase(Locale.ROOT).split(" ");
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (String s3 : s1) {
            for (String s4 : s2) {
                if (s3.equals(s4)) {
                    list.add(s3);
                }
            }
        }
        Collections.sort(list);
        list.forEach(s -> builder.append(s).append(" "));
        return new WordSet(builder.toString().trim());

    }


    public String getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return strings;
    }
}
