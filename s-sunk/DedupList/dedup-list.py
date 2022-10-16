number_list = [1, 3, 2, 3, 8, 5, 7, 5, 4]
print("Initial integer list before removing duplicate: ")
print(number_list)

print("Updated integer list after removing duplicate: ")
dedup_list = []
for num in number_list:
    if num not in dedup_list:
        dedup_list.append(num)
print(dedup_list)
