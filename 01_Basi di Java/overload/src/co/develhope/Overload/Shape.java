package co.develhope.Overload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    Shape(){
        this.shapeName = "Undefined shape";
        System.out.println("Creatign a shape!");
    }

    Shape(double radius){
        this.shapeName = "circle";
        System.out.println("Creating a " + shapeName + " has a radius " + radius);
    }

    Shape(int edges, double edgeLength){
        this.shapeName = "square";
        this.numberOfEdges = edges;
        System.out.println("Creating a " + shapeName + "has edges " + edges + "and edges length"+ edgeLength);
    }

    Shape(int edges, double e1, double e2){
        this.shapeName = "rectangle";
        this.numberOfEdges = edges;
        System.out.println("Creating a " + shapeName + "has edges " + edges + e1 + e2);
    }

    Shape(int edges, double e1, double e2, double e3){
        this.shapeName = "triangle";
        this.numberOfEdges = edges;
        System.out.println("Creating a " + shapeName + " with edges " + e1 + " , " + e2 + " and " + e3);
    }

    public String getShapeDetails(){
        return "shape: " + shapeName + "| number of edges: " + numberOfEdges;
    }
}
