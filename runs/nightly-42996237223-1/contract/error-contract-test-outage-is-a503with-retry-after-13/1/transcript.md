# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-df0c13b4-97f2-437f-b147-792a66c7f7f1` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-9ac7ed26-69bb-494c-9565-e5ade7459971` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-83dc3d3f-3ce0-4784-9f66-6faf33b2ce05` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-600e5874-6bda-4e95-905b-6a09f1815ca5` |
| 5 | `GET /v1/credits/balance` | 503 | 10 | `qa-544c2f3d-787e-4d71-b318-77d7aa3fc91f` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-b775c130-0ad6-494d-8f9e-b3247da1f8a0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-429aabf0-4b9a-49ee-b7da-d756083a56c0` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-2d399943-c402-4ae0-8826-b8d3445218c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-afc08b0c-c21d-4fda-96c0-e33806883d2c` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-8b969e1f-2841-4e1a-ab4f-8b213045290b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df0c13b4-97f2-437f-b147-792a66c7f7f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df0c13b4-97f2-437f-b147-792a66c7f7f1
Content-Type: application/json

--- request body ---
{"handle":"qa-229a60c8ddc7","displayName":"QA 229a60c8ddc7","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-df0c13b4-97f2-437f-b147-792a66c7f7f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-229a60c8ddc7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27fd12f2-71dd-4e1f-991f-6fa01a82635d","handle":"qa-229a60c8ddc7","displayName":"QA 229a60c8ddc7","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.723558314Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ac7ed26-69bb-494c-9565-e5ade7459971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac7ed26-69bb-494c-9565-e5ade7459971
Content-Type: application/json

--- request body ---
{"handle":"qa-18fec1c58a56","displayName":"QA 18fec1c58a56","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ac7ed26-69bb-494c-9565-e5ade7459971
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-18fec1c58a56
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f38e7282-9d7c-4cbf-95d6-6096e928121c","handle":"qa-18fec1c58a56","displayName":"QA 18fec1c58a56","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.783101940Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-83dc3d3f-3ce0-4784-9f66-6faf33b2ce05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83dc3d3f-3ce0-4784-9f66-6faf33b2ce05
Content-Type: application/json

--- request body ---
{"handle":"qa-229a60c8ddc7","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-83dc3d3f-3ce0-4784-9f66-6faf33b2ce05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27fd12f2-71dd-4e1f-991f-6fa01a82635d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-600e5874-6bda-4e95-905b-6a09f1815ca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-600e5874-6bda-4e95-905b-6a09f1815ca5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-18fec1c58a56","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-600e5874-6bda-4e95-905b-6a09f1815ca5
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
Location: /v1/conversations/cnv_7227a635-2d9f-4209-8d25-e17336ec2508
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7227a635-2d9f-4209-8d25-e17336ec2508","subject":"Error contract","status":"open","region":"eu","participants":["qa-229a60c8ddc7","qa-18fec1c58a56"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.860751203Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-544c2f3d-787e-4d71-b318-77d7aa3fc91f

--- request headers ---
Accept: application/json
X-Fault-Key: 0067e39d-8c06-4bdd-b3e4-78b31981bbc1
X-Fault: unavailable-once
X-Correlation-Id: qa-544c2f3d-787e-4d71-b318-77d7aa3fc91f
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-544c2f3d-787e-4d71-b318-77d7aa3fc91f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-544c2f3d-787e-4d71-b318-77d7aa3fc91f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b775c130-0ad6-494d-8f9e-b3247da1f8a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b775c130-0ad6-494d-8f9e-b3247da1f8a0
Content-Type: application/json

--- request body ---
{"handle":"qa-18fec1c58a56","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b775c130-0ad6-494d-8f9e-b3247da1f8a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f38e7282-9d7c-4cbf-95d6-6096e928121c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-429aabf0-4b9a-49ee-b7da-d756083a56c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-429aabf0-4b9a-49ee-b7da-d756083a56c0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-429aabf0-4b9a-49ee-b7da-d756083a56c0
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
correlation: qa-2d399943-c402-4ae0-8826-b8d3445218c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d399943-c402-4ae0-8826-b8d3445218c5
Content-Type: application/json

--- request body ---
{"handle":"qa-18fec1c58a56","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d399943-c402-4ae0-8826-b8d3445218c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d399943-c402-4ae0-8826-b8d3445218c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afc08b0c-c21d-4fda-96c0-e33806883d2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc08b0c-c21d-4fda-96c0-e33806883d2c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afc08b0c-c21d-4fda-96c0-e33806883d2c
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
correlation: qa-8b969e1f-2841-4e1a-ab4f-8b213045290b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b969e1f-2841-4e1a-ab4f-8b213045290b
Content-Type: application/json

--- request body ---
{"handle":"qa-229a60c8ddc7","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b969e1f-2841-4e1a-ab4f-8b213045290b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b969e1f-2841-4e1a-ab4f-8b213045290b"}
```
