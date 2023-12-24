package seminars;

class Sql {
    public static StringBuilder sql(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        String prepare = PARAMS.replace("{", "").replace("}", "").replace("\"", "");
        String name = prepare.split(",")[0].split(":")[1].trim();
        String country = prepare.split(",")[1].split(":")[1].trim();
        String city = prepare.split(",")[2].split(":")[1].trim();
        String age = prepare.split(",")[3].split(":")[1].trim();

        StringBuilder result = new StringBuilder(QUERY);

        if (!name.equals("null")) {
            result.append("name=").append("'").append(name).append("'");
        }

        if (!name.equals("null")) {
            result.append(" and");
        }
        if (!country.equals("null")) {
            result.append(" country=").append("'").append(country).append("'");
        }
        if (!country.equals("null")) {
            result.append(" and");
        }
        if (!city.equals("null")) {
            result.append(" city=").append("'").append(city).append("'");
        }
        if (!city.equals("null")) {
            result.append(" and");
        }
        if (!age.equals("null")) {
            result.append(" age=").append("'").append(age).append("'");
        }
        if (result.toString().endsWith("and")) {
            result.delete(result.length() - 3, result.length());
            return result;
        }
        return result;
    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static class Printer {
        public static void main(String[] args) {
            String QUERY = "";
            String PARAMS = "";

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                QUERY = "select * from students where ";
                PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
            } else {
                QUERY = args[0];
                PARAMS = args[1];
            }

            Sql sq = new Sql();
            System.out.println(sq.sql(QUERY, PARAMS));
        }
    }
}
