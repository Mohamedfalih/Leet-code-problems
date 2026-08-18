class Solution {

    static int backtrack(int col, int n,
                            HashSet<Integer> rowSet,
                            HashSet<Integer> colSet,
                            HashSet<Integer> rdSet,
                            HashSet<Integer> ldSet,
                            List<String> board) {

        //base condition

        if (col == n) {
            return 1;
        }

        int possible = 0;

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

                possible += backtrack(col + 1, n, rowSet, colSet, rdSet, ldSet, board);

                board.remove(board.size() - 1);

                rowSet.remove(row);
                colSet.remove(col);
                rdSet.remove(row - col);
                ldSet.remove(row + col);
            }

        }

        return possible;

    }

    public int totalNQueens(int n) {

        List<String> board = new ArrayList<>();

        return backtrack(0, n, new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), board);

    }
}