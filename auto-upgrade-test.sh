git remote set-url origin https://username:password@git.metro.digital/mip/microservices/testing-poc.git
var=$(git status -s pom.xml | wc -l)
if [[ $var > 0 ]]
then
	branch_name="feature/lib_update2"
	check_branch=$(git ls-remote --heads origin ${branch_name})
	if [[ -z ${check_branch} ]]
	then
		git checkout -b feature/lib_update2
		git add ./pom.xml
		git commit -m "library updates"
		git push -o merge_request.create -o merge_request.target=master origin feature/lib_update2
	else
		git push -d origin feature/lib_update2
		git checkout -b feature/lib_update2
		git add ./pom.xml
		git commit -m "library updates"
		git push -o merge_request.create -o merge_request.target=master origin feature/lib_update2
	fi
else
	echo dependencies are already updated
fi