
import os
import sys
import shutil

version_filename = input("Version: ") + ".json"

try:
    version_file = open("indexes/" + version_filename, 'r', encoding='UTF-8')
except FileNotFoundError as err:
    print(err)
    sys.exit(1)

try:
    os.makedirs("originalLangs", exist_ok=True)
except OSError as err:
    print(err)
    sys.exit(1)

for line in version_file:
    if line.__contains__("minecraft/lang/"):
        lang_name = line.replace("minecraft/lang/", "").replace("\"", "").replace(":", "").replace("{", "").strip()
        lang_hash = next(version_file).replace("hash", "").replace(",", "").replace(":", "").replace("\"", "").strip()
        try:
            shutil.copyfile("objects/" + lang_hash[:2] + "/" + lang_hash, "originalLangs/" + lang_name)
            print("Copied " + lang_name + " from " + lang_hash[:2] + "/" + lang_hash)
        except OSError as err:
            print(lang_name + ":")
            print(err)
version_file.close()
keep = '    "item.minecraft.', '    "potion.', '    "entity.minecraft.', '    "enchantment.'
try:
    os.makedirs("optimizedLangs", exist_ok=True)
except OSError as err:
    print("?" + err)
    sys.exit(1)

for lang_filename2 in os.listdir('originalLangs'):

    version_file2 = open("originalLangs/" + lang_filename2, 'r', encoding='UTF-8')
    simplified_version_file = open("optimizedLangs/" + lang_filename2.replace(".json", ".lang"), 'w', encoding='UTF-8')

    for line in version_file2:
        if line.startswith(keep):
            simplified_version_file.write(line.replace('    "', '').replace('": "','=').replace('",', ''))
			
    print("Processed " + lang_filename2)
    version_file2.close()
    simplified_version_file.close()
