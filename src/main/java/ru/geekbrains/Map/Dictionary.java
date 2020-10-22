package ru.geekbrains.Map;

public class Dictionary {

    private final Pair[] pairs;

    public Dictionary(int size) {
        this.pairs = new Pair[size];
    }

    public String get(String key) {
        String value = null;
        for (Pair pair : pairs) {
            if (pair != null) {
                if (pair.getKey().equals(key)) {
                    value = pair.getValue();
                }
            }
        }
        if (value == null) value = "Такого ключа нет в словаре";
        return value;
    }

    public void put(String key, String value) {
        boolean isFull = true;
        boolean keyIsExist = false;
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] != null) {
                if (pairs[i].getKey().equals(key)) {
                    pairs[i] = new Pair(key, value);
                    keyIsExist = true;
                    isFull = false;
                    break;
                }
            }
        }
        if (!keyIsExist) {
            for (int i = 0; i < pairs.length; i++) {
                if (pairs[i] == null) {
                    pairs[i] = new Pair(key, value);
                    isFull = false;
                    break;
                }
            }
        }
        if (isFull) System.out.println("словарь заполнен");
    }

    public void delete(String key) {
        boolean isExist = false;
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] != null) {
                if (pairs[i].getKey().equals(key)) {
                    pairs[i] = null;
                    isExist = true;
                    break;
                }
            }
        }
        if (!isExist) System.out.println("Такого ключа нет в словаре...");
    }

    private static class Pair {
        private final String key;

        private final String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

    }

    public static void main(String[] args) {
        Dictionary d = new Dictionary(10);
        d.put("12", "12");
        d.put("123", "123");
        d.put("1234", "1234");
        d.put("12345", "12345");
        d.put("123456", "123456");
        d.put("1234567", "1234567");
        d.put("1234567", "12345678");
        d.put("1234567", "1234567");
        d.put("1234567", "1234567");
        d.put("1234567", "1234567");
        d.put("1234567", "1234567");
        d.put("1234567", "1234567");
        d.put("1234567", "1234567");
        d.put("1234567", "12345679192193");
        System.out.println(d.get("12"));
        System.out.println(d.get("123"));
        System.out.println(d.get("1234"));
        System.out.println(d.get("12345"));
        System.out.println(d.get("123456"));
        System.out.println(d.get("1234567"));


        d.delete("1234");
        System.out.println(d.get("1234"));

        d.delete("123455");


    }
}