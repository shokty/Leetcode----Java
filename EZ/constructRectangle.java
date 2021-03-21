package EZ;

public class constructRectangle {
    public static void main(String[] args) {

    }
    public int[] constructRectangle(int area) {
        int rootarea = (int) Math.sqrt(area);
        for (int i = rootarea; i > 0; i--) {
            if (area%rootarea == 0)
                return new int[] {area/rootarea,rootarea};
            rootarea--;
        }
        return new int[] {area,1};
    }

}
