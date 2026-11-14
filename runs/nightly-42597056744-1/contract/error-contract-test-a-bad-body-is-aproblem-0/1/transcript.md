# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-7a119eec-261e-486a-af5b-b70b1d858121` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-811eecd9-b644-4ad5-8bf7-ffe831213150` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-4a55d4ad-8ccc-4d58-acd7-ebc5b4922732` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-6b0a8bd7-ba2d-49a0-a927-1d9879c84546` |
| 5 | `POST /v1/auth/token` | 400 | 15 | `qa-2265541a-b05b-4d98-b5f8-d5e9b14cf2cc` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-02037345-9ddb-427e-9a46-036ff39c6d8c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-7ee68153-da09-40c4-a218-e6a3cb269dc7` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-3e5c999d-1fbb-4cd3-8f58-83f97624967b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-737f5496-199c-4377-af0b-345d9e3edeb0` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-8e523ccf-38b0-4b6e-a56c-79ae62b2fb2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7a119eec-261e-486a-af5b-b70b1d858121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a119eec-261e-486a-af5b-b70b1d858121
Content-Type: application/json

--- request body ---
{"handle":"qa-a52772ab95c3","displayName":"QA a52772ab95c3","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a119eec-261e-486a-af5b-b70b1d858121
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-a52772ab95c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0357062b-1eb1-4459-91c2-62bd80cc53df","handle":"qa-a52772ab95c3","displayName":"QA a52772ab95c3","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.835441865Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-811eecd9-b644-4ad5-8bf7-ffe831213150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811eecd9-b644-4ad5-8bf7-ffe831213150
Content-Type: application/json

--- request body ---
{"handle":"qa-34619aaffcb9","displayName":"QA 34619aaffcb9","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-811eecd9-b644-4ad5-8bf7-ffe831213150
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-34619aaffcb9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6a53d255-bb4b-409b-aa8b-dcf6d3704c4c","handle":"qa-34619aaffcb9","displayName":"QA 34619aaffcb9","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.886677531Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4a55d4ad-8ccc-4d58-acd7-ebc5b4922732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a55d4ad-8ccc-4d58-acd7-ebc5b4922732
Content-Type: application/json

--- request body ---
{"handle":"qa-a52772ab95c3","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a55d4ad-8ccc-4d58-acd7-ebc5b4922732
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0357062b-1eb1-4459-91c2-62bd80cc53df"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6b0a8bd7-ba2d-49a0-a927-1d9879c84546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b0a8bd7-ba2d-49a0-a927-1d9879c84546
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-34619aaffcb9","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b0a8bd7-ba2d-49a0-a927-1d9879c84546
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_7c0ce0fc-2bb9-421e-8e15-4ff5b1942a67
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7c0ce0fc-2bb9-421e-8e15-4ff5b1942a67","subject":"Error contract","status":"open","region":"eu","participants":["qa-a52772ab95c3","qa-34619aaffcb9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.917635362Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2265541a-b05b-4d98-b5f8-d5e9b14cf2cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2265541a-b05b-4d98-b5f8-d5e9b14cf2cc
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2265541a-b05b-4d98-b5f8-d5e9b14cf2cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-2265541a-b05b-4d98-b5f8-d5e9b14cf2cc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-02037345-9ddb-427e-9a46-036ff39c6d8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02037345-9ddb-427e-9a46-036ff39c6d8c
Content-Type: application/json

--- request body ---
{"handle":"qa-34619aaffcb9","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-02037345-9ddb-427e-9a46-036ff39c6d8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a53d255-bb4b-409b-aa8b-dcf6d3704c4c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ee68153-da09-40c4-a218-e6a3cb269dc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ee68153-da09-40c4-a218-e6a3cb269dc7
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ee68153-da09-40c4-a218-e6a3cb269dc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3e5c999d-1fbb-4cd3-8f58-83f97624967b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e5c999d-1fbb-4cd3-8f58-83f97624967b
Content-Type: application/json

--- request body ---
{"handle":"qa-34619aaffcb9","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e5c999d-1fbb-4cd3-8f58-83f97624967b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e5c999d-1fbb-4cd3-8f58-83f97624967b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-737f5496-199c-4377-af0b-345d9e3edeb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-737f5496-199c-4377-af0b-345d9e3edeb0
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-737f5496-199c-4377-af0b-345d9e3edeb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8e523ccf-38b0-4b6e-a56c-79ae62b2fb2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e523ccf-38b0-4b6e-a56c-79ae62b2fb2d
Content-Type: application/json

--- request body ---
{"handle":"qa-a52772ab95c3","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e523ccf-38b0-4b6e-a56c-79ae62b2fb2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e523ccf-38b0-4b6e-a56c-79ae62b2fb2d"}
```
