package dataStructures.graph;

import java.util.Objects;

public class WeightedVertex<T extends Comparable> implements Comparable{
    private T vertex;
    private Double weight;

    public WeightedVertex(T vertex, Double weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public T getVertex() {
        return vertex;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{vertex=" + vertex +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeightedVertex<?> that)) return false;
        return Objects.equals(getVertex(), that.getVertex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVertex());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof WeightedVertex<?>) {
            WeightedVertex<?> obj2 = ((WeightedVertex<?>) o);
            int vertexComparison = this.vertex.compareTo(obj2.getVertex());
            int weightComparison = this.weight.compareTo(obj2.getWeight());
            if (vertexComparison == 0) {
                if (weightComparison < 0) {
                    obj2.weight = this.weight;
                } else {
                    this.weight = obj2.weight;
                }
                return 0;
            } else if (weightComparison == 0) {
                return vertexComparison;
            } else {
                return weightComparison;
            }
            /*if (this.vertex.compareTo(((WeightedVertex<?>) o).getVertex()) == 0) {
                return this.weight.compareTo(((WeightedVertex<?>) o).getWeight());
            } else if (this.vertex.compareTo(((WeightedVertex<?>) o).getVertex())!= 0
                    && this.weight.compareTo(((WeightedVertex<?>) o).getWeight()) == 0) {
                return this.vertex.compareTo(((WeightedVertex<?>) o).getVertex());
            } else {
                return this.weight.compareTo(((WeightedVertex<?>) o).getWeight());
            }*/
        }
        return -1;
    }
}
