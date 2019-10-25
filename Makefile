clean:
	rm -rf resources/public/js

core:
	clj -m figwheel.main --build-once core
