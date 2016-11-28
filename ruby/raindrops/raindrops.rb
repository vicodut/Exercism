class Raindrops
  def self.convert(drops)
    sound = ""
    sound << "Pling" if drops % 3 == 0
    sound << "Plang" if drops % 5 == 0
    sound << "Plong" if drops % 7 == 0

    sound == "" ? drops.to_s : sound
  end
end

class BookKeeping
  VERSION = 3
end
