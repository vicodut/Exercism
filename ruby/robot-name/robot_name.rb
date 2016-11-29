class Robot
  attr_reader :name
  ALPHABET = ('AA'..'ZZ').to_a
  NUMERALS = 0..999
  @@names = []

  def initialize
    reset
  end

  def reset
    @name = random_name
  end

  private

  def random_name
    name = format '%s%03i', ALPHABET.sample, rand(NUMERALS)
    while exist?(name) do
      name = format '%s%03i', ALPHABET.sample, rand(NUMERALS)
    end
    @@names.push(name).last
  end
  
  private
  def exist?(new_name)
    @@names.include?(new_name) ? true : false
  end
end
class BookKeeping
  VERSION = 2
end
