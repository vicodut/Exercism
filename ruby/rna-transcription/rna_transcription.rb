class Complement
  def self.of_dna(dna)
    /[^CGAT]/ =~ dna ? '' : dna.tr('CGAT', 'GCUA')
  end
end

class BookKeeping
  VERSION = 4
end
