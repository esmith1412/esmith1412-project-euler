/* Starting in the top-left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom-right corner.

How many such routes are there through a 20×20 grid?
*/

public class LatticePaths {
  private String[] grid = new String[2];
  private int numRoutes;

  public LatticePaths(int num) {
    this.grid = {};
  }

  public int getNumRoutes() {
    return this.numRoutes;
  }

  public void setNumRoutes(int num) {
    this.numRoutes = num;
  }
}
