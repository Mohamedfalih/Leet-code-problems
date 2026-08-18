class Solution {

    static void backtrack(int col, int n, HashSet<Integer> rowSet, HashSet<Integer> colSet, HashSet<Integer> rdSet,
            HashSet<Integer> ldSet, List<List<String>> result, List<String> board) {

        //base condition

        if (col == n) {
            result.add(new ArrayList<>(board));
            return;
        }

        for (int row = 0; row < n; row++) {

            if (!rowSet.contains(row) && !colSet.contains(col)
                    && !ldSet.contains(row + col)
                    && !rdSet.contains(row - col)) {

                char[] arr = new char[n];
                Arrays.fill(arr, '.');
                arr[row] = 'Q';
                board.add(new String(arr));

                rowSet.add(row);
                colSet.add(col);
                rdSet.add(row - col);
                ldSet.add(row + col);

                backtrack(col + 1, n, rowSet, colSet, rdSet, ldSet, result, board);

                board.remove(board.size() - 1);

                rowSet.remove(row);
                colSet.remove(col);
                rdSet.remove(row - col);
                ldSet.remove(row + col);
            }

        }

    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        List<String> board = new ArrayList<>();

        backtrack(0, n, new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), result, board);

        return result;

    }
}