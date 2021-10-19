public interface FoodProduct implements Product{
default double calories()
{
    return weight()/100*calories_per_100mg;
}
}