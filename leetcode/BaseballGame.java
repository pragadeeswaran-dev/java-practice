class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String operation : operations) {
            if (operation.equals("C")) {
                list.remove(list.size() - 1);
            } else if (operation.equals("D")) {
                list.add((list.get(list.size() - 1)) * 2);
            } else if (operation.equals("+")) {
                list.add((list.get(list.size() - 1)) + (list.get(list.size() - 2)));
            } else {
                list.add(Integer.parseInt(operation));
            }
        }
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }
}
