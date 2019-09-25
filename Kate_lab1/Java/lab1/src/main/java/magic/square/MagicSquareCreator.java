package magic.square;

import util.data.types.SquareMatrix;

import java.util.Map;

public class MagicSquareCreator {
    public static int[][] generateMagicSquare(int side) {
        int[][] magic = new int[side][side];

        int row = side-1;
        int col = side/2;
        magic[row][col] = 1;

        for (int i = 2; i <= side*side; i++) {
            if (magic[(row + 1) % side][(col + 1) % side] == 0) {
                row = (row + 1) % side;
                col = (col + 1) % side;
            }
            else {
                row = (row - 1 + side) % side;
            }
            magic[row][col] = i;
        }

        return magic;
    }

    public static Map<Integer, Integer> generateMagicSquareAsMap(int side) {
        int[][] square = generateMagicSquare(side);
        return new SquareMatrix(square).convertToDict();
    }
}
