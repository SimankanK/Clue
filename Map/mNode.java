
// A Data Structure for queue used in BFS
public class mNode
{
    int x;
    int y;// The cordinates of a cell
    int dist; // cell's distance of from the source
 
    public mNode(int x, int y, int dist)
    {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
};
