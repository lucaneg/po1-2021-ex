import java.util.LinkedList;
import java.util.List;

class Item {
    private final String name;
    private final int price;
    private final int weight;

    public Item(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Item))
            return false;
        Item other = (Item) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }
}

class DuplicatesFinder {
    public static int numDuplicates(List<Item> items) {
        int duplicates = 0;
        List<Item> unique = new LinkedList<>();
        
        for (Item item : items) 
            if (!unique.contains(item))
                unique.add(item);
            else
                duplicates++;
        
        return duplicates;
        
        // bonus: sets remove duplicates!
        // java.util.Set<Item> set = new java.util.HashSet<>(items);
        // return items.size() - set.size();
    }
}