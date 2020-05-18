teams = [ 'India', 'Pakistan', 'Srilanka', 'Australia', 'England', 'South Africa', 'West Indies', 'New Zealand']
for houseA in teams:
    for houseB in teams:
        if houseA != houseB:
            print(houseA+' vs '+houseB)