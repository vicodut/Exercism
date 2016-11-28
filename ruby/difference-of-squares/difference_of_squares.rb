class Squares
  def initialize(arg)
    @nbr = arg
  end

  def square_of_sum
    (0..@nbr).inject(:+)**2
  end

  def sum_of_squares
    (0..@nbr).inject -> (sum, x) { sum + x**2 }
  end

  def difference
    square_of_sum - sum_of_squares
  end
end
class BookKeeping
  VERSION = 3
end
