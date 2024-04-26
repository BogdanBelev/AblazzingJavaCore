package OOP.class_object.clone;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException{
        Agent agent = new Agent("Ms. Smith");

        Agent[] agents = make1000Clones(agent);

        int i = 0;
        for (Agent agent1 : agents) {
            i++;
            System.out.println(i);
            System.out.println(agent1);
        }
    }
    public static Agent[] make1000Clones (Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone(); // (Agent) - делает так, чтобы у переменной был тип данных Agent
        }


        return agents;
    }
}
