from flask import (abort, Flask, jsonify, request)


app = Flask(__name__)


@app.route('/', methods=['GET'])
def root():
    return jsonify({})


if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=8001)
