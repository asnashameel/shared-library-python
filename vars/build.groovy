def call() {
  sh '''
  python3 -m venv myenv
  . myenv/bin/activate
  python3 -m pip install --upgrade pip
  pip install -r requirements.txt
  python3 -m pytest tests_main.py
  '''
}
