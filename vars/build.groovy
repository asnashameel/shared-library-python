def call() {
  sh '''
  python3 -m venv myenv
  source myenv/bin/activate
  pip install --upgrade pip
  pip install -r requirements.txt
  python3 -m pytest tests_main.py
  '''
}
