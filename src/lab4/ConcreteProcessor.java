package lab4;

/**Concrete implementation of request class
 *
 */
public class ConcreteProcessor implements Processor {
    private String name;
    private int level;
    private Processor nextProcessor;

    /**Constructor for a concrete processor
     * @param name
     * @param level
     */
    public ConcreteProcessor(String name,  int level) {
        this.name = name;
        this.level = level;
    }

    /**Return name of a processor object
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**Sets next processor
     *
     * @param nextProcessor
     */
    public void setNextProcessor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    /**Processing the request, checking the level, if tje level is too high, sends a request to the next processor
     *
     * @param request
     */
    @Override
    public void processRequest(Request request) {
        System.out.println(name + " of level " + level + " got the request of level " + request.getLevel());
        if (request.getLevel()<=level){
            switch(request.getType()){
                case ("GET"):{System.out.println("Request was processed by " +name+ ". Type: " + request.getType() + "; returned some data");break;}
                case ("POST"):{System.out.println("Request was processed by " +name+ ". Type: " + request.getType() + ". The web server accepted tha data");break;}
                default: System.out.println("Request was processed by " +name+ ". Type: " + request.getType());break;
            }
        }
        else{
            if(nextProcessor== null){ System.out.println("The request cannot be completed!");}
            else {
                System.out.println("Request was passed to a higher level");
                nextProcessor.processRequest(request);
            }
        }
    }
}

