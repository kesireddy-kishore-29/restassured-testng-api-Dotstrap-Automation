# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-a225c2d8-8db6-4f83-8145-c5d7cea6e2e3` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-733d27a7-7915-4b8b-bc3f-9eef29672c7f` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-e80f44db-3850-4434-90fb-6390da7087ae` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-f3735de8-11f1-476b-886e-26a6888369ac` |
| 5 | `POST /v1/conversations` | 400 | 11 | `qa-59e2f609-ae9a-4495-a9c8-7b4dd7753bb3` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-af7086cd-8ac5-49e4-a4b8-e6f83d89ddc3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ccdc1646-67cd-485e-9847-059a3eeca7a2` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-3ef20c84-85fa-46bf-92a0-9447564ab8b3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-32988999-0a1b-4a86-846c-8ecb32b340d3` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-248def52-997c-47c5-b668-ce16672cdae4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a225c2d8-8db6-4f83-8145-c5d7cea6e2e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a225c2d8-8db6-4f83-8145-c5d7cea6e2e3
Content-Type: application/json

--- request body ---
{"handle":"qa-4bd58d5282ad","displayName":"QA 4bd58d5282ad","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a225c2d8-8db6-4f83-8145-c5d7cea6e2e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Location: /v1/accounts/qa-4bd58d5282ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a67fc557-2797-4e3f-8b5b-3156acec3270","handle":"qa-4bd58d5282ad","displayName":"QA 4bd58d5282ad","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.281365893Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-733d27a7-7915-4b8b-bc3f-9eef29672c7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-733d27a7-7915-4b8b-bc3f-9eef29672c7f
Content-Type: application/json

--- request body ---
{"handle":"qa-b18ec3cd07db","displayName":"QA b18ec3cd07db","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-733d27a7-7915-4b8b-bc3f-9eef29672c7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-b18ec3cd07db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd4fc888-4a9e-45b2-bbd2-4a8a8b471abe","handle":"qa-b18ec3cd07db","displayName":"QA b18ec3cd07db","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.309690414Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e80f44db-3850-4434-90fb-6390da7087ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e80f44db-3850-4434-90fb-6390da7087ae
Content-Type: application/json

--- request body ---
{"handle":"qa-4bd58d5282ad","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e80f44db-3850-4434-90fb-6390da7087ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a67fc557-2797-4e3f-8b5b-3156acec3270"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f3735de8-11f1-476b-886e-26a6888369ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3735de8-11f1-476b-886e-26a6888369ac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b18ec3cd07db","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3735de8-11f1-476b-886e-26a6888369ac
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
Location: /v1/conversations/cnv_fe772208-1a8a-4cf8-a0ae-a26a4955579a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fe772208-1a8a-4cf8-a0ae-a26a4955579a","subject":"Error contract","status":"open","region":"eu","participants":["qa-4bd58d5282ad","qa-b18ec3cd07db"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.357666529Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-59e2f609-ae9a-4495-a9c8-7b4dd7753bb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59e2f609-ae9a-4495-a9c8-7b4dd7753bb3
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59e2f609-ae9a-4495-a9c8-7b4dd7753bb3
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-59e2f609-ae9a-4495-a9c8-7b4dd7753bb3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-af7086cd-8ac5-49e4-a4b8-e6f83d89ddc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af7086cd-8ac5-49e4-a4b8-e6f83d89ddc3
Content-Type: application/json

--- request body ---
{"handle":"qa-b18ec3cd07db","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-af7086cd-8ac5-49e4-a4b8-e6f83d89ddc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd4fc888-4a9e-45b2-bbd2-4a8a8b471abe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccdc1646-67cd-485e-9847-059a3eeca7a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccdc1646-67cd-485e-9847-059a3eeca7a2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccdc1646-67cd-485e-9847-059a3eeca7a2
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
correlation: qa-3ef20c84-85fa-46bf-92a0-9447564ab8b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ef20c84-85fa-46bf-92a0-9447564ab8b3
Content-Type: application/json

--- request body ---
{"handle":"qa-b18ec3cd07db","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ef20c84-85fa-46bf-92a0-9447564ab8b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ef20c84-85fa-46bf-92a0-9447564ab8b3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32988999-0a1b-4a86-846c-8ecb32b340d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32988999-0a1b-4a86-846c-8ecb32b340d3
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32988999-0a1b-4a86-846c-8ecb32b340d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-248def52-997c-47c5-b668-ce16672cdae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-248def52-997c-47c5-b668-ce16672cdae4
Content-Type: application/json

--- request body ---
{"handle":"qa-4bd58d5282ad","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-248def52-997c-47c5-b668-ce16672cdae4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-248def52-997c-47c5-b668-ce16672cdae4"}
```
