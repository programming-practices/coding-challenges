package com.trl.codingchallenges.a2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

import static java.lang.String.format;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<Holder, Integer> map = new LinkedHashMap<>();
        for (String letter : lstOf1stLetter) {
            for (String item : lstOfArt) {
                String[] strings = item.split(" ");

                String arts = strings[0];
                Integer amount = Integer.parseInt(strings[1]);

                if (arts.contains(letter)) {
                    Holder holder = new Holder(letter, arts.indexOf(letter));
                    if (map.containsKey(holder)) {
                        Integer quantity = map.get(holder);
                        map.put(holder, quantity + amount);
                    } else {
                        map.put(holder, amount);
                    }
                }
            }
        }

        String result = "";

        Map<String, Integer> mapResult = new LinkedHashMap<>();

        for (Map.Entry<Holder, Integer> entry : map.entrySet()) {
            String letter = entry.getKey().getLetter();
            if (mapResult.containsKey(letter)) {
                if (entry.getValue() > mapResult.get(letter)) {
                    mapResult.put(letter, entry.getValue());
                }
            } else {
                mapResult.put(letter, entry.getValue());
            }

        }

        for (Map.Entry<String, Integer> entry : mapResult.entrySet()) {
            if (result.isEmpty()) {
                result = result.concat(format("(%s : %d)", entry.getKey(), entry.getValue()));
            } else {
                result = result.concat(format(" - (%s : %d)", entry.getKey(), entry.getValue()));
            }

        }

        return result;
    }

    static class Holder {

        private String letter;
        private Integer index;

        public Holder() {
        }

        public Holder(String letter, Integer index) {
            this.letter = letter;
            this.index = index;
        }

        public String getLetter() {
            return letter;
        }

        public void setLetter(String letter) {
            this.letter = letter;
        }

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Holder)) return false;
            Holder holder = (Holder) o;
            return Objects.equals(letter, holder.letter) && Objects.equals(index, holder.index);
        }

        @Override
        public int hashCode() {
            return Objects.hash(letter, index);
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Holder.class.getSimpleName() + "[", "]")
                    .add("letter='" + letter + "'")
                    .add("index=" + index)
                    .toString();
        }
    }

}


