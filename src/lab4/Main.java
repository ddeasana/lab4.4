package lab4;

public class Main {
    public static void main(String[] args) {

    Request request1 = new Request( 2 );
    Request getRequest = new Request("GET");
    Request postRequest = new Request("POST");

    ConcreteProcessor processor1 = new ConcreteProcessor("first processor",1);
    ConcreteProcessor processor2 = new ConcreteProcessor("second processor",2);
    ConcreteProcessor processor3 = new ConcreteProcessor("third processor",3);

    processor1.setNextProcessor(processor2);
    processor2.setNextProcessor(processor3);

        System.out.println("-------------------------------------------------------");
    processor1.processRequest(request1);
        System.out.println("-------------------------------------------------------");
    processor1.processRequest(getRequest);
        System.out.println("-------------------------------------------------------");
    processor1.processRequest(postRequest);
        System.out.println("-------------------------------------------------------");

    ConcreteProcessor processor4 = new ConcreteProcessor("fourth processor", 3);
    processor1.setNextProcessor(processor4);
    processor4.setNextProcessor(processor2);
    processor1.processRequest(request1);



























//            @Override
//            public void processRequest(Request request) {
//                if (request.getType().equalsIgnoreCase("GET")) {
//                    // Process GET request
//                } else if (nextProcessor != null) {
//                    nextProcessor.processRequest(request);
//                } else {
//                    // No processor able to handle this request
//                }
//            }
//        }


//        public class RequestProcessorChain {
//            private Processor firstProcessor;
//
//            public void addProcessor(Processor processor) {
//                if (firstProcessor == null) {
//                    firstProcessor = processor;
//                } else {
//                    Processor currentProcessor = firstProcessor;
//                    while (currentProcessor.getNextProcessor() != null) {
//                        currentProcessor = currentProcessor.getNextProcessor();
//                    }
//                    currentProcessor.setNextProcessor(processor);
//                }
//            }
//
//            public void process(Request request) {
//                if (firstProcessor != null) {
//                    firstProcessor.processRequest(request);
//                } else {
//                    // No processors available
//                }
//            }
//        }
    }
}