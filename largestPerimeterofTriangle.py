from tkinter.tix import Tree


nums=[1,2,2] # this array can be of any length

nums.sort(reverse=True)
maxi=0
for i in range(len(nums)-2):
    if(nums[i]<nums[i+1]+nums[i+2]):
        maxi=max(maxi,nums[i]+nums[i+1]+nums[i+2])
print(maxi)