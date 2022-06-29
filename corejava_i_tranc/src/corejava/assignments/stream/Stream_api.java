package corejava.assignments.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Fruit {
	private String name;
	private int calories;
	private int price;
	private String color;

	public Fruit() {
		super();

	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}

}

class News {
	private int newsld;
	private String postedByUser;
	private String commentByUser;
	private String comment;

	public News() {
		super();
	}

	public News(int newsld, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsld = newsld;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsld() {
		return newsld;
	}

	public void setNewsld(int newsld) {
		this.newsld = newsld;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsld=" + newsld + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}

}

class Trader {
	private String name;
	private String city;

	public Trader() {
		super();

	}

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

}

class Transaction {
	private Trader trader;
	private int year;
	private int value;

	public Transaction() {
		super();

	}

	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}

public class Stream_api {

	public static void main(String[] args) {
		List<Fruit> al = new ArrayList<Fruit>();
		al.add(new Fruit("apple", 200, 220, "yellow"));
		al.add(new Fruit("orange", 100, 120, "orange"));
		al.add(new Fruit("pinapple", 150, 220, "yellow"));
		al.add(new Fruit("apple", 250, 220, "red"));
		al.add(new Fruit("apple", 50, 120, "red"));
		al.add(new Fruit("graps", 70, 220, "aqua"));
		al.add(new Fruit("pinapple", 100, 220, "red"));

		List<Fruit> ft = al.stream().filter(b -> b.getCalories() < 100).collect(Collectors.toList());
		System.out.println("Calories<100");
		for (int index = ft.size() - 1; index >= 0; index--) {
			System.out.println(ft.get(index).getName());
		}

		List<String> f = al.stream().map(b -> b.getColor()).distinct().sorted().collect(Collectors.toList());
		System.out.println("fruits with different colour");
		System.out.println(f);

		List<Fruit> f1 = al.stream().filter(b -> b.getColor().equals("red"))
				.sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		System.out.println("fruits with red colour");
		System.out.println(f1);

		List<News> news = new ArrayList<News>();
		news.add(new News(12, "User1", "This is good", "Time spent well"));
		news.add(new News(12, "User2", "Well done budget", "Good Presentation"));
		news.add(new News(12, "User3", "Very well done", "This was amazing"));
		news.add(new News(13, "User1", "This was informational budget", "Liked the author"));

		System.out.println("comments for newsid");
		news.stream().max(Comparator.comparing(News::getCommentByUser).reversed()).ifPresent(System.out::println);

		Long bd = news.stream().filter(b -> b.getCommentByUser().contains("budget")).collect(Collectors.counting());
		System.out.println(" number of comments which have budget word");
		System.out.println(bd);

		Map<String, Long> user = news.stream()
				.collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
		System.out.println(" number of users");
		System.out.println(user);

		List<Trader> trade = new ArrayList<Trader>();
		Trader t1 = new Trader("aaa", "B'lore");
		Trader t2 = new Trader("bbb", "Mysore");
		Trader t3 = new Trader("yyy", "B'lore");
		Trader t4 = new Trader("ttt", "Mysore");
		Trader t5 = new Trader("ooo", "pune");
		Trader t6 = new Trader("nnn", "pune");
		trade.add(t1);
		trade.add(t2);
		trade.add(t3);
		trade.add(t4);
		trade.add(t5);
		trade.add(t6);

		List<Transaction> trans = new ArrayList<Transaction>();
		trans.add(new Transaction(t1, 2011, 2000));
		trans.add(new Transaction(t1, 2011, 100));
		trans.add(new Transaction(t2, 2012, 1000));
		trans.add(new Transaction(t3, 2011, 100));
		trans.add(new Transaction(t4, 2012, 1000));
		trans.add(new Transaction(t5, 2011, 10));
		trans.add(new Transaction(t6, 2012, 1000));

		List<Transaction> tr = trans.stream().filter(b -> b.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println("transaction in  year 2011");
		System.out.println(tr);

		List<String> tr1 = trans.stream().map(b -> b.getTrader().getCity()).distinct().collect(Collectors.toList());
		System.out.println("transac");
		System.out.println(tr1);

		List<String> tr2 = trans.stream().filter(b -> b.getTrader().getCity().equals("pune"))
				.map(b -> b.getTrader().getName()).sorted().collect(Collectors.toList());
		System.out.println(tr2);

		List<String> trad = trade.stream().map(b -> b.getName()).sorted().collect(Collectors.toList());
		System.out.println(trad);

		Optional<Trader> trad1 = trade.stream().filter(b -> b.getCity().equals("indore")).findAny();

		if (trad1.isEmpty()) {
			System.out.println("none in indore");
		} else {
			System.out.println(trad1);
		}

		List<Integer> tr3 = trans.stream().filter(b -> b.getTrader().getCity().equals("B'lore")).map(b -> b.getValue())
				.collect(Collectors.toList());
		System.out.println(tr3);

		Optional<Transaction> tr4 = trans.stream().max(Comparator.comparing(Transaction::getValue));
		System.out.println(tr4);

		Optional<Transaction> tr5 = trans.stream().min(Comparator.comparing(Transaction::getValue));
		System.out.println(tr5);

	}

}
