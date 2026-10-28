class Solution {
    public boolean checkIfPangram(String sentence) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        boolean contains = Arrays.stream(alphabet).allMatch(sentence::contains);
        return contains;
    }
}
