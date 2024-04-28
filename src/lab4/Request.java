package lab4;

/**Request class representing HTTP request
 *
 */
public class Request {
        private String type; // GET, POST, etc.
        private int level;

    /**Constructor for a request, using type
     *
     * @param type
     */
    public Request(String type){
        this.type = type;
        switch(type){
            case ("GET"):{this.level = 1;break;}
            case ("POST"):{this.level = 3;break;}
            default: System.out.println("Unknown type, assumed to be level 1 "); this.level = 1;break;
        }
    }

    /**Constructor for a request, using level
     *
     * @param level
     */
    public Request(int level){
        this.level = level;
        this.type = "not specified";
    }

    /**Returns String type of request
     *
     * @return
     */
    public String getType(){return type;}

    /**Returns int level of request
     *
     * @return
     */
    public int getLevel(){ return level;}
}
