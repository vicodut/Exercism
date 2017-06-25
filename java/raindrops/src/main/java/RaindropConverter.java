class RaindropConverter {

    String convert(int number) {
        StringBuilder raindrop = new StringBuilder();

        if (number % 3 == 0)
        {
            raindrop.append("Pling");
        }
        if (number % 5 == 0)
        {
            raindrop.append("Plang");
        }
        if (number % 7 == 0)
        {
            raindrop.append("Plong");
        }
        if (raindrop.length() == 0)
        {
            return Integer.toString(number);
        }
        return raindrop.toString();
    }

}
